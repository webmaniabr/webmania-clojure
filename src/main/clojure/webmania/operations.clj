(ns webmania.operations (:require [webmania.core :as core] [webmania.value :as value]))

(defn ^{:operation-id "nfeGetCertificateValidity" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeGetCertificateValidityRequest"} nfe-get-certificate-validity
  ([client] (nfe-get-certificate-validity client (value/model "com.webmania.sdk.model.api1fiscal.NfeGetCertificateValidityRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeGetCertificateValidityRequest" request "nfeGetCertificateValidity")))

(defn ^{:operation-id "nfeGetSefazStatus" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest"} nfe-get-sefaz-status
  ([client] (nfe-get-sefaz-status client (value/model "com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest" request "nfeGetSefazStatus")))

(defn ^{:operation-id "nfeGetDocument" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeGetDocumentRequest"} nfe-get-document
  ([client] (nfe-get-document client (value/model "com.webmania.sdk.model.api1fiscal.NfeGetDocumentRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeGetDocumentRequest" request "nfeGetDocument")))

(defn ^{:operation-id "nfeQueryDocument" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentRequest"} nfe-query-document
  ([client] (nfe-query-document client (value/model "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentRequest" request "nfeQueryDocument")))

(defn ^{:operation-id "nfeCreateCorrection" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeCreateCorrectionRequest"} nfe-create-correction
  ([client] (nfe-create-correction client (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateCorrectionRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeCreateCorrectionRequest" request "nfeCreateCorrection")))

(defn ^{:operation-id "nfeCreateManifestation" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeCreateManifestationRequest"} nfe-create-manifestation
  ([client] (nfe-create-manifestation client (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateManifestationRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeCreateManifestationRequest" request "nfeCreateManifestation")))

(defn ^{:operation-id "nfeCancelDocument" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeCancelDocumentRequest"} nfe-cancel-document
  ([client] (nfe-cancel-document client (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelDocumentRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeCancelDocumentRequest" request "nfeCancelDocument")))

(defn ^{:operation-id "nfeVoidNumbering" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeVoidNumberingRequest"} nfe-void-numbering
  ([client] (nfe-void-numbering client (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidNumberingRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeVoidNumberingRequest" request "nfeVoidNumbering")))

(defn ^{:operation-id "nfeCreatePaymentEvent" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeCreatePaymentEventRequest"} nfe-create-payment-event
  ([client] (nfe-create-payment-event client (value/model "com.webmania.sdk.model.api1fiscal.NfeCreatePaymentEventRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeCreatePaymentEventRequest" request "nfeCreatePaymentEvent")))

(defn ^{:operation-id "nfeCancelPaymentEvent" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeCancelPaymentEventRequest"} nfe-cancel-payment-event
  ([client] (nfe-cancel-payment-event client (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelPaymentEventRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeCancelPaymentEventRequest" request "nfeCancelPaymentEvent")))

(defn ^{:operation-id "nfeCancelIbsCbsEvent" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeCancelIbsCbsEventRequest"} nfe-cancel-ibs-cbs-event
  ([client] (nfe-cancel-ibs-cbs-event client (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelIbsCbsEventRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeCancelIbsCbsEventRequest" request "nfeCancelIbsCbsEvent")))

(defn ^{:operation-id "nfeListTaxClasses" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeListTaxClassesRequest"} nfe-list-tax-classes
  ([client] (nfe-list-tax-classes client (value/model "com.webmania.sdk.model.api1fiscal.NfeListTaxClassesRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeListTaxClassesRequest" request "nfeListTaxClasses")))

(defn ^{:operation-id "nfeDeleteTaxClasses" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeDeleteTaxClassesRequest"} nfe-delete-tax-classes
  ([client] (nfe-delete-tax-classes client (value/model "com.webmania.sdk.model.api1fiscal.NfeDeleteTaxClassesRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeDeleteTaxClassesRequest" request "nfeDeleteTaxClasses")))

(defn ^{:operation-id "nfeSaveTaxClasses" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeSaveTaxClassesRequest"} nfe-save-tax-classes
  ([client] (nfe-save-tax-classes client (value/model "com.webmania.sdk.model.api1fiscal.NfeSaveTaxClassesRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeSaveTaxClassesRequest" request "nfeSaveTaxClasses")))

(defn ^{:operation-id "nfeIssueDocument" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeIssueDocumentRequest"} nfe-issue-document
  ([client] (nfe-issue-document client (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueDocumentRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeIssueDocumentRequest" request "nfeIssueDocument")))

(defn ^{:operation-id "nfeIssueReturn" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeIssueReturnRequest"} nfe-issue-return
  ([client] (nfe-issue-return client (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueReturnRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeIssueReturnRequest" request "nfeIssueReturn")))

(defn ^{:operation-id "nfeIssueAdjustment" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeIssueAdjustmentRequest"} nfe-issue-adjustment
  ([client] (nfe-issue-adjustment client (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueAdjustmentRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeIssueAdjustmentRequest" request "nfeIssueAdjustment")))

(defn ^{:operation-id "nfeIssueComplement" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeIssueComplementRequest"} nfe-issue-complement
  ([client] (nfe-issue-complement client (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueComplementRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeIssueComplementRequest" request "nfeIssueComplement")))

(defn ^{:operation-id "fiscalUpdateCompany" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyRequest"} fiscal-update-company
  ([client] (fiscal-update-company client (value/model "com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyRequest" request "fiscalUpdateCompany")))

(defn ^{:operation-id "fiscalCreateOrPollReport" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest"} fiscal-create-or-poll-report
  ([client] (fiscal-create-or-poll-report client (value/model "com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest" request "fiscalCreateOrPollReport")))

(defn ^{:operation-id "nfeCreateIbsCbsEvent" :scope :nfe :request-type "com.webmania.sdk.model.api1fiscal.NfeCreateIbsCbsEventRequest"} nfe-create-ibs-cbs-event
  ([client] (nfe-create-ibs-cbs-event client (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateIbsCbsEventRequest" {})))
  ([client request] (core/invoke-typed :nfe client "com.webmania.sdk.model.api1fiscal.NfeCreateIbsCbsEventRequest" request "nfeCreateIbsCbsEvent")))

(defn ^{:operation-id "nfeDownloadDanfe" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadDanfeRequest"} nfe-download-danfe
  ([client] (nfe-download-danfe client (value/model "com.webmania.sdk.model.api1files.NfeDownloadDanfeRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadDanfeRequest" request "nfeDownloadDanfe")))

(defn ^{:operation-id "nfeDownloadSimpleDanfe" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadSimpleDanfeRequest"} nfe-download-simple-danfe
  ([client] (nfe-download-simple-danfe client (value/model "com.webmania.sdk.model.api1files.NfeDownloadSimpleDanfeRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadSimpleDanfeRequest" request "nfeDownloadSimpleDanfe")))

(defn ^{:operation-id "nfeDownloadLabelDanfe" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadLabelDanfeRequest"} nfe-download-label-danfe
  ([client] (nfe-download-label-danfe client (value/model "com.webmania.sdk.model.api1files.NfeDownloadLabelDanfeRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadLabelDanfeRequest" request "nfeDownloadLabelDanfe")))

(defn ^{:operation-id "nfeDownloadCorrectionPdf" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfRequest"} nfe-download-correction-pdf
  ([client] (nfe-download-correction-pdf client (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfRequest" request "nfeDownloadCorrectionPdf")))

(defn ^{:operation-id "nfeDownloadCorrectionPdfSequence" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfSequenceRequest"} nfe-download-correction-pdf-sequence
  ([client] (nfe-download-correction-pdf-sequence client (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfSequenceRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadCorrectionPdfSequenceRequest" request "nfeDownloadCorrectionPdfSequence")))

(defn ^{:operation-id "nfeDownloadXml" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadXmlRequest"} nfe-download-xml
  ([client] (nfe-download-xml client (value/model "com.webmania.sdk.model.api1files.NfeDownloadXmlRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadXmlRequest" request "nfeDownloadXml")))

(defn ^{:operation-id "nfeDownloadCancellationXml" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadCancellationXmlRequest"} nfe-download-cancellation-xml
  ([client] (nfe-download-cancellation-xml client (value/model "com.webmania.sdk.model.api1files.NfeDownloadCancellationXmlRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadCancellationXmlRequest" request "nfeDownloadCancellationXml")))

(defn ^{:operation-id "nfeDownloadCorrectionXml" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlRequest"} nfe-download-correction-xml
  ([client] (nfe-download-correction-xml client (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlRequest" request "nfeDownloadCorrectionXml")))

(defn ^{:operation-id "nfeDownloadCorrectionXmlSequence" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlSequenceRequest"} nfe-download-correction-xml-sequence
  ([client] (nfe-download-correction-xml-sequence client (value/model "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlSequenceRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadCorrectionXmlSequenceRequest" request "nfeDownloadCorrectionXmlSequence")))

(defn ^{:operation-id "nfeDownloadManifestationXml" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadManifestationXmlRequest"} nfe-download-manifestation-xml
  ([client] (nfe-download-manifestation-xml client (value/model "com.webmania.sdk.model.api1files.NfeDownloadManifestationXmlRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadManifestationXmlRequest" request "nfeDownloadManifestationXml")))

(defn ^{:operation-id "nfeDownloadPaymentEventXml" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlRequest"} nfe-download-payment-event-xml
  ([client] (nfe-download-payment-event-xml client (value/model "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlRequest" request "nfeDownloadPaymentEventXml")))

(defn ^{:operation-id "nfeDownloadPaymentEventXmlSequence" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlSequenceRequest"} nfe-download-payment-event-xml-sequence
  ([client] (nfe-download-payment-event-xml-sequence client (value/model "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlSequenceRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadPaymentEventXmlSequenceRequest" request "nfeDownloadPaymentEventXmlSequence")))

(defn ^{:operation-id "nfeDownloadIbsCbsEventXml" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.NfeDownloadIbsCbsEventXmlRequest"} nfe-download-ibs-cbs-event-xml
  ([client] (nfe-download-ibs-cbs-event-xml client (value/model "com.webmania.sdk.model.api1files.NfeDownloadIbsCbsEventXmlRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.NfeDownloadIbsCbsEventXmlRequest" request "nfeDownloadIbsCbsEventXml")))

(defn ^{:operation-id "fiscalDownloadReport" :scope :nfe-files :request-type "com.webmania.sdk.model.api1files.FiscalDownloadReportRequest"} fiscal-download-report
  ([client] (fiscal-download-report client (value/model "com.webmania.sdk.model.api1files.FiscalDownloadReportRequest" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api1files.FiscalDownloadReportRequest" request "fiscalDownloadReport")))

(defn ^{:operation-id "b2bV1CreateCompanies" :scope :reseller :request-type "com.webmania.sdk.model.api1b2b.B2bV1CreateCompaniesRequest"} b2b-v1-create-companies
  ([client] (b2b-v1-create-companies client (value/model "com.webmania.sdk.model.api1b2b.B2bV1CreateCompaniesRequest" {})))
  ([client request] (core/invoke-typed :reseller client "com.webmania.sdk.model.api1b2b.B2bV1CreateCompaniesRequest" request "b2bV1CreateCompanies")))

(defn ^{:operation-id "b2bV1ListCompanies" :scope :reseller :request-type "com.webmania.sdk.model.api1b2b.B2bV1ListCompaniesRequest"} b2b-v1-list-companies
  ([client] (b2b-v1-list-companies client (value/model "com.webmania.sdk.model.api1b2b.B2bV1ListCompaniesRequest" {})))
  ([client request] (core/invoke-typed :reseller client "com.webmania.sdk.model.api1b2b.B2bV1ListCompaniesRequest" request "b2bV1ListCompanies")))

(defn ^{:operation-id "b2bV1GetProcessedRequests" :scope :reseller :request-type "com.webmania.sdk.model.api1b2b.B2bV1GetProcessedRequestsRequest"} b2b-v1-get-processed-requests
  ([client] (b2b-v1-get-processed-requests client (value/model "com.webmania.sdk.model.api1b2b.B2bV1GetProcessedRequestsRequest" {})))
  ([client request] (core/invoke-typed :reseller client "com.webmania.sdk.model.api1b2b.B2bV1GetProcessedRequestsRequest" request "b2bV1GetProcessedRequests")))

(defn ^{:operation-id "emitterIssueCte" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterIssueCteRequest"} emitter-issue-cte
  ([client] (emitter-issue-cte client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterIssueCteRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterIssueCteRequest" request "emitterIssueCte")))

(defn ^{:operation-id "emitterIssueSimplifiedCte" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterIssueSimplifiedCteRequest"} emitter-issue-simplified-cte
  ([client] (emitter-issue-simplified-cte client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterIssueSimplifiedCteRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterIssueSimplifiedCteRequest" request "emitterIssueSimplifiedCte")))

(defn ^{:operation-id "emitterCancelCte" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterCancelCteRequest"} emitter-cancel-cte
  ([client] (emitter-cancel-cte client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterCancelCteRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterCancelCteRequest" request "emitterCancelCte")))

(defn ^{:operation-id "emitterCorrectCte" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterCorrectCteRequest"} emitter-correct-cte
  ([client] (emitter-correct-cte client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterCorrectCteRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterCorrectCteRequest" request "emitterCorrectCte")))

(defn ^{:operation-id "emitterConfirmCteDelivery" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterConfirmCteDeliveryRequest"} emitter-confirm-cte-delivery
  ([client] (emitter-confirm-cte-delivery client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterConfirmCteDeliveryRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterConfirmCteDeliveryRequest" request "emitterConfirmCteDelivery")))

(defn ^{:operation-id "emitterCancelCteDelivery" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterCancelCteDeliveryRequest"} emitter-cancel-cte-delivery
  ([client] (emitter-cancel-cte-delivery client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterCancelCteDeliveryRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterCancelCteDeliveryRequest" request "emitterCancelCteDelivery")))

(defn ^{:operation-id "emitterLinkCtePayment" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterLinkCtePaymentRequest"} emitter-link-cte-payment
  ([client] (emitter-link-cte-payment client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterLinkCtePaymentRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterLinkCtePaymentRequest" request "emitterLinkCtePayment")))

(defn ^{:operation-id "emitterCancelCtePaymentLink" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterCancelCtePaymentLinkRequest"} emitter-cancel-cte-payment-link
  ([client] (emitter-cancel-cte-payment-link client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterCancelCtePaymentLinkRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterCancelCtePaymentLinkRequest" request "emitterCancelCtePaymentLink")))

(defn ^{:operation-id "emitterGetCte" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterGetCteRequest"} emitter-get-cte
  ([client] (emitter-get-cte client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterGetCteRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterGetCteRequest" request "emitterGetCte")))

(defn ^{:operation-id "emitterGetCtePaymentEvents" :scope :emitter :request-type "com.webmania.sdk.model.api2cteissuance.EmitterGetCtePaymentEventsRequest"} emitter-get-cte-payment-events
  ([client] (emitter-get-cte-payment-events client (value/model "com.webmania.sdk.model.api2cteissuance.EmitterGetCtePaymentEventsRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2cteissuance.EmitterGetCtePaymentEventsRequest" request "emitterGetCtePaymentEvents")))

(defn ^{:operation-id "emitterIssueDce" :scope :emitter :request-type "com.webmania.sdk.model.api2dceissuance.EmitterIssueDceRequest"} emitter-issue-dce
  ([client] (emitter-issue-dce client (value/model "com.webmania.sdk.model.api2dceissuance.EmitterIssueDceRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2dceissuance.EmitterIssueDceRequest" request "emitterIssueDce")))

(defn ^{:operation-id "emitterCancelDce" :scope :emitter :request-type "com.webmania.sdk.model.api2dceissuance.EmitterCancelDceRequest"} emitter-cancel-dce
  ([client] (emitter-cancel-dce client (value/model "com.webmania.sdk.model.api2dceissuance.EmitterCancelDceRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2dceissuance.EmitterCancelDceRequest" request "emitterCancelDce")))

(defn ^{:operation-id "emitterGetDce" :scope :emitter :request-type "com.webmania.sdk.model.api2dceissuance.EmitterGetDceRequest"} emitter-get-dce
  ([client] (emitter-get-dce client (value/model "com.webmania.sdk.model.api2dceissuance.EmitterGetDceRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2dceissuance.EmitterGetDceRequest" request "emitterGetDce")))

(defn ^{:operation-id "fileGetNfseXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetNfseXmlRequest"} file-get-nfse-xml
  ([client] (file-get-nfse-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetNfseXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetNfseXmlRequest" request "fileGetNfseXml")))

(defn ^{:operation-id "fileGetNfsePdf" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetNfsePdfRequest"} file-get-nfse-pdf
  ([client] (file-get-nfse-pdf client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetNfsePdfRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetNfsePdfRequest" request "fileGetNfsePdf")))

(defn ^{:operation-id "fileGetNfseRpsPdf" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetNfseRpsPdfRequest"} file-get-nfse-rps-pdf
  ([client] (file-get-nfse-rps-pdf client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetNfseRpsPdfRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetNfseRpsPdfRequest" request "fileGetNfseRpsPdf")))

(defn ^{:operation-id "fileGetCteXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetCteXmlRequest"} file-get-cte-xml
  ([client] (file-get-cte-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetCteXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetCteXmlRequest" request "fileGetCteXml")))

(defn ^{:operation-id "fileGetCteCancelXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetCteCancelXmlRequest"} file-get-cte-cancel-xml
  ([client] (file-get-cte-cancel-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetCteCancelXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetCteCancelXmlRequest" request "fileGetCteCancelXml")))

(defn ^{:operation-id "fileGetCtePdf" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetCtePdfRequest"} file-get-cte-pdf
  ([client] (file-get-cte-pdf client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetCtePdfRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetCtePdfRequest" request "fileGetCtePdf")))

(defn ^{:operation-id "fileGetCteCorrectionXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetCteCorrectionXmlRequest"} file-get-cte-correction-xml
  ([client] (file-get-cte-correction-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetCteCorrectionXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetCteCorrectionXmlRequest" request "fileGetCteCorrectionXml")))

(defn ^{:operation-id "fileGetCteCorrectionPdf" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetCteCorrectionPdfRequest"} file-get-cte-correction-pdf
  ([client] (file-get-cte-correction-pdf client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetCteCorrectionPdfRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetCteCorrectionPdfRequest" request "fileGetCteCorrectionPdf")))

(defn ^{:operation-id "fileGetMdfeXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetMdfeXmlRequest"} file-get-mdfe-xml
  ([client] (file-get-mdfe-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetMdfeXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetMdfeXmlRequest" request "fileGetMdfeXml")))

(defn ^{:operation-id "fileGetMdfePdf" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetMdfePdfRequest"} file-get-mdfe-pdf
  ([client] (file-get-mdfe-pdf client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetMdfePdfRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetMdfePdfRequest" request "fileGetMdfePdf")))

(defn ^{:operation-id "fileGetNfcomXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomXmlRequest"} file-get-nfcom-xml
  ([client] (file-get-nfcom-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomXmlRequest" request "fileGetNfcomXml")))

(defn ^{:operation-id "fileGetNfcomCancelXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomCancelXmlRequest"} file-get-nfcom-cancel-xml
  ([client] (file-get-nfcom-cancel-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomCancelXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomCancelXmlRequest" request "fileGetNfcomCancelXml")))

(defn ^{:operation-id "fileGetNfcomPdf" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomPdfRequest"} file-get-nfcom-pdf
  ([client] (file-get-nfcom-pdf client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomPdfRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetNfcomPdfRequest" request "fileGetNfcomPdf")))

(defn ^{:operation-id "fileGetDceXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetDceXmlRequest"} file-get-dce-xml
  ([client] (file-get-dce-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetDceXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetDceXmlRequest" request "fileGetDceXml")))

(defn ^{:operation-id "fileGetDceCancelXml" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetDceCancelXmlRequest"} file-get-dce-cancel-xml
  ([client] (file-get-dce-cancel-xml client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetDceCancelXmlRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetDceCancelXmlRequest" request "fileGetDceCancelXml")))

(defn ^{:operation-id "fileGetDcePdf" :scope :emitter-files :request-type "com.webmania.sdk.model.api2emitterfiles.FileGetDcePdfRequest"} file-get-dce-pdf
  ([client] (file-get-dce-pdf client (value/model "com.webmania.sdk.model.api2emitterfiles.FileGetDcePdfRequest" {})))
  ([client request] (core/invoke-typed :emitter-files client "com.webmania.sdk.model.api2emitterfiles.FileGetDcePdfRequest" request "fileGetDcePdf")))

(defn ^{:operation-id "emitterGetNfseProviderStatus" :scope :emitter :request-type "com.webmania.sdk.model.api2emitterreads.EmitterGetNfseProviderStatusRequest"} emitter-get-nfse-provider-status
  ([client] (emitter-get-nfse-provider-status client (value/model "com.webmania.sdk.model.api2emitterreads.EmitterGetNfseProviderStatusRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2emitterreads.EmitterGetNfseProviderStatusRequest" request "emitterGetNfseProviderStatus")))

(defn ^{:operation-id "emitterGetNfcomServiceStatus" :scope :emitter :request-type "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomServiceStatusRequest"} emitter-get-nfcom-service-status
  ([client] (emitter-get-nfcom-service-status client (value/model "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomServiceStatusRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomServiceStatusRequest" request "emitterGetNfcomServiceStatus")))

(defn ^{:operation-id "emitterGetNfse" :scope :emitter :request-type "com.webmania.sdk.model.api2emitterreads.EmitterGetNfseRequest"} emitter-get-nfse
  ([client] (emitter-get-nfse client (value/model "com.webmania.sdk.model.api2emitterreads.EmitterGetNfseRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2emitterreads.EmitterGetNfseRequest" request "emitterGetNfse")))

(defn ^{:operation-id "emitterGetNfcom" :scope :emitter :request-type "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomRequest"} emitter-get-nfcom
  ([client] (emitter-get-nfcom client (value/model "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomRequest" request "emitterGetNfcom")))

(defn ^{:operation-id "emitterGetNfcomPaymentEvents" :scope :emitter :request-type "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomPaymentEventsRequest"} emitter-get-nfcom-payment-events
  ([client] (emitter-get-nfcom-payment-events client (value/model "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomPaymentEventsRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2emitterreads.EmitterGetNfcomPaymentEventsRequest" request "emitterGetNfcomPaymentEvents")))

(defn ^{:operation-id "emitterManifestNfse" :scope :emitter :request-type "com.webmania.sdk.model.api2emitterreads.EmitterManifestNfseRequest"} emitter-manifest-nfse
  ([client] (emitter-manifest-nfse client (value/model "com.webmania.sdk.model.api2emitterreads.EmitterManifestNfseRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2emitterreads.EmitterManifestNfseRequest" request "emitterManifestNfse")))

(defn ^{:operation-id "emitterIssueMdfe" :scope :emitter :request-type "com.webmania.sdk.model.api2mdfeissuance.EmitterIssueMdfeRequest"} emitter-issue-mdfe
  ([client] (emitter-issue-mdfe client (value/model "com.webmania.sdk.model.api2mdfeissuance.EmitterIssueMdfeRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2mdfeissuance.EmitterIssueMdfeRequest" request "emitterIssueMdfe")))

(defn ^{:operation-id "emitterCloseMdfe" :scope :emitter :request-type "com.webmania.sdk.model.api2mdfeissuance.EmitterCloseMdfeRequest"} emitter-close-mdfe
  ([client] (emitter-close-mdfe client (value/model "com.webmania.sdk.model.api2mdfeissuance.EmitterCloseMdfeRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2mdfeissuance.EmitterCloseMdfeRequest" request "emitterCloseMdfe")))

(defn ^{:operation-id "emitterCancelMdfe" :scope :emitter :request-type "com.webmania.sdk.model.api2mdfeissuance.EmitterCancelMdfeRequest"} emitter-cancel-mdfe
  ([client] (emitter-cancel-mdfe client (value/model "com.webmania.sdk.model.api2mdfeissuance.EmitterCancelMdfeRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2mdfeissuance.EmitterCancelMdfeRequest" request "emitterCancelMdfe")))

(defn ^{:operation-id "emitterAddMdfeConductor" :scope :emitter :request-type "com.webmania.sdk.model.api2mdfeissuance.EmitterAddMdfeConductorRequest"} emitter-add-mdfe-conductor
  ([client] (emitter-add-mdfe-conductor client (value/model "com.webmania.sdk.model.api2mdfeissuance.EmitterAddMdfeConductorRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2mdfeissuance.EmitterAddMdfeConductorRequest" request "emitterAddMdfeConductor")))

(defn ^{:operation-id "emitterGetMdfe" :scope :emitter :request-type "com.webmania.sdk.model.api2mdfeissuance.EmitterGetMdfeRequest"} emitter-get-mdfe
  ([client] (emitter-get-mdfe client (value/model "com.webmania.sdk.model.api2mdfeissuance.EmitterGetMdfeRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2mdfeissuance.EmitterGetMdfeRequest" request "emitterGetMdfe")))

(defn ^{:operation-id "monitorSearchDocuments" :scope :monitor :request-type "com.webmania.sdk.model.api2monitordocuments.MonitorSearchDocumentsRequest"} monitor-search-documents
  ([client] (monitor-search-documents client (value/model "com.webmania.sdk.model.api2monitordocuments.MonitorSearchDocumentsRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitordocuments.MonitorSearchDocumentsRequest" request "monitorSearchDocuments")))

(defn ^{:operation-id "monitorGetDocument" :scope :monitor :request-type "com.webmania.sdk.model.api2monitordocuments.MonitorGetDocumentRequest"} monitor-get-document
  ([client] (monitor-get-document client (value/model "com.webmania.sdk.model.api2monitordocuments.MonitorGetDocumentRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitordocuments.MonitorGetDocumentRequest" request "monitorGetDocument")))

(defn ^{:operation-id "monitorListDocumentEvents" :scope :monitor :request-type "com.webmania.sdk.model.api2monitordocuments.MonitorListDocumentEventsRequest"} monitor-list-document-events
  ([client] (monitor-list-document-events client (value/model "com.webmania.sdk.model.api2monitordocuments.MonitorListDocumentEventsRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitordocuments.MonitorListDocumentEventsRequest" request "monitorListDocumentEvents")))

(defn ^{:operation-id "monitorManifestDocument" :scope :monitor :request-type "com.webmania.sdk.model.api2monitordocuments.MonitorManifestDocumentRequest"} monitor-manifest-document
  ([client] (monitor-manifest-document client (value/model "com.webmania.sdk.model.api2monitordocuments.MonitorManifestDocumentRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitordocuments.MonitorManifestDocumentRequest" request "monitorManifestDocument")))

(defn ^{:operation-id "monitorListReports" :scope :monitor :request-type "com.webmania.sdk.model.api2monitordocuments.MonitorListReportsRequest"} monitor-list-reports
  ([client] (monitor-list-reports client (value/model "com.webmania.sdk.model.api2monitordocuments.MonitorListReportsRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitordocuments.MonitorListReportsRequest" request "monitorListReports")))

(defn ^{:operation-id "monitorDownloadReport" :scope :monitor :request-type "com.webmania.sdk.model.api2monitordocuments.MonitorDownloadReportRequest"} monitor-download-report
  ([client] (monitor-download-report client (value/model "com.webmania.sdk.model.api2monitordocuments.MonitorDownloadReportRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitordocuments.MonitorDownloadReportRequest" request "monitorDownloadReport")))

(defn ^{:operation-id "monitorImportDocument" :scope :monitor :request-type "com.webmania.sdk.model.api2monitordocuments.MonitorImportDocumentRequest"} monitor-import-document
  ([client] (monitor-import-document client (value/model "com.webmania.sdk.model.api2monitordocuments.MonitorImportDocumentRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitordocuments.MonitorImportDocumentRequest" request "monitorImportDocument")))

(defn ^{:operation-id "monitorGetImportStatus" :scope :monitor :request-type "com.webmania.sdk.model.api2monitordocuments.MonitorGetImportStatusRequest"} monitor-get-import-status
  ([client] (monitor-get-import-status client (value/model "com.webmania.sdk.model.api2monitordocuments.MonitorGetImportStatusRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitordocuments.MonitorGetImportStatusRequest" request "monitorGetImportStatus")))

(defn ^{:operation-id "monitorCreateCompany" :scope :monitor :request-type "com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyParameters"} monitor-create-company
  ([client] (monitor-create-company client (value/model "com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyParameters" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyParameters" request "monitorCreateCompany")))

(defn ^{:operation-id "monitorUpdateCompany" :scope :monitor :request-type "com.webmania.sdk.model.api2monitormanagement.MonitorUpdateCompanyParameters"} monitor-update-company
  ([client] (monitor-update-company client (value/model "com.webmania.sdk.model.api2monitormanagement.MonitorUpdateCompanyParameters" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitormanagement.MonitorUpdateCompanyParameters" request "monitorUpdateCompany")))

(defn ^{:operation-id "monitorCreateCompanyMunicipality" :scope :monitor :request-type "com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyMunicipalityRequest"} monitor-create-company-municipality
  ([client] (monitor-create-company-municipality client (value/model "com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyMunicipalityRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyMunicipalityRequest" request "monitorCreateCompanyMunicipality")))

(defn ^{:operation-id "monitorUpdateCompanyMunicipality" :scope :monitor :request-type "com.webmania.sdk.model.api2monitormanagement.MonitorUpdateCompanyMunicipalityRequest"} monitor-update-company-municipality
  ([client] (monitor-update-company-municipality client (value/model "com.webmania.sdk.model.api2monitormanagement.MonitorUpdateCompanyMunicipalityRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitormanagement.MonitorUpdateCompanyMunicipalityRequest" request "monitorUpdateCompanyMunicipality")))

(defn ^{:operation-id "monitorDeleteCompanyMunicipality" :scope :monitor :request-type "com.webmania.sdk.model.api2monitormanagement.MonitorDeleteCompanyMunicipalityRequest"} monitor-delete-company-municipality
  ([client] (monitor-delete-company-municipality client (value/model "com.webmania.sdk.model.api2monitormanagement.MonitorDeleteCompanyMunicipalityRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitormanagement.MonitorDeleteCompanyMunicipalityRequest" request "monitorDeleteCompanyMunicipality")))

(defn ^{:operation-id "monitorListCompanies" :scope :monitor :request-type "com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest"} monitor-list-companies
  ([client] (monitor-list-companies client (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest" request "monitorListCompanies")))

(defn ^{:operation-id "monitorGetCompany" :scope :monitor :request-type "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyRequest"} monitor-get-company
  ([client] (monitor-get-company client (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyRequest" request "monitorGetCompany")))

(defn ^{:operation-id "monitorListCompanyMunicipalities" :scope :monitor :request-type "com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest"} monitor-list-company-municipalities
  ([client] (monitor-list-company-municipalities client (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest" request "monitorListCompanyMunicipalities")))

(defn ^{:operation-id "monitorGetCompanyMunicipality" :scope :monitor :request-type "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyMunicipalityRequest"} monitor-get-company-municipality
  ([client] (monitor-get-company-municipality client (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyMunicipalityRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyMunicipalityRequest" request "monitorGetCompanyMunicipality")))

(defn ^{:operation-id "monitorListAvailableMunicipalities" :scope :monitor :request-type "com.webmania.sdk.model.api2monitorreads.MonitorListAvailableMunicipalitiesRequest"} monitor-list-available-municipalities
  ([client] (monitor-list-available-municipalities client (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListAvailableMunicipalitiesRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitorreads.MonitorListAvailableMunicipalitiesRequest" request "monitorListAvailableMunicipalities")))

(defn ^{:operation-id "monitorGetDownloadStatistics" :scope :monitor :request-type "com.webmania.sdk.model.api2monitorreads.MonitorGetDownloadStatisticsRequest"} monitor-get-download-statistics
  ([client] (monitor-get-download-statistics client (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetDownloadStatisticsRequest" {})))
  ([client request] (core/invoke-typed :monitor client "com.webmania.sdk.model.api2monitorreads.MonitorGetDownloadStatisticsRequest" request "monitorGetDownloadStatistics")))

(defn ^{:operation-id "emitterIssueNfcom" :scope :emitter :request-type "com.webmania.sdk.model.api2nfcomissuance.EmitterIssueNfcomRequest"} emitter-issue-nfcom
  ([client] (emitter-issue-nfcom client (value/model "com.webmania.sdk.model.api2nfcomissuance.EmitterIssueNfcomRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2nfcomissuance.EmitterIssueNfcomRequest" request "emitterIssueNfcom")))

(defn ^{:operation-id "emitterCancelNfcom" :scope :emitter :request-type "com.webmania.sdk.model.api2nfcomissuance.EmitterCancelNfcomRequest"} emitter-cancel-nfcom
  ([client] (emitter-cancel-nfcom client (value/model "com.webmania.sdk.model.api2nfcomissuance.EmitterCancelNfcomRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2nfcomissuance.EmitterCancelNfcomRequest" request "emitterCancelNfcom")))

(defn ^{:operation-id "emitterIssueNfse" :scope :emitter :request-type "com.webmania.sdk.model.api2nfseissuance.EmitterIssueNfseRequest"} emitter-issue-nfse
  ([client] (emitter-issue-nfse client (value/model "com.webmania.sdk.model.api2nfseissuance.EmitterIssueNfseRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2nfseissuance.EmitterIssueNfseRequest" request "emitterIssueNfse")))

(defn ^{:operation-id "emitterCancelNfse" :scope :emitter :request-type "com.webmania.sdk.model.api2nfseissuance.EmitterCancelNfseRequest"} emitter-cancel-nfse
  ([client] (emitter-cancel-nfse client (value/model "com.webmania.sdk.model.api2nfseissuance.EmitterCancelNfseRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2nfseissuance.EmitterCancelNfseRequest" request "emitterCancelNfse")))

(defn ^{:operation-id "emitterReplaceNfse" :scope :emitter :request-type "com.webmania.sdk.model.api2nfseissuance.EmitterReplaceNfseRequest"} emitter-replace-nfse
  ([client] (emitter-replace-nfse client (value/model "com.webmania.sdk.model.api2nfseissuance.EmitterReplaceNfseRequest" {})))
  ([client request] (core/invoke-typed :emitter client "com.webmania.sdk.model.api2nfseissuance.EmitterReplaceNfseRequest" request "emitterReplaceNfse")))

(defn ^{:operation-id "fiscalDownloadReportV2" :scope :nfe-files :request-type "com.webmania.sdk.model.api2reports.FiscalDownloadReportV2Request"} fiscal-download-report-v2
  ([client] (fiscal-download-report-v2 client (value/model "com.webmania.sdk.model.api2reports.FiscalDownloadReportV2Request" {})))
  ([client request] (core/invoke-typed :nfe-files client "com.webmania.sdk.model.api2reports.FiscalDownloadReportV2Request" request "fiscalDownloadReportV2")))

