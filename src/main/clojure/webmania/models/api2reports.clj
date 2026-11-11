(ns webmania.models.api2reports (:require [webmania.value :as value]))

(defn ^{:model-class "com.webmania.sdk.model.api2reports.FiscalDownloadReportV2Request"} fiscal-download-report-v2-request
  ([] (value/model "com.webmania.sdk.model.api2reports.FiscalDownloadReportV2Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api2reports.FiscalDownloadReportV2Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2reports.ReportError"} report-error
  ([] (value/model "com.webmania.sdk.model.api2reports.ReportError" {}))
  ([values] (value/model "com.webmania.sdk.model.api2reports.ReportError" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2reports.ReportHttpError"} report-http-error
  ([] (value/model "com.webmania.sdk.model.api2reports.ReportHttpError" {}))
  ([values] (value/model "com.webmania.sdk.model.api2reports.ReportHttpError" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2reports.ReportUuid"} report-uuid
  ([values] (value/model "com.webmania.sdk.model.api2reports.ReportUuid" values)))

