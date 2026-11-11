(ns webmania.models.api1b2b (:require [webmania.value :as value]))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.B2bError"} b2b-error
  ([] (value/model "com.webmania.sdk.model.api1b2b.B2bError" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.B2bError" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.B2bFunctionalError"} b2b-functional-error
  ([] (value/model "com.webmania.sdk.model.api1b2b.B2bFunctionalError" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.B2bFunctionalError" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.B2bV1CreateCompaniesRequest"} b2b-v1-create-companies-request
  ([] (value/model "com.webmania.sdk.model.api1b2b.B2bV1CreateCompaniesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.B2bV1CreateCompaniesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.B2bV1CreateCompaniesResponse"} b2b-v1-create-companies-response
  ([values] (value/model "com.webmania.sdk.model.api1b2b.B2bV1CreateCompaniesResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.B2bV1GetProcessedRequestsRequest"} b2b-v1-get-processed-requests-request
  ([] (value/model "com.webmania.sdk.model.api1b2b.B2bV1GetProcessedRequestsRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.B2bV1GetProcessedRequestsRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.B2bV1GetProcessedRequestsResponse"} b2b-v1-get-processed-requests-response
  ([values] (value/model "com.webmania.sdk.model.api1b2b.B2bV1GetProcessedRequestsResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.B2bV1ListCompaniesRequest"} b2b-v1-list-companies-request
  ([] (value/model "com.webmania.sdk.model.api1b2b.B2bV1ListCompaniesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.B2bV1ListCompaniesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.B2bV1ListCompaniesResponse"} b2b-v1-list-companies-response
  ([values] (value/model "com.webmania.sdk.model.api1b2b.B2bV1ListCompaniesResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanies"} reseller-companies
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanies" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompany"} reseller-company
  ([] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompany" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompany" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyCidade"} reseller-company-cidade
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyCidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyCnpj"} reseller-company-cnpj
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyCnpj" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyCpf"} reseller-company-cpf
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyCpf" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyCredentials"} reseller-company-credentials
  ([] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyCredentials" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyCredentials" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyEstado"} reseller-company-estado
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyEstado" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyIe"} reseller-company-ie
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyIe" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyNomeCompleto"} reseller-company-nome-completo
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyNomeCompleto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequests"} reseller-company-processed-requests
  ([] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequests" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequests" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsCidade"} reseller-company-processed-requests-cidade
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsCidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsCnpj"} reseller-company-processed-requests-cnpj
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsCnpj" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsCpf"} reseller-company-processed-requests-cpf
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsCpf" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsEstado"} reseller-company-processed-requests-estado
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsEstado" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsIe"} reseller-company-processed-requests-ie
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsIe" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsNomeCompleto"} reseller-company-processed-requests-nome-completo
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsNomeCompleto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsRazaoSocial"} reseller-company-processed-requests-razao-social
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsRazaoSocial" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyRazaoSocial"} reseller-company-razao-social
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyRazaoSocial" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyTipoTributacao"} reseller-company-tipo-tributacao
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyTipoTributacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCompanyUnidadeEmpresa"} reseller-company-unidade-empresa
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCompanyUnidadeEmpresa" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCreateCompaniesRequest"} reseller-create-companies-request
  ([] (value/model "com.webmania.sdk.model.api1b2b.ResellerCreateCompaniesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCreateCompaniesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCreatedCompanies"} reseller-created-companies
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCreatedCompanies" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCreatedCompany"} reseller-created-company
  ([] (value/model "com.webmania.sdk.model.api1b2b.ResellerCreatedCompany" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCreatedCompany" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCreatedCompanyBearerAccessTokenRecoveryQueueStatus"} reseller-created-company-bearer-access-token-recovery-queue-status
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCreatedCompanyBearerAccessTokenRecoveryQueueStatus" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerCreatedCompanyBearerAccessTokenRecoveryQueued"} reseller-created-company-bearer-access-token-recovery-queued
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerCreatedCompanyBearerAccessTokenRecoveryQueued" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1b2b.ResellerProcessedRequests"} reseller-processed-requests
  ([] (value/model "com.webmania.sdk.model.api1b2b.ResellerProcessedRequests" {}))
  ([values] (value/model "com.webmania.sdk.model.api1b2b.ResellerProcessedRequests" values)))

