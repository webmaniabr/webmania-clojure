;; Optional homologation walk-through (ambiente 2): reads, then the NF-e and NFS-e lifecycles (issue, bounded
;; consult, files, cancel, final consult). Configuration comes only from the WEBMANIA_* environment. Output is one
;; JSON line per step with statuses, sizes and digests; identifiers, payload values and credentials are never
;; printed. A mutation is never resent.
(ns homologacao
  (:require [clojure.string :as str] [webmania.core :as sdk] [webmania.operations :as api])
  (:import [com.fasterxml.jackson.databind DeserializationFeature JsonNode ObjectMapper]
           [com.fasterxml.jackson.databind.node ObjectNode]
           [com.webmania.sdk ApiException ApiResult Download JsonValue]
           [com.webmania.sdk.model.api1fiscal NfeIssueDocumentRequest NfeGetDocumentRequest NfeQueryDocumentRequest NfeCancelDocumentRequest]
           [com.webmania.sdk.model.api1files NfeDownloadDanfeRequest NfeDownloadSimpleDanfeRequest NfeDownloadXmlRequest NfeDownloadCancellationXmlRequest]
           [com.webmania.sdk.model.api2nfseissuance EmitterIssueNfseRequest EmitterCancelNfseRequest]
           [com.webmania.sdk.model.api2emitterreads EmitterGetNfseRequest]
           [com.webmania.sdk.model.api2emitterfiles FileGetNfseXmlRequest FileGetNfsePdfRequest FileGetNfseRpsPdfRequest]
           [java.net URI] [java.nio.charset StandardCharsets] [java.nio.file Files OpenOption Path StandardOpenOption]
           [java.security MessageDigest] [java.time Duration]))

;; Decimal numbers are read as BigDecimal: the SDK refuses binary floating point in request bodies.
(def ^ObjectMapper json (doto (ObjectMapper.) (.enable DeserializationFeature/USE_BIG_DECIMAL_FOR_FLOATS)))
(def processing #{"processando" "processamento" "contingencia" "pendente"})
(def step (atom 0))
(def failed (atom false))
(def ledger (atom nil))

(defn- exit! [code] (flush) (shutdown-agents) (System/exit code))
(defn- blocked [reason]
  (let [line (.put (.createObjectNode json) "result" "blocked")]
    (when reason (.put line "reason" ^String reason))
    (println (str line)) (exit! 77)))
(defn- env [name] (let [v (System/getenv name)] (when-not (str/blank? v) v)))
(defn- sha256 [^bytes bytes] (apply str (map #(format "%02x" (bit-and 255 %)) (.digest (MessageDigest/getInstance "SHA-256") bytes))))
(defn- line ^ObjectNode [operation ok status outcome kind identifier]
  (doto (.createObjectNode json)
    (.put "step" (int (swap! step inc))) (.put "operation" ^String operation) (.put "ok" (boolean ok)) (.put "http_status" (int status))
    (.put "outcome" ^String outcome) (.put "kind" ^String kind)
    (.put "ref" ^String (when identifier (subs (sha256 (.getBytes ^String identifier StandardCharsets/UTF_8)) 0 12)))))
(defn- emit [node] (println (str node)) (flush))
(defn- record [model identifier status operation]
  (when-let [path @ledger]
    (let [entry (doto (.createObjectNode json) (.put "model" ^String model) (.put "identifier" ^String identifier) (.put "status" ^String status) (.put "operation" ^String operation))]
      (Files/writeString path (str entry "\n") StandardCharsets/UTF_8 (into-array OpenOption [StandardOpenOption/CREATE StandardOpenOption/APPEND])))))
(defn- text [^JsonNode node name] (when node (let [v (.path node ^String name)] (when (.isTextual v) (.textValue v)))))
(defn- kind-of [^ApiException e] (str/lower-case (.name (.kind e))))
(defn- data-of [^ApiResult r] (let [d (.data r)] (when (instance? JsonValue d) (.toJson ^JsonValue d))))
(defn- field ^ObjectNode [name value] (.put (.createObjectNode json) ^String name ^String value))
(defn- wrap ^ObjectNode [name ^JsonNode value] (doto (.createObjectNode json) (.set ^String name value)))

(defn- read* [operation identifier call]
  (try (let [^ApiResult r (call)] (emit (line operation true (.status r) "success" nil identifier)) (data-of r))
       (catch ApiException e (reset! failed true) (emit (line operation false (.status e) (if (.outcomeUncertain e) "unknown" "failure") (kind-of e) identifier)) nil)))
(defn- mutation [model operation identifier call]
  (try (let [^ApiResult r (call) data (or (data-of r) (.createObjectNode json))]
         (emit (line operation true (.status r) "success" nil (or identifier (text data "uuid")))) data)
       (catch ApiException e
         (let [id (or identifier (some-> (.reference e) .value))]
           (if (.outcomeUncertain e)
             (do (emit (line operation false (.status e) "unknown" (kind-of e) id)) (record model id "unknown" operation) (throw (ex-info "unknown outcome" {:unknown true})))
             (do (reset! failed true) (emit (line operation false (.status e) "failure" (kind-of e) id)) nil))))))
(defn- file [operation identifier call]
  (try (let [^ApiResult r (call) ^Download d (.data r) pending (or (.pending d) (.isRedirect d)) bytes (.bytes d)
             node (line operation (not pending) (.status r) (if pending "pending" "success") nil identifier)]
         (.put node "size" (int (alength bytes))) (.put node "sha256" ^String (sha256 bytes))
         (.put node "format" ^String (some-> (.kind d) .name str/lower-case))
         (when pending (reset! failed true)) (emit node))
       (catch ApiException e (reset! failed true) (emit (line operation false (.status e) (if (.outcomeUncertain e) "unknown" "failure") (kind-of e) identifier)))))
(defn- poll
  ([model uuid operation initial call] (poll model uuid operation initial processing call))
  ([model uuid operation initial pending call]
   (loop [status initial attempt 0]
     ;; At least one consult; then poll only while the document is in a pending status.
     (if (and (< attempt 30) (or (zero? attempt) (nil? status) (pending status)))
       (do (when (pos? attempt) (Thread/sleep 10000))
           (let [^JsonNode data (read* operation uuid call)
                 observed (text (if (and data (.isArray data) (pos? (.size data))) (.get data 0) data) "status")]
             (when (and observed (not= observed status)) (record model uuid observed operation))
             (recur (or observed status) (inc attempt))))
       status))))
(defn- origin [name fallback]
  (let [uri (try (URI/create (or (env name) fallback)) (catch IllegalArgumentException _ (blocked "origin")))]
    (when (or (not= "https" (.getScheme uri)) (nil? (.getHost uri)) (.getUserInfo uri) (.getQuery uri) (.getFragment uri)) (blocked "origin"))
    uri))
(defn- payload [name]
  (let [path (or (env name) (blocked "payload"))
        raw (try (Files/readAllBytes (Path/of path (make-array String 0))) (catch java.io.IOException _ (blocked "payload")))
        _ (when (> (alength ^bytes raw) (* 8 1024 1024)) (blocked "payload"))
        ^JsonNode node (try (.readTree json ^bytes raw) (catch java.io.IOException _ (blocked "payload")))
        ambiente (when node (.get node "ambiente"))]
    ;; Only the decoded top-level JSON integer 2 is homologation: the text "2", 2.0 or a nested value is refused.
    (when-not (and node (.isObject node) ambiente (.isInt ambiente) (= 2 (.intValue ambiente))) (blocked "ambiente"))
    node))

(defn- nfe-cycle [c files payload]
  (let [issued (mutation "nfe" "nfeIssueDocument" nil #(api/nfe-issue-document c (NfeIssueDocumentRequest. (wrap "body" payload))))
        uuid (text issued "uuid")]
    (if-not uuid (reset! failed true)
      ;; A document not approved by the issue call (processing, contingency, refused) is only consulted:
      ;; no further mutation is sent for it.
      (let [_ (record "nfe" uuid (text issued "status") "nfeIssueDocument")
            approved-at-issue (= "aprovado" (text issued "status"))
            consult #(api/nfe-get-document c (NfeGetDocumentRequest. (field "uuid" uuid)))
            status (poll "nfe" uuid "nfeGetDocument" (text issued "status") consult)]
        (if-not (and approved-at-issue (= "aprovado" status))
          (reset! failed true)
          (do (read* "nfeQueryDocument" uuid #(api/nfe-query-document c (NfeQueryDocumentRequest. (wrap "body" (field "uuid" uuid)))))
              (file "nfeDownloadDanfe" uuid #(api/nfe-download-danfe files (NfeDownloadDanfeRequest. (field "identifier" uuid))))
              (file "nfeDownloadSimpleDanfe" uuid #(api/nfe-download-simple-danfe files (NfeDownloadSimpleDanfeRequest. (field "identifier" uuid))))
              (file "nfeDownloadXml" uuid #(api/nfe-download-xml files (NfeDownloadXmlRequest. (field "identifier" uuid))))
              (let [body (.put (field "uuid" uuid) "motivo" "Cancelamento de teste em homologacao")]
                (when (mutation "nfe" "nfeCancelDocument" uuid #(api/nfe-cancel-document c (NfeCancelDocumentRequest. (wrap "body" body))))
                  (record "nfe" uuid "cancelamento_solicitado" "nfeCancelDocument")
                  (if (= "cancelado" (poll "nfe" uuid "nfeGetDocument" "processando" consult))
                    (file "nfeDownloadCancellationXml" uuid #(api/nfe-download-cancellation-xml files (NfeDownloadCancellationXmlRequest. (field "identifier" uuid))))
                    (reset! failed true))))))))))
(defn- nfse-cycle [c files payload]
  (let [issued (mutation "nfse" "emitterIssueNfse" nil #(api/emitter-issue-nfse c (EmitterIssueNfseRequest. (wrap "body" payload))))
        uuid (text issued "uuid")]
    (if-not uuid (reset! failed true)
      (let [_ (record "nfse" uuid (text issued "status") "emitterIssueNfse")
            approved-at-issue (= "aprovado" (text issued "status"))
            consult #(api/emitter-get-nfse c (EmitterGetNfseRequest. (field "identifier" uuid)))
            status (poll "nfse" uuid "emitterGetNfse" (text issued "status") consult)]
        (if-not (and approved-at-issue (= "aprovado" status))
          (reset! failed true)
          (do (file "fileGetNfseXml" uuid #(api/file-get-nfse-xml files (FileGetNfseXmlRequest. (field "identifier" uuid))))
              (file "fileGetNfsePdf" uuid #(api/file-get-nfse-pdf files (FileGetNfsePdfRequest. (field "identifier" uuid))))
              (file "fileGetNfseRpsPdf" uuid #(api/file-get-nfse-rps-pdf files (FileGetNfseRpsPdfRequest. (field "identifier" uuid))))
              (let [body (-> (field "uuid" uuid) (.put "motivo" "1") (.put "justificativa" "Cancelamento de teste em homologacao"))]
                (when-let [cancelled (mutation "nfse" "emitterCancelNfse" uuid #(api/emitter-cancel-nfse c (EmitterCancelNfseRequest. (wrap "body" body))))]
                  (record "nfse" uuid (text cancelled "status") "emitterCancelNfse")
                  ;; An NFS-e cancellation can stay in processando_cancelamento until a later consult completes it.
                  (when-not (= "cancelado" (poll "nfse" uuid "emitterGetNfse" "processando" (conj processing "processando_cancelamento") consult))
                    (reset! failed true))))))))))

(defn -main []
  (when-not (= "1" (System/getenv "WEBMANIA_LIVE")) (blocked nil))
  (let [scope (or (env "WEBMANIA_LIVE_SCOPE") "readonly")
        _ (when-not (#{"readonly" "nfe" "nfse" "all"} scope) (blocked "scope"))
        api1 (origin "WEBMANIA_API1_BASE_URL" "https://webmania.com.br/api")
        files-origin (origin "WEBMANIA_FILES_BASE_URL" "https://nfe.webmania.com.br")
        api2 (origin "WEBMANIA_API2_BASE_URL" "https://api.webmania.com.br")
        ;; the host allow-list is mandatory: absent or empty, no origin is trusted and nothing is sent
        _ (let [hosts (set (remove str/blank? (map (comp str/lower-case str/trim) (str/split (or (env "WEBMANIA_LIVE_ALLOWED_HOSTS") "") #","))))]
            (when (empty? hosts) (blocked "allowed_hosts"))
            (when (some #(not (hosts (str/lower-case (.getHost ^URI %)))) [api1 files-origin api2]) (blocked "host_not_allowed")))
        nfe (#{"nfe" "all"} scope) nfse (#{"nfse" "all"} scope)
        nfe-payload (when nfe (payload "WEBMANIA_LIVE_NFE_PAYLOAD"))
        nfse-payload (when nfse (payload "WEBMANIA_LIVE_NFSE_PAYLOAD"))
        ;; the ledger must be writable before any mutation; existing content is preserved
        _ (when (or nfe nfse)
            (let [path (Path/of (or (env "WEBMANIA_LIVE_LEDGER") (blocked "ledger")) (make-array String 0))]
              (try (Files/writeString path "" StandardCharsets/UTF_8 (into-array OpenOption [StandardOpenOption/CREATE StandardOpenOption/APPEND]))
                   (catch java.io.IOException _ (blocked "ledger")))
              (reset! ledger path)))
        [k s t ts issuer] (map #(or (env %) (blocked "credentials")) ["WEBMANIA_CONSUMER_KEY" "WEBMANIA_CONSUMER_SECRET" "WEBMANIA_ACCESS_TOKEN" "WEBMANIA_ACCESS_TOKEN_SECRET" "WEBMANIA_ISSUER_TOKEN"])
        config (sdk/client-config (fn [b] (.deadline b (Duration/ofSeconds 60))
                                    (.origin b "api1/fiscal.openapi.json" api1) (.origin b "api1/files.openapi.json" files-origin)
                                    (.origin b "api2/emitter-reads.openapi.json" api2) (.origin b "api2/nfse-issuance.openapi.json" api2) (.origin b "api2/emitter-files.openapi.json" api2)))
        company (sdk/company-credentials k s t ts)]
    (try
      (with-open [nfe-client (sdk/nfe-client company config) nfe-files (sdk/nfe-files-client company config)
                  emitter (sdk/emitter-client (sdk/issuer-credentials issuer) config) emitter-files (sdk/emitter-files-client (sdk/file-company-credentials issuer) config)]
        (read* "nfeGetSefazStatus" nil #(api/nfe-get-sefaz-status nfe-client))
        (read* "nfeGetCertificateValidity" nil #(api/nfe-get-certificate-validity nfe-client))
        (read* "nfeListTaxClasses" nil #(api/nfe-list-tax-classes nfe-client))
        (read* "emitterGetNfseProviderStatus" nil #(api/emitter-get-nfse-provider-status emitter))
        (when nfe-payload (nfe-cycle nfe-client nfe-files nfe-payload))
        (when nfse-payload (nfse-cycle emitter emitter-files nfse-payload)))
      (catch clojure.lang.ExceptionInfo e (if (:unknown (ex-data e)) (exit! 1) (throw e))))
    (exit! (if @failed 1 0))))

(-main)
