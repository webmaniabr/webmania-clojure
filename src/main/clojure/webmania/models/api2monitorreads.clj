(ns webmania.models.api2monitorreads (:require [webmania.value :as value]))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorAddress"} monitor-address
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorAddress" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorAddress" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorAddressCodigoMunicipio"} monitor-address-codigo-municipio
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorAddressCodigoMunicipio" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorAvailableMunicipalities"} monitor-available-municipalities
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorAvailableMunicipalities" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorAvailableMunicipalities" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorAvailableMunicipality"} monitor-available-municipality
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorAvailableMunicipality" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorAvailableMunicipality" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorCompany"} monitor-company
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorCompany" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorCompany" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorCompanyPage"} monitor-company-page
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorCompanyPage" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorCompanyPage" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorDownloadStatistics"} monitor-download-statistics
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorDownloadStatistics" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorDownloadStatistics" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorDownloadStatisticsEmpresasItem"} monitor-download-statistics-empresas-item
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorDownloadStatisticsEmpresasItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorDownloadStatisticsEmpresasItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorError"} monitor-error
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorError" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorError" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyMunicipalityRequest"} monitor-get-company-municipality-request
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyMunicipalityRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyMunicipalityRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyRequest"} monitor-get-company-request
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetCompanyRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorGetDownloadStatisticsRequest"} monitor-get-download-statistics-request
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetDownloadStatisticsRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorGetDownloadStatisticsRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorListAvailableMunicipalitiesRequest"} monitor-list-available-municipalities-request
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListAvailableMunicipalitiesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListAvailableMunicipalitiesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorListAvailableMunicipalitiesResponse"} monitor-list-available-municipalities-response
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListAvailableMunicipalitiesResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest"} monitor-list-companies-request
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest"} monitor-list-company-municipalities-request
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityPage"} monitor-municipality-page
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityPage" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityPage" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityRegistration"} monitor-municipality-registration
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityRegistration" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityRegistration" values)))

(defn ^{:model-class "com.webmania.sdk.model.api2monitorreads.MonitorPagination"} monitor-pagination
  ([] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorPagination" {}))
  ([values] (value/model "com.webmania.sdk.model.api2monitorreads.MonitorPagination" values)))

