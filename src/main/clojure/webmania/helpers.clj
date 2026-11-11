(ns webmania.helpers
 (:require [webmania.core :as core])
 (:import [com.webmania.sdk WebmaniaClient PaginationOptions PollingOptions Download]
          [com.webmania.sdk.model.api2monitorreads MonitorListCompaniesRequest MonitorListCompanyMunicipalitiesRequest]
          [com.webmania.sdk.model.api2monitordocuments MonitorListReportsRequest MonitorGetImportStatusRequest]
          [com.webmania.sdk.model.api1fiscal FiscalCreateOrPollReportRequest]
          [java.time Duration]))
(defn- invalid [] (throw (ex-info "Expected valid bounded helper arguments" {:kind :validation})))
(defn pagination-options [{:keys [max-pages max-items deadline-ms] :or {max-pages 10 max-items 1000 deadline-ms 30000}}]
 (when-not (and (integer? max-pages) (<= 1 max-pages 1000) (integer? max-items) (<= 1 max-items 100000) (integer? deadline-ms) (<= 1 deadline-ms 3600000)) (invalid))
 (PaginationOptions. (int max-pages) (int max-items) (Duration/ofMillis (long deadline-ms))))
(defn polling-options [{:keys [max-attempts deadline-ms interval-ms] :or {max-attempts 10 deadline-ms 60000 interval-ms 5000}}]
 (when-not (and (integer? max-attempts) (<= 1 max-attempts 1000) (integer? deadline-ms) (<= 1 deadline-ms 3600000) (integer? interval-ms) (<= 5000 interval-ms 3600000)) (invalid))
 (PollingOptions. (int max-attempts) (Duration/ofMillis (long deadline-ms)) (Duration/ofMillis (long interval-ms))))
(defn- engine ^WebmaniaClient [scope client]
 (when-not (and (satisfies? core/ClientHandle client) (= scope (core/-scope client))) (invalid))
 (core/-engine client))
(defn collect-companies [client request options]
 (when-not (and (instance? MonitorListCompaniesRequest request) (instance? PaginationOptions options)) (invalid))
 (.companies (.pagination (engine :monitor client)) request options))
(defn collect-company-municipalities [client request options]
 (when-not (and (instance? MonitorListCompanyMunicipalitiesRequest request) (instance? PaginationOptions options)) (invalid))
 (.companyMunicipalities (.pagination (engine :monitor client)) request options))
(defn collect-reports [client request options]
 (when-not (and (instance? MonitorListReportsRequest request) (instance? PaginationOptions options)) (invalid))
 (.reports (.pagination (engine :monitor client)) request options))
(defn wait-import [client request options]
 (when-not (and (instance? MonitorGetImportStatusRequest request) (instance? PollingOptions options)) (invalid))
 (.monitorImport (.processing (engine :monitor client)) request options))
(defn wait-report [client request options]
 (when-not (and (instance? FiscalCreateOrPollReportRequest request) (instance? PollingOptions options)) (invalid))
 (.fiscalReport (.processing (engine :nfe client)) request options))
(defn download-report
 "Downloads the url of a completed report through fiscalDownloadReportV2 with an nfe-files client: only the configured
 report origin under /relatorios/<uuid> is accepted, before any credential is used; redirects are never followed."
 [client url]
 (when-not (string? url) (invalid))
 (.fiscalReportDownload (engine :nfe-files client) ^String url))
(defn download-kind [value] (when-not (instance? Download value) (invalid)) (some-> (.kind ^Download value) .name keyword))
(defn download-protection [value] (when-not (instance? Download value) (invalid)) (some-> (.protection ^Download value) .name keyword))
(defn download-encrypted? [value] (when-not (instance? Download value) (invalid)) (.encrypted ^Download value))
(defn download-bytes [value]
 (when-not (and (instance? Download value) (not (.pending ^Download value)) (not (.isRedirect ^Download value))) (invalid))
 (.bytes ^Download value))
