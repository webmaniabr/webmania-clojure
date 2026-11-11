(ns webmania.value
  (:require [clojure.edn :as edn] [clojure.java.io :as io])
  (:import [com.webmania.sdk Json JsonValue JsonModel WebmaniaClient]
           [com.fasterxml.jackson.databind JsonNode]
           [com.fasterxml.jackson.databind.node JsonNodeFactory]
           [java.math BigDecimal BigInteger]
           [java.nio.file Files Path]
           [java.security MessageDigest]
           [java.util IdentityHashMap] [java.util.jar JarFile]))

(defn invalid [] (throw (ex-info "Expected a supported exact bounded JSON value" {:kind :validation})))
(def ^:private java-sha "29e262427ca8ec15918c2072020c674c64f88be9427efa949b92ddd802f494e3")
(def ^:private pinned
  (delay
    (try
      (let [url (-> WebmaniaClient .getProtectionDomain .getCodeSource .getLocation)
            path (Path/of (.toURI url))
            bytes (Files/readAllBytes path)
            digest (.digest (MessageDigest/getInstance "SHA-256") bytes)
            actual (apply str (map #(format "%02x" (bit-and 255 %)) digest))]
        (when-not (and (= "file" (.getProtocol url)) (= java-sha actual)) (invalid))
        ;; Refuse classpath overlays as well as a replaced top-level client archive.
        (with-open [archive (JarFile. (.toFile path))]
          (doseq [entry (enumeration-seq (.entries archive))
                  :let [name (.getName entry)]
                  :when (and (not (.isDirectory entry)) (.startsWith name "contracts/"))]
            (let [resource (.getResource (.getClassLoader WebmaniaClient) name)
                  connection (when resource (.openConnection resource))]
              (when-not (and (instance? java.net.JarURLConnection connection)
                             (Files/isSameFile path (Path/of (.toURI (.getJarFileURL ^java.net.JarURLConnection connection))))) (invalid))
              (with-open [actual (.getInputStream connection) expected (.getInputStream archive entry)]
                (when-not (java.util.Arrays/equals ^bytes (.readAllBytes actual) ^bytes (.readAllBytes expected)) (invalid)))))
          (doseq [entry (enumeration-seq (.entries archive))
                  :let [name (.getName entry)]
                  :when (and (.startsWith name "com/webmania/sdk/") (.endsWith name ".class"))]
            (let [class-name (.replace (.substring name 0 (- (.length name) 6)) "/" ".")
                  klass (Class/forName class-name false (.getClassLoader WebmaniaClient))
                  origin (some-> klass .getProtectionDomain .getCodeSource .getLocation)]
              (when-not (and origin (= "file" (.getProtocol origin)) (Files/isSameFile path (Path/of (.toURI origin)))) (invalid))))) true)
      (catch Exception _ (throw (ex-info "Java SDK dependency identity mismatch" {:kind :configuration})))
      (catch LinkageError _ (throw (ex-info "Java SDK dependency identity mismatch" {:kind :configuration}))))))
(defn require-runtime! [] @pinned)

(defn node
  ([value] (node value 16777216))
  ([value limit]
  (let [active (IdentityHashMap.) budget (volatile! 100000) remaining (volatile! limit)
        factory JsonNodeFactory/instance]
    (letfn [(charge! [n] (when (neg? (vswap! remaining - n)) (invalid)))
            (text! [^String text]
              ;; Count the exact UTF-8 JSON representation before allocating a byte array.
              (when (> (.length text) (- limit 2)) (invalid))
              (charge! 2)
              (loop [i 0]
                (when (< i (.length text))
                  (let [c (int (.charAt text i))]
                    (cond
                      (or (= c 34) (= c 92) (contains? #{8 9 10 12 13} c)) (do (charge! 2) (recur (inc i)))
                      (< c 32) (do (charge! 6) (recur (inc i)))
                      (< c 128) (do (charge! 1) (recur (inc i)))
                      (< c 2048) (do (charge! 2) (recur (inc i)))
                      (<= 55296 c 56319) (do (when-not (and (< (inc i) (.length text)) (<= 56320 (int (.charAt text (inc i))) 57343)) (invalid)) (charge! 4) (recur (+ i 2)))
                      (<= 56320 c 57343) (invalid)
                      :else (do (charge! 3) (recur (inc i))))))))
            (number! [v]
              (when (or (and (instance? BigInteger v) (> (.bitLength ^BigInteger v) 3322))
                        (and (instance? BigDecimal v) (> (.precision ^BigDecimal v) 1000))) (invalid))
              (let [text (str v)] (when (> (count text) 1000) (invalid)) (charge! (count text)))
              (if (instance? BigDecimal v) (.numberNode factory ^BigDecimal v) (.numberNode factory ^BigInteger v)))
            (object! [entries depth]
              (charge! 2)
              (let [out (.objectNode factory) seen (volatile! #{})]
                (doseq [[k item] entries]
                  (let [key (cond (string? k) k (and (keyword? k) (nil? (namespace k))) (name k) :else (invalid))]
                    (when (or (> (count key) 512) (contains? @seen key)) (invalid))
                    (when (seq @seen) (charge! 1)) (charge! 1) (text! key)
                    (vswap! seen conj key) (.set out key ^JsonNode (visit item (inc depth))))) out))
            (array! [items depth]
              (charge! 2)
              (let [out (.arrayNode factory)]
                (doseq [item items] (when (pos? (.size out)) (charge! 1)) (.add out ^JsonNode (visit item (inc depth)))) out))
            (visit [input depth]
              (when (or (> depth 64) (neg? (vswap! budget dec))) (invalid))
              (let [v (if (instance? JsonValue input) (.toJson ^JsonValue input) input)
                    container (or (map? v) (instance? java.util.Map v) (sequential? v) (instance? java.util.List v) (and (instance? JsonNode v) (.isContainerNode ^JsonNode v)))]
                (when (and container (.containsKey active v)) (invalid))
                (when container (.put active v true))
                (try
                  (cond
                    (nil? v) (do (charge! 4) (.nullNode factory))
                    (string? v) (do (text! v) (.textNode factory v))
                    (instance? Boolean v) (do (charge! (if v 4 5)) (.booleanNode factory v))
                    (instance? BigInteger v) (number! v)
                    (instance? clojure.lang.BigInt v) (number! (.toBigInteger ^clojure.lang.BigInt v))
                    (instance? BigDecimal v) (number! v)
                    (or (instance? Byte v) (instance? Short v) (instance? Integer v) (instance? Long v)) (number! (BigInteger/valueOf (long v)))
                    (or (map? v) (instance? java.util.Map v)) (object! v depth)
                    (or (sequential? v) (instance? java.util.List v)) (array! v depth)
                    (instance? JsonNode v)
                      (cond (.isNull ^JsonNode v) (do (charge! 4) (.nullNode factory))
                            (.isTextual ^JsonNode v) (let [text (.textValue ^JsonNode v)] (text! text) (.textNode factory text))
                            (.isBoolean ^JsonNode v) (let [b (.booleanValue ^JsonNode v)] (charge! (if b 4 5)) (.booleanNode factory b))
                            (.isIntegralNumber ^JsonNode v) (number! (.bigIntegerValue ^JsonNode v))
                            (.isBigDecimal ^JsonNode v) (number! (.decimalValue ^JsonNode v))
                            (.isObject ^JsonNode v) (object! (map (fn [entry] [(.getKey entry) (.getValue entry)]) (.properties ^JsonNode v)) depth)
                            (.isArray ^JsonNode v) (array! v depth)
                            :else (invalid))
                    :else (invalid))
                  (finally (when container (.remove active v))))))]
      (try (visit value 0) (catch Exception _ (invalid)))))))

(def ^:private model-classes (delay (edn/read-string (slurp (io/resource "webmania-model-classes.edn")))))
(def ^:private constructors (memoize #(do (when-not (contains? @model-classes %) (invalid)) (let [klass (Class/forName %)] (.getConstructor klass (into-array Class [JsonNode]))))))
(defn model [class-name value]
  (require-runtime!)
  (try (.newInstance ^java.lang.reflect.Constructor (constructors class-name) (object-array [(node value 33554432)]))
       (catch Exception _ (invalid))))
(defn json-value [v] (require-runtime!) (JsonValue. (node v)))
(defn to-json-bytes [v] (if (instance? JsonValue v) (.toJsonBytes ^JsonValue v) (invalid)))
(defn to-json-string [v] (String. ^bytes (to-json-bytes v) "UTF-8"))
(defn explicit-null! [model field] (when-not (and (instance? JsonModel model) (string? field)) (invalid)) (try (.explicitNull ^JsonModel model field) (catch Exception _ (invalid))))
(defn omit! [model field] (when-not (and (instance? JsonModel model) (string? field)) (invalid)) (try (.omit ^JsonModel model field) (catch Exception _ (invalid))))
