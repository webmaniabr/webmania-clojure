(ns webmania.author
 (:require [clojure.test :refer :all] [webmania.core :as sdk] [webmania.operations :as api] [webmania.value :as value] [webmania.models.api1fiscal :as fiscal] [webmania.helpers :as helpers] [clojure.string :as str] [clojure.edn :as edn] [clojure.java.io :as io])
 (:import [com.webmania.sdk ClojureFixture Json JsonValue ApiException ApiException$Kind ApiResult Contract Download ClientConfig]
          [com.fasterxml.jackson.databind JsonNode]
          [java.nio.file Files Path] [java.math BigDecimal BigInteger] [java.util.concurrent.atomic AtomicReference AtomicBoolean] [java.time Duration]))
(defn fixture-data [] (Json/parse (Files/readAllBytes (Path/of "/input-fixtures/operation-fixtures.json" (make-array String 0)))))
(defn clj-data [^JsonNode n]
 (cond (.isObject n) (into {} (for [field (.properties n)] [(.getKey field) (clj-data (.getValue field))]))
       (.isArray n) (mapv clj-data n) (.isNull n) nil (.isTextual n) (.textValue n) (.isBoolean n) (.booleanValue n)
       (.isIntegralNumber n) (.bigIntegerValue n) (.isNumber n) (.decimalValue n) :else (throw (Exception. "Unknown fixture type"))))
(defn company [] (sdk/company-credentials "clj-key" "clj-secret" "clj-access" "clj-access-secret"))
(defn client [scope metadata mode config]
 (let [security (str (.path metadata "security"))]
  (case scope
   "nfe" (sdk/nfe-client (company) config)
   "monitor" (sdk/monitor-client (sdk/monitor-credentials "clj-monitor") config)
   "emitter" (sdk/emitter-client (sdk/issuer-credentials "clj-issuer") config)
   "reseller" (sdk/reseller-client (sdk/reseller-credentials "clj-key" "clj-secret" "clj-access" "clj-access-secret") config)
   "nfe-files" (sdk/nfe-files-client (cond (= mode :token) (sdk/document-token "clj-document+token/=") (or (= mode :anonymous) (.isEmpty (.path metadata "security"))) (sdk/anonymous-file) :else (company)) config)
   "emitter-files" (sdk/emitter-files-client (cond (= mode :token) (sdk/document-token "clj-document+token/=") (or (= mode :anonymous) (.isEmpty (.path metadata "security"))) (sdk/anonymous-file) :else (sdk/file-company-credentials "clj-files")) config))))
(defn sdk-error [f] (try (f) (throw (Exception. "Expected SDK failure")) (catch ApiException e e)))
(defn operation-map [] (.path (Json/parse (Files/readAllBytes (Path/of "/input-fixtures/operation-map.json" (make-array String 0)))) "operations"))
(defn matrix [tls]
 (let [fixtures (into {} (for [x (fixture-data)] [(.asText (.path x "id")) x]))]
  (with-open [server (ClojureFixture. tls)]
   (doseq [entry (operation-map)]
    (let [id (.asText (.path entry "id")) metadata (.metadata server id) spec (.schema server id) fixture (get fixtures id)
          security (str (.path metadata "security"))
          modes (cond-> [:default] (or (.contains security "DocumentToken") (.contains security "FiscalDocumentLinkToken")) (conj :token)
                  (and (.asBoolean (.path metadata "binary")) (or (.has (.path spec "x-auth-origin-policy") "unauthenticated") (.contains security "{}"))) (conj :anonymous))]
     (doseq [mode modes]
      (.success server id (Json/bytes (.path fixture "response")))
      (with-open [c (client (.asText (.path entry "scope")) metadata mode (.config server (.asText (.path metadata "module"))))]
       (let [f (ns-resolve 'webmania.operations (symbol (.asText (.path entry "function"))))
             request (value/model (.asText (.path entry "request_class")) (clj-data (.path fixture "input"))) before (.count server) sockets (.connections server)]
        (if-not (.asBoolean (.path entry "enabled"))
         (do (is (= ApiException$Kind/CAPABILITY_DISABLED (.kind (sdk-error #(f c request))))) (is (= before (.count server))) (is (= sockets (.connections server))))
         (let [result (f c request) sent (.last server)]
          (is (instance? ApiResult result)) (is (= (inc before) (.count server)))
          (is (= (.asText (.path metadata "method")) (get sent "method")))
          (is (= (inc sockets) (.connections server)))
          (is (= (.responseStatus server) (.status result)))
          (let [input (.path fixture "input") parameters (.path spec "parameters")
                route (reduce (fn [path param] (if (= "path" (.asText (.path param "in"))) (str/replace path (str "{" (.asText (.path param "name")) "}") (.asText (.path input (.asText (.path param "name"))))) path)) (.asText (.path metadata "path")) parameters)
                target (get sent "target")
                actual-query (if-let [query (second (str/split target #"\?" 2))] (sort (for [pair (str/split query #"&") :let [[k v] (str/split pair #"=" 2)]] [(java.net.URLDecoder/decode k "UTF-8") (java.net.URLDecoder/decode (or v "") "UTF-8")])) [])
                expected-query (sort (concat (mapcat (fn [param] (let [name (.asText (.path param "name")) val (.get input name)] (when (and (= "query" (.asText (.path param "in"))) val (not (.isNull val))) (if (.isArray val) (map (fn [x] [name (.asText x)]) val) [[name (.asText val)]])))) parameters) (when (= mode :token) [["token" "clj-document+token/="]])))
                expected-headers (cond (or (= mode :token) (= mode :anonymous) (.isEmpty (.path metadata "security"))) {}
                  (or (str/includes? security "ConsumerKey") (str/includes? security "Reseller")) {"x-consumer-key" "clj-key" "x-consumer-secret" "clj-secret" "x-access-token" "clj-access" "x-access-token-secret" "clj-access-secret"}
                  (= "monitor" (.asText (.path entry "scope"))) {"authorization" "Bearer clj-monitor"}
                  (= "emitter" (.asText (.path entry "scope"))) {"authorization" "Bearer clj-issuer"}
                  :else {"authorization" "Bearer clj-files"})
                credential-headers (into {} (filter (fn [[key val]] (or (= key "authorization") (str/starts-with? key "x-consumer-") (str/starts-with? key "x-access-"))) (get sent "headers")))]
           (is (= route (first (str/split target #"\?" 2))))
           (is (= expected-query actual-query)) (is (= expected-headers credential-headers))
           (is (= (= mode :token) (str/includes? target "token=clj-document%2Btoken%2F%3D")))
           (is (java.util.Arrays/equals ^bytes (get sent "body") ^bytes (if (.has input "body") (Json/bytes (.path (.toJson request) "body")) (byte-array 0))) id)
           (when (.has input "body") (is (= (Json/parse (Json/bytes (.path input "body"))) (Json/parse ^bytes (get sent "body"))) id))
           (if (.asBoolean (.path metadata "binary"))
            (let [d (.data result)] (is (instance? Download d)) (is (java.util.Arrays/equals ^bytes (.responseBytes server) ^bytes (helpers/download-bytes d)))
             (is (= (case (.responseMedia server) "application/pdf" :PDF "application/zip" :ZIP "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" :XLSX "text/csv" :CSV "text/html" :HTML :XML) (helpers/download-kind d)))
             (is (false? (helpers/download-encrypted? d)))
             (let [bytes (helpers/download-bytes d)] (aset-byte bytes 0 (byte 0)) (is (java.util.Arrays/equals ^bytes (.responseBytes server) ^bytes (helpers/download-bytes d)))))
            (do (is (= (str "com.webmania.sdk." (.asText (.path metadata "package")) "." (.asText (.path metadata "response"))) (.getName (class (.data result)))))
                (is (java.util.Arrays/equals ^bytes (Json/bytes (.path fixture "response")) ^bytes (value/to-json-bytes (.data result)))))))
          (is (not (.contains (str result) "controlled")))
          (.body server "{\"error\":false}")
          (is (= ApiException$Kind/API (.kind (sdk-error #(f c request)))))
          (let [bad (value/model (.asText (.path entry "request_class")) (assoc (clj-data (.path fixture "input")) "_unexpected_wrapper_field" true)) n (.count server) nsockets (.connections server)]
           (is (= ApiException$Kind/VALIDATION (.kind (sdk-error #(f c bad))))) (is (= n (.count server))) (is (= nsockets (.connections server))))))))))
   (println "CLOJURE_MATRIX" tls (.count server))))))
(deftest operation-matrices (matrix false) (matrix true))
(deftest exact-values-presence-and-guards
 (let [m (fiscal/nfe-cancel-request {:motivo "synthetic" :extra {:false false :zero 0 :exact 9007199254740999.990001M}})]
  (is (not (.contains (str m) "synthetic")))
  (is (.contains (value/to-json-string m) "9007199254740999.990001"))
  (value/explicit-null! m "motivo") (is (and (.has m "motivo") (.isNull m "motivo")))
  (value/omit! m "motivo") (is (not (.has m "motivo"))))
 (is (thrown? clojure.lang.ExceptionInfo (value/json-value 0.1)))
 (is (thrown? clojure.lang.ExceptionInfo (value/json-value {"x" 1 :x 2})))
 (is (thrown? clojure.lang.ExceptionInfo (sdk/nfe-client (sdk/monitor-credentials "clj-monitor"))))
 (let [h (java.util.HashMap.)] (.put h "self" h) (is (thrown? clojure.lang.ExceptionInfo (value/json-value h)))))
(deftest schema-corpus
 (let [cases (Json/parse (Files/readAllBytes (Path/of "/input-fixtures/schema-cases.json" (make-array String 0))))]
  (is (= 418 (.size cases)))
  (doseq [c cases] (is (= (.asBoolean (.path c "valid")) (Contract/accepts (.asText (.path c "module")) (.asText (.path c "schema")) (JsonValue. (.get c "instance"))))))))
(defn fixture [id] (first (filter #(= id (.asText (.path % "id"))) (fixture-data))))
(defn entry [id] (first (filter #(= id (.asText (.path % "id"))) (operation-map))))
(defn request [id input] (value/model (.asText (.path (entry id) "request_class")) input))
(defn operation [id] (ns-resolve 'webmania.operations (symbol (.asText (.path (entry id) "function")))))
(defn wait-count [server n]
 (let [end (+ (System/nanoTime) 3000000000)]
  (loop [] (when (and (< (.count server) n) (< (System/nanoTime) end)) (Thread/sleep 5) (recur))))
 (= n (.count server)))
(deftest lifecycle-and-scoped-preflight
 (doseq [tls [false true] id ["nfeGetSefazStatus" "nfeIssueDocument"]]
  (let [input (cond-> (clj-data (.path (fixture id) "input")) (= id "nfeIssueDocument") (assoc-in ["body" "ID"] "CLJ-INT-001")) f (operation id)]
   (with-open [server (ClojureFixture. tls)]
    (let [module (.asText (.path (.metadata server id) "module"))]
     (with-open [c (sdk/nfe-client (company) (.config server module))]
      (.delayed server "{}" 2000)
      (let [failure (AtomicReference.) flag (AtomicBoolean.)
            t (Thread. (fn [] (try (f c (request id input)) (catch Throwable e (.set failure e)) (finally (.set flag (.isInterrupted (Thread/currentThread)))))))]
       ;; the recovery selector is retained only after the complete 200 headers were observed (the body is delayed)
       (.start t) (is (wait-count server 1)) (Thread/sleep 250) (.interrupt t) (.join t 1500)
       (is (not (.isAlive t))) (is (.get flag))
       (let [e (.get failure)] (is (instance? ApiException e)) (is (= ApiException$Kind/CANCELLED (.kind e))) (is (= id (.operation e)))
        (is (= (= id "nfeIssueDocument") (.outcomeUncertain e)))
        (when (= id "nfeIssueDocument") (is (= "CLJ-INT-001" (.value (.reference e))))))
       (Thread/sleep 75) (is (= 1 (.count server)))
       (.success server id (Json/bytes (.path (fixture id) "response")))
       (is (instance? ApiResult (f c (request id input)))) (is (= 2 (.count server)))))
     (let [c (sdk/nfe-client (company) (.config server module)) failure (AtomicReference.)
           n (.count server) t (Thread. (fn [] (try (f c (request id input)) (catch Throwable e (.set failure e)))))]
      (.delayed server "{}" 2000) (.start t) (is (wait-count server (inc n))) (.close c) (.join t 1500)
      (is (not (.isAlive t))) (is (= ApiException$Kind/CLOSED (.kind (.get failure))))
      (let [sockets (.connections server)] (is (= ApiException$Kind/CLOSED (.kind (sdk-error #(f c (request id input)))))) (is (= sockets (.connections server)))) (.close c))
     (with-open [c (sdk/nfe-client (company) (.deadlineConfig server module 400))]
      (let [start (System/nanoTime) n (.count server) e (sdk-error #(f c (request id input)))]
       (is (= ApiException$Kind/TIMEOUT (.kind e))) (is (< (- (System/nanoTime) start) 2000000000))
       (is (= (= id "nfeIssueDocument") (.outcomeUncertain e))) (Thread/sleep 75) (is (= (inc n) (.count server))))))))))
(deftest bounded-exact-values
 (let [nested (fn [n] (nth (iterate vector {}) n))]
  (is (instance? JsonValue (value/json-value (nested 64))))
  (is (thrown? clojure.lang.ExceptionInfo (value/json-value (nested 65))))
  (is (thrown? clojure.lang.ExceptionInfo (value/json-value [(JsonValue. (Json/parse (str (apply str (repeat 64 "[")) "{}" (apply str (repeat 64 "]")))))]))))
 (doseq [v [Double/NaN Double/POSITIVE_INFINITY (float 0.1) 1/3 :keyword (Object.) (String. (char-array [(char 55296)])) (String. (char-array [(char 56320)])) (BigInteger. (apply str (repeat 1001 "9")))]]
  (is (thrown? clojure.lang.ExceptionInfo (value/json-value v))))
 (doseq [[ch weight] [["a" 1] ["\\" 2] ["\"" 2] ["é" 2] [(str (char 0)) 6]]]
  (let [n (quot (- 16777216 2) weight) text (.repeat ^String ch (int n))
        result (value/json-value text)]
   (is (= (+ 2 (* n weight)) (alength (value/to-json-bytes result))))
   (is (thrown? clojure.lang.ExceptionInfo (value/json-value (str text ch))))))
 (let [h (java.util.ArrayList.)] (.add h h) (is (thrown? clojure.lang.ExceptionInfo (value/json-value h))))
 (let [raw (reify Object (toString [_] (throw (Exception. "PRIVATE sentinel must never stringify"))))]
  (try (value/json-value raw) (is false) (catch Exception e (is (not (str/includes? (str e) "PRIVATE")))))))
(deftest generated-surface-and-typed-guards
 (let [classes (edn/read-string (slurp (io/resource "webmania-model-classes.edn")))
       namespaces (map #(symbol (str "webmania.models." %)) ["api1fiscal" "api1files" "api1b2b" "api2cteissuance" "api2dceissuance" "api2emitterfiles" "api2emitterreads" "api2mdfeissuance" "api2monitordocuments" "api2monitormanagement" "api2monitorreads" "api2nfcomissuance" "api2nfseissuance" "api2reports"])]
  (doseq [n namespaces] (require n))
  (is (= 3030 (count classes)))
  (is (= classes (set (keep (comp :model-class meta val) (mapcat #(ns-publics %) namespaces)))))
  (is (= 103 (count (filter (comp :operation-id meta val) (ns-publics 'webmania.operations))))))
 (with-open [server (ClojureFixture. false) c (sdk/nfe-client (company) (.config server "api1/fiscal.openapi.json")) wrong (sdk/monitor-client (sdk/monitor-credentials "clj-monitor") (.config server "api1/fiscal.openapi.json"))]
  (let [f (operation "nfeGetSefazStatus") req (request "nfeGetSefazStatus" {})]
   (is (thrown? clojure.lang.ExceptionInfo (f wrong req)))
   (is (thrown? clojure.lang.ExceptionInfo (f c {})))
   (is (= 0 (.connections server))) (is (= 0 (.count server))))))
(deftest bounded-helpers
 (doseq [tls [false true]]
  (doseq [[id collect] [["monitorListCompanies" helpers/collect-companies] ["monitorListCompanyMunicipalities" helpers/collect-company-municipalities] ["monitorListReports" helpers/collect-reports]]]
   (with-open [server (ClojureFixture. tls)]
    (let [module (.asText (.path (.metadata server id) "module")) input (assoc (clj-data (.path (fixture id) "input")) "page" 1 "per_page" 10)]
     (.respond server (fn [q] (let [page (if (str/includes? (get q "target") "page=2") 2 1)]
      (value/to-json-string (value/json-value {"data" (vec (for [i (range (if (= page 1) 10 2))] (cond-> {"uuid" (format "00000000-0000-4000-8000-%012d" (+ (* page 10) i))}
       (= id "monitorListCompanyMunicipalities") (assoc "tipo_download" 1 "municipio" "Synthetic" "uf" "SP" "codigo_ibge" "3550308")
       (= id "monitorListReports") (assoc "relatorio" "xml" "modelo" "nfe" "status" "concluido"))))
       "meta" {"current_page" page "last_page" 2 "per_page" 10 "total" 12}})))))
     (with-open [c (sdk/monitor-client (sdk/monitor-credentials "clj-monitor") (.config server module))]
      (let [r (collect c (request id input) (helpers/pagination-options {:max-pages 3 :max-items 20 :deadline-ms 3000}))]
       (is (= 12 (count (.items r)))) (is (= 2 (.count server))))
      (let [r (collect c (request id input) (helpers/pagination-options {:max-pages 1 :max-items 20 :deadline-ms 3000}))]
       (is (= "PAGE_LIMIT" (.name (.stop r)))) (is (= BigInteger/TWO (.nextPage r))))
      (let [r (collect c (request id input) (helpers/pagination-options {:max-pages 3 :max-items 11 :deadline-ms 3000}))]
       (is (= 11 (count (.items r)))) (is (= "ITEM_LIMIT" (.name (.stop r)))) (is (= 1 (.nextIndex r))))))))
  (with-open [server (ClojureFixture. tls) c (sdk/monitor-client (sdk/monitor-credentials "clj-monitor") (.config server "api2/monitor-documents.openapi.json"))]
   (let [counter (atom 0) state (fn [s] (str "{\"uuid\":\"00000000-0000-4000-8000-000000000001\",\"status\":\"" s "\",\"processado\":0,\"importados\":[],\"descartados\":[]}"))
         req (request "monitorGetImportStatus" {"uuid" "00000000-0000-4000-8000-000000000001"})]
    (.respond server (fn [_] (state (if (= 1 (swap! counter inc)) "processando" "concluido"))))
    (let [r (helpers/wait-import c req (helpers/polling-options {:max-attempts 3 :deadline-ms 12000 :interval-ms 5000}))]
     (is (.completed r)) (is (= 2 (.attempts r))) (is (>= (- (.received server 1) (.received server 0)) 5000000000)))
    (.clearResponder server) (.body server (state "future-state"))
    (is (= "UNKNOWN_STATE" (.name (.stop (helpers/wait-import c req (helpers/polling-options {:max-attempts 2 :deadline-ms 1000}))))))
    (.body server (state "processando"))
    (is (= "ATTEMPT_LIMIT" (.name (.stop (helpers/wait-import c req (helpers/polling-options {:max-attempts 1 :deadline-ms 1000}))))))
    (is (= "DEADLINE" (.name (.stop (helpers/wait-import c req (helpers/polling-options {:max-attempts 2 :deadline-ms 150}))))))))
  (with-open [server (ClojureFixture. tls) c (sdk/nfe-client (company) (.config server "api1/fiscal.openapi.json"))]
   (.body server "{\"uuid\":\"00000000-0000-4000-8000-000000000001\",\"status\":\"concluido\",\"url\":\"https://example.invalid/report?token=CLJ-PRIVATE-REPORT\"}")
   (let [req (request "fiscalCreateOrPollReport" (clj-data (.path (fixture "fiscalCreateOrPollReport") "input")))
         r (helpers/wait-report c req (helpers/polling-options {:max-attempts 2 :deadline-ms 2000}))]
    (is (.completed r)) (is (= 1 (.attempts r))) (is (not (str/includes? (str r) "CLJ-PRIVATE-REPORT")))))))
(deftest file-kinds-and-capabilities
 (doseq [tls [false true]]
  (with-open [server (ClojureFixture. tls)]
   (doseq [row (.path (Json/parse (Files/readAllBytes (Path/of "/input-fixtures/file-fixtures.json" (make-array String 0)))) "fixtures")
           mode [:default :token]]
    (let [kind (.asText (.path row "kind")) id (if (= kind "ENCRYPTED_PDF") "nfeDownloadDanfe" "fileGetNfseXml") metadata (.metadata server id)
          path (str "/input-fixtures/file-fixtures/" (.asText (.path row "name"))) bytes (Files/readAllBytes (Path/of path (make-array String 0)))]
     (.reply server (.asText (.path row "media")) bytes)
     (with-open [c (client (.asText (.path (entry id) "scope")) metadata mode (.config server (.asText (.path metadata "module"))))]
      (if-not (.asBoolean (.path row "supported") true)
       (is (= ApiException$Kind/PROTOCOL (.kind (sdk-error #((operation id) c (request id (clj-data (.path (fixture id) "input"))))))))
       (let [result ((operation id) c (request id (clj-data (.path (fixture id) "input")))) d (.data result)]
        (is (= (keyword kind) (helpers/download-kind d))) (is (helpers/download-encrypted? d))
        (is (= (if (= mode :token) :DOCUMENT_TOKEN :AUTHENTICATED) (helpers/download-protection d)))
        (is (java.util.Arrays/equals ^bytes bytes ^bytes (helpers/download-bytes d))))))))
   (doseq [[id media bytes] [["nfeDownloadDanfe" "application/pdf" (.getBytes "%PDF-" "UTF-8")]
                             ["nfeDownloadXml" "application/xml" (.getBytes "<html>not fiscal</html>" "UTF-8")]
                             ["fileGetNfseXml" "application/zip" (byte-array [80 75 3 4])]]]
    (.reply server media bytes)
    (let [metadata (.metadata server id)]
     (with-open [c (client (.asText (.path (entry id) "scope")) metadata :default (.config server (.asText (.path metadata "module"))))]
      (is (= ApiException$Kind/PROTOCOL (.kind (sdk-error #((operation id) c (request id (clj-data (.path (fixture id) "input")))))))))))
   (with-open [target (ClojureFixture. tls)]
    (let [id "fileGetNfsePdf" metadata (.metadata server id) destination (str (.origin target) "/private?token=CLJ-CAPABILITY")]
     (.redirect server destination)
     (with-open [c (client "emitter-files" metadata :default (.config server (.asText (.path metadata "module"))))]
      (let [result ((operation id) c (request id (clj-data (.path (fixture id) "input")))) d (.data result)]
       (is (.isRedirect d)) (is (nil? (helpers/download-kind d))) (is (false? (helpers/download-encrypted? d)))
       (is (= destination (.value (.redirectTarget d)))) (is (= 0 (.connections target)))
       (is (thrown? clojure.lang.ExceptionInfo (helpers/download-bytes d)))
       (is (not (str/includes? (str d) "CLJ-CAPABILITY"))))))))))
(deftest actual-wire-request-and-response-bounds
 (doseq [tls [false true]]
  (with-open [server (ClojureFixture. tls) c (sdk/nfe-client (company) (.config server "api1/fiscal.openapi.json"))]
   (let [id "nfeIssueDocument" original (clj-data (.path (fixture id) "input")) body (assoc (get original "body") "_clj_padding" "")
         overhead (alength (Json/bytes (value/node body))) remaining (- 8388608 overhead)
         padding (str (.repeat "\\" (int (quot remaining 2))) (.repeat "a" (int (mod remaining 2))))
         full (assoc body "_clj_padding" padding)]
    (.success server id (Json/bytes (.path (fixture id) "response")))
    (is (instance? ApiResult ((operation id) c (request id (assoc original "body" full)))))
    (is (= 8388608 (alength ^bytes (get (.last server) "body"))))
    (let [n (.count server) sockets (.connections server)]
     (is (= ApiException$Kind/LIMIT (.kind (sdk-error #((operation id) c (request id (assoc original "body" (assoc full "_clj_padding" (str padding "a")))))))))
     (is (= n (.count server))) (is (= sockets (.connections server)))))
   (let [id "nfeGetSefazStatus" base (assoc (clj-data (.path (fixture id) "response")) "_clj_padding_a" "" "_clj_padding_b" "")
         overhead (alength (Json/bytes (value/node base))) remaining (- 16777216 overhead)
         body (assoc base "_clj_padding_a" (.repeat "a" (int (quot remaining 2))) "_clj_padding_b" (.repeat "b" (int (- remaining (quot remaining 2)))))
         bytes (Json/bytes (value/node body))]
    (is (= 16777216 (alength bytes))) (.reply server "application/json" bytes)
    (let [result ((operation id) c (request id (clj-data (.path (fixture id) "input"))))]
     (is (= 16777216 (alength (value/to-json-bytes (.data result))))))
    (.reply server "application/json" (java.util.Arrays/copyOf bytes 16777217))
    (is (= ApiException$Kind/LIMIT (.kind (sdk-error #((operation id) c (request id (clj-data (.path (fixture id) "input"))))))))))))
(let [result (run-tests 'webmania.author)] (println "CLOJURE_RESULT" result) (when (pos? (+ (:fail result) (:error result))) (System/exit 1)))
