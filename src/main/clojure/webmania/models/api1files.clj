(ns webmania.models.api1files (:require [webmania.value :as value]))

(defn ^{:model-class "com.webmania.sdk.model.api1files.AccessKey"} access-key
  ([values] (value/model "com.webmania.sdk.model.api1files.AccessKey" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.Api1Error"} api1-error
  ([] (value/model "com.webmania.sdk.model.api1files.Api1Error" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.Api1Error" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.Api1ErrorCode"} api1-error-code
  ([values] (value/model "com.webmania.sdk.model.api1files.Api1ErrorCode" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.Api1ErrorError"} api1-error-error
  ([values] (value/model "com.webmania.sdk.model.api1files.Api1ErrorError" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.Api1ErrorLog"} api1-error-log
  ([values] (value/model "com.webmania.sdk.model.api1files.Api1ErrorLog" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.Api1ErrorLogVariant1"} api1-error-log-variant1
  ([] (value/model "com.webmania.sdk.model.api1files.Api1ErrorLogVariant1" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.Api1ErrorLogVariant1" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.Api1ErrorLogVariant1CStat"} api1-error-log-variant1-c-stat
  ([values] (value/model "com.webmania.sdk.model.api1files.Api1ErrorLogVariant1CStat" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.FiscalDownloadReportRequest"} fiscal-download-report-request
  ([] (value/model "com.webmania.sdk.model.api1files.FiscalDownloadReportRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.FiscalDownloadReportRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCancellationXmlRequest"} nfe-download-cancellation-xml-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCancellationXmlRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCancellationXmlRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCancellationXmlRequestIdentifier"} nfe-download-cancellation-xml-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCancellationXmlRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfRequest"} nfe-download-correction-pdf-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfRequestIdentifier"} nfe-download-correction-pdf-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfSequenceRequest"} nfe-download-correction-pdf-sequence-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfSequenceRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfSequenceRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfSequenceRequestIdentifier"} nfe-download-correction-pdf-sequence-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfSequenceRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlRequest"} nfe-download-correction-xml-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlRequestIdentifier"} nfe-download-correction-xml-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlSequenceRequest"} nfe-download-correction-xml-sequence-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlSequenceRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlSequenceRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlSequenceRequestIdentifier"} nfe-download-correction-xml-sequence-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlSequenceRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadDanfeRequest"} nfe-download-danfe-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadDanfeRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadDanfeRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadDanfeRequestIdentifier"} nfe-download-danfe-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadDanfeRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadIbsCbsEventXmlRequest"} nfe-download-ibs-cbs-event-xml-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadIbsCbsEventXmlRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadIbsCbsEventXmlRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadLabelDanfeRequest"} nfe-download-label-danfe-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadLabelDanfeRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadLabelDanfeRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadLabelDanfeRequestIdentifier"} nfe-download-label-danfe-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadLabelDanfeRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadManifestationXmlRequest"} nfe-download-manifestation-xml-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadManifestationXmlRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadManifestationXmlRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlRequest"} nfe-download-payment-event-xml-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlRequestIdentifier"} nfe-download-payment-event-xml-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlSequenceRequest"} nfe-download-payment-event-xml-sequence-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlSequenceRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlSequenceRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlSequenceRequestIdentifier"} nfe-download-payment-event-xml-sequence-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlSequenceRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadSimpleDanfeRequest"} nfe-download-simple-danfe-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadSimpleDanfeRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadSimpleDanfeRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadSimpleDanfeRequestIdentifier"} nfe-download-simple-danfe-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadSimpleDanfeRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadXmlRequest"} nfe-download-xml-request
  ([] (value/model "com.webmania.sdk.model.api1files.NfeDownloadXmlRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadXmlRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.NfeDownloadXmlRequestIdentifier"} nfe-download-xml-request-identifier
  ([values] (value/model "com.webmania.sdk.model.api1files.NfeDownloadXmlRequestIdentifier" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1files.Uuid"} uuid
  ([values] (value/model "com.webmania.sdk.model.api1files.Uuid" values)))

