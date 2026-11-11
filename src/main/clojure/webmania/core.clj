(ns webmania.core
 (:require [webmania.value :as value])
 (:import [com.webmania.sdk WebmaniaClient ClientConfig Credentials ApiException PaginationOptions PollingOptions]))

(defprotocol ClientHandle (-engine [this]) (-scope [this]))
(deftype Client [^WebmaniaClient delegate scope]
 ClientHandle (-engine [_] delegate) (-scope [_] scope)
 java.io.Closeable (close [_] (.close delegate))
 Object (toString [_] (str "WebmaniaClient[" (name scope) ", protected]")))
(deftype Credential [raw scope]
 Object (toString [_] "WebmaniaCredentials[protected]"))
(defn- strings! [values] (when-not (every? string? values) (throw (ex-info "Expected credential strings" {:kind :configuration}))))
(defn company-credentials [key secret token token-secret] (value/require-runtime!) (strings! [key secret token token-secret]) (Credential. (Credentials/company key secret token token-secret) :company))
(defn reseller-credentials [key secret token token-secret] (value/require-runtime!) (strings! [key secret token token-secret]) (Credential. (Credentials/reseller key secret token token-secret) :reseller))
(defn issuer-credentials [token] (value/require-runtime!) (strings! [token]) (Credential. (Credentials/issuer token) :issuer))
(defn monitor-credentials [token] (value/require-runtime!) (strings! [token]) (Credential. (Credentials/monitor token) :monitor))
(defn file-company-credentials [token] (value/require-runtime!) (strings! [token]) (Credential. (Credentials/fileCompany token) :file-company))
(defn document-token [token] (value/require-runtime!) (strings! [token]) (Credential. (Credentials/documentToken token) :document-token))
(defn anonymous-file [] (value/require-runtime!) (Credential. (Credentials/anonymousFile) :anonymous))
(defn- create-client [scope accepted credential config]
 (value/require-runtime!)
 (when-not (and (instance? Credential credential) (contains? accepted (.-scope ^Credential credential)) (instance? ClientConfig config))
   (throw (ex-info "Credential/configuration does not match this client scope" {:kind :configuration})))
 (Client. (WebmaniaClient. config (.-raw ^Credential credential)) scope))
(defn nfe-client ([credential] (nfe-client credential (ClientConfig/defaults))) ([credential config] (create-client :nfe #{:company} credential config)))
(defn monitor-client ([credential] (monitor-client credential (ClientConfig/defaults))) ([credential config] (create-client :monitor #{:monitor} credential config)))
(defn emitter-client ([credential] (emitter-client credential (ClientConfig/defaults))) ([credential config] (create-client :emitter #{:issuer} credential config)))
(defn reseller-client ([credential] (reseller-client credential (ClientConfig/defaults))) ([credential config] (create-client :reseller #{:reseller} credential config)))
(defn nfe-files-client ([credential] (nfe-files-client credential (ClientConfig/defaults))) ([credential config] (create-client :nfe-files #{:company :document-token :anonymous} credential config)))
(defn emitter-files-client ([credential] (emitter-files-client credential (ClientConfig/defaults))) ([credential config] (create-client :emitter-files #{:file-company :document-token :anonymous} credential config)))
(defn client-config [configure] (let [builder (ClientConfig/builder)] (configure builder) (.build builder)))
(defn invoke-typed [scope client class-name request method-name]
 (when-not (and (satisfies? ClientHandle client) (= scope (-scope client))) (throw (ex-info "Operation belongs to another client scope" {:kind :configuration})))
 (let [klass (Class/forName class-name)]
   (when-not (.isInstance klass request) (throw (ex-info "Expected the named typed operation request" {:kind :validation})))
   (try
     (.invoke (.getMethod WebmaniaClient method-name (into-array Class [klass])) (-engine client) (object-array [request]))
     (catch java.lang.reflect.InvocationTargetException e (throw (.getTargetException e))))))
