(ns webmania.models.api1fiscal (:require [webmania.value :as value]))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.AccessKey"} access-key
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.AccessKey" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Api1Error"} api1-error
  ([] (value/model "com.webmania.sdk.model.api1fiscal.Api1Error" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Api1Error" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Api1ErrorCode"} api1-error-code
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Api1ErrorCode" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Api1ErrorError"} api1-error-error
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Api1ErrorError" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Api1ErrorLog"} api1-error-log
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Api1ErrorLog" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Api1ErrorLogVariant1"} api1-error-log-variant1
  ([] (value/model "com.webmania.sdk.model.api1fiscal.Api1ErrorLogVariant1" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Api1ErrorLogVariant1" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Api1ErrorLogVariant1CStat"} api1-error-log-variant1-c-stat
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Api1ErrorLogVariant1CStat" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Decimal"} decimal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Decimal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Environment"} environment
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Environment" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequest"} fiscal-company-update-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequestCnae"} fiscal-company-update-request-cnae
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequestCnae" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequestContabilidade"} fiscal-company-update-request-contabilidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateRequestContabilidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResult"} fiscal-company-update-result
  ([] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResult" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResultCredenciais"} fiscal-company-update-result-credenciais
  ([] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResultCredenciais" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResultCredenciais" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResultWarningsItem"} fiscal-company-update-result-warnings-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResultWarningsItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCompanyUpdateResultWarningsItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest"} fiscal-create-or-poll-report-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportResponse"} fiscal-create-or-poll-report-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalReportRequest"} fiscal-report-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.FiscalReportRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalReportRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalReportResult"} fiscal-report-result
  ([] (value/model "com.webmania.sdk.model.api1fiscal.FiscalReportResult" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalReportResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalReportResultNumeroFinal"} fiscal-report-result-numero-final
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalReportResultNumeroFinal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalReportResultNumeroInicio"} fiscal-report-result-numero-inicio
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalReportResultNumeroInicio" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalTaxClassRequest"} fiscal-tax-class-request
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalTaxClassRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalTaxClassRequestVariant3Item"} fiscal-tax-class-request-variant3-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalTaxClassRequestVariant3Item" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyRequest"} fiscal-update-company-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyResponse"} fiscal-update-company-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.FiscalUpdateCompanyResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G002"} g002
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G002" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G002" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G002Log"} g002-log
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G002Log" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G002LogCancelamento"} g002-log-cancelamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G002LogCancelamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G003"} g003
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G003" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G003" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G004"} g004
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G004" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G004" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G005"} g005
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G005" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G005" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G005CteReferenciada"} g005-cte-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G005CteReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G005EcfReferenciada"} g005-ecf-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G005EcfReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G005NfRuralReferenciada"} g005-nf-rural-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G005NfRuralReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G005NfeReferenciada"} g005-nfe-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G005NfeReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G006"} g006
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G006" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G006" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G007"} g007
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G007" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G007" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G008"} g008
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G008" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G008" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G009"} g009
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G009" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G009" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G010"} g010
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G010" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G010" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011"} g011
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G011" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011Desconto"} g011-desconto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011Desconto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011Peso"} g011-peso
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011Peso" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011Quantidade"} g011-quantidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011Quantidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011QuantidadeTributavel"} g011-quantidade-tributavel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011QuantidadeTributavel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011Subtotal"} g011-subtotal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011Subtotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011SubtotalTributavel"} g011-subtotal-tributavel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011SubtotalTributavel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011Total"} g011-total
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011Total" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G011VeiculoUsado"} g011-veiculo-usado
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G011VeiculoUsado" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G012"} g012
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G012" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G012" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G012QtdExportacao"} g012-qtd-exportacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G012QtdExportacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G013"} g013
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G013" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G013" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G013Afrmm"} g013-afrmm
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G013Afrmm" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G013DescDi"} g013-desc-di
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G013DescDi" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G013Subtotal"} g013-subtotal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G013Subtotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G013Total"} g013-total
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G013Total" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G014"} g014
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G014" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G014" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G014Quantidade"} g014-quantidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G014Quantidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G015"} g015
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G015" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G015" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016"} g016
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G016" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016BcCide"} g016-bc-cide
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016BcCide" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016Partida"} g016-partida
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016Partida" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016PercentualBiodiesel"} g016-percentual-biodiesel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016PercentualBiodiesel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016PercentualGlp"} g016-percentual-glp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016PercentualGlp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016PercentualGni"} g016-percentual-gni
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016PercentualGni" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016PercentualGnn"} g016-percentual-gnn
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016PercentualGnn" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016QtdTemperatura"} g016-qtd-temperatura
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016QtdTemperatura" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G016ValorCide"} g016-valor-cide
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G016ValorCide" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G017"} g017
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G017" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G017" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G017PercentualOriginario"} g017-percentual-originario
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G017PercentualOriginario" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G018"} g018
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G018" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G018" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G018Pmc"} g018-pmc
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G018Pmc" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G019"} g019
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G019" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G019" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G020"} g020
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G020" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G020" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G020Cmt"} g020-cmt
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G020Cmt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G021"} g021
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G021" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G021" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G021Desconto"} g021-desconto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G021Desconto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G021DespesasAcessorias"} g021-despesas-acessorias
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G021DespesasAcessorias" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G021DespesasAduaneiras"} g021-despesas-aduaneiras
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G021DespesasAduaneiras" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G021Frete"} g021-frete
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G021Frete" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G021Total"} g021-total
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G021Total" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022"} g022
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G022" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022Autorizacao"} g022-autorizacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022Autorizacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022Bandeira"} g022-bandeira
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022Bandeira" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022CnpjBeneficiario"} g022-cnpj-beneficiario
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022CnpjBeneficiario" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022CnpjCredenciadora"} g022-cnpj-credenciadora
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022CnpjCredenciadora" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022CnpjTransacionalPag"} g022-cnpj-transacional-pag
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022CnpjTransacionalPag" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022DataPagamento"} g022-data-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022DataPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022DescPagamento"} g022-desc-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022DescPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022FormaPagamento"} g022-forma-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022FormaPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022IdTerminalPag"} g022-id-terminal-pag
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022IdTerminalPag" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022Pagamento"} g022-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022Pagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022TipoIntegracao"} g022-tipo-integracao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022TipoIntegracao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022UfEstabelecimentoPag"} g022-uf-estabelecimento-pag
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022UfEstabelecimentoPag" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022ValorPagamento"} g022-valor-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022ValorPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022ValorPagamentoVariant0"} g022-valor-pagamento-variant0
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022ValorPagamentoVariant0" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G022ValorPagamentoVariant1Item"} g022-valor-pagamento-variant1-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G022ValorPagamentoVariant1Item" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G023"} g023
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G023" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G023" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G023PesoBruto"} g023-peso-bruto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G023PesoBruto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G023PesoLiquido"} g023-peso-liquido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G023PesoLiquido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G024"} g024
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G024" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G024" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G024Seguro"} g024-seguro
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G024Seguro" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G025"} g025
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G025" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G025" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G026"} g026
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G026" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G026" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G027"} g027
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G027" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G027" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G028"} g028
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G028" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G028" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G028Desconto"} g028-desconto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G028Desconto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G028Valor"} g028-valor
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G028Valor" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G028ValorLiquido"} g028-valor-liquido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G028ValorLiquido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G029"} g029
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G029" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G029" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G029Valor"} g029-valor
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G029Valor" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G030"} g030
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G030" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G030" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G031"} g031
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G031" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G031" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G032"} g032
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G032" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G032" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G033"} g033
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G033" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G033" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G034"} g034
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G034" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G034" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G034PercentualRedutor"} g034-percentual-redutor
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G034PercentualRedutor" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G035"} g035
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G035" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G035" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037"} g037
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G037" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaCredito"} g037-aliquota-credito
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaCredito" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaDiferimento"} g037-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaDiferimentoFcp"} g037-aliquota-diferimento-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaDiferimentoFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaEfetivaIcms"} g037-aliquota-efetiva-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaEfetivaIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaEfetivaIcmsSt"} g037-aliquota-efetiva-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaEfetivaIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaImportacao"} g037-aliquota-importacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaImportacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaReducao"} g037-aliquota-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaReducaoDestino"} g037-aliquota-reducao-destino
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaReducaoDestino" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G037AliquotaReducaoSt"} g037-aliquota-reducao-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G037AliquotaReducaoSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G038"} g038
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G038" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G038" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G038Aliquota"} g038-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G038Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G039"} g039
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G039" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G039" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G039Aliquota"} g039-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G039Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G040"} g040
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G040" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G040" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G040Aliquota"} g040-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G040Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G041"} g041
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G041" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G041" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G041Aliquota"} g041-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G041Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G042"} g042
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G042" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G042" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G042Aliquota"} g042-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G042Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G043"} g043
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G043" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G043" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G044"} g044
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G044" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G044" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G044Aliquota"} g044-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G044Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G045"} g045
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G045" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G045" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G045Aliquota"} g045-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G045Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G046"} g046
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G046" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G046" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G046Aliquota"} g046-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G046Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G047"} g047
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G047" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G047" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G047Aliquota"} g047-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G047Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G048"} g048
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G048" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G048" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G048Aliquota"} g048-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G048Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G049"} g049
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G049" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G049" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G050"} g050
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G050" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G050" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G050AliquotaDiferimento"} g050-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G050AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G051"} g051
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G051" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G051" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G051AliquotaCbs"} g051-aliquota-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G051AliquotaCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G051AliquotaIbs"} g051-aliquota-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G051AliquotaIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G052"} g052
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G052" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G052" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G053"} g053
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G053" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G053" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G054"} g054
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G054" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G054" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G054AliquotaDiferimento"} g054-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G054AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G055"} g055
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G055" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G055" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G056"} g056
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G056" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G056" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G057"} g057
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G057" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G057" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G058"} g058
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G058" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G058" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G059"} g059
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G059" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G059" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G060"} g060
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G060" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G060" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G061"} g061
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G061" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G061" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G062"} g062
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G062" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G062" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G062Cofins"} g062-cofins
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G062Cofins" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G062Csll"} g062-csll
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G062Csll" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G062Deducoes"} g062-deducoes
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G062Deducoes" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G062Inss"} g062-inss
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G062Inss" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G062Ir"} g062-ir
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G062Ir" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G062Iss"} g062-iss
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G062Iss" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G062Pis"} g062-pis
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G062Pis" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G063"} g063
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G063" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G063" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G064"} g064
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G064" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G064" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G065"} g065
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G065" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G065" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G066"} g066
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G066" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G066" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G067"} g067
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G067" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G067" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G067Referencia"} g067-referencia
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G067Referencia" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G068"} g068
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G068" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G068" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G069"} g069
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G069" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G069" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070"} g070
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G070" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070Aliquota"} g070-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070AliquotaDiferimento"} g070-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070AliquotaFcp"} g070-aliquota-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070AliquotaFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070AliquotaImportacao"} g070-aliquota-importacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070AliquotaImportacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070AliquotaInterestadual"} g070-aliquota-interestadual
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070AliquotaInterestadual" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070BcIcms"} g070-bc-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070BcIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070BcIcmsSt"} g070-bc-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070BcIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070Majoracao"} g070-majoracao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070Majoracao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G070ValorIcms"} g070-valor-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G070ValorIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G071"} g071
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G071" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G071" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G071AliquotaCredito"} g071-aliquota-credito
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G071AliquotaCredito" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G072"} g072
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G072" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G072" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G072AliquotaCredito"} g072-aliquota-credito
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G072AliquotaCredito" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G072AliquotaFcpSt"} g072-aliquota-fcp-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G072AliquotaFcpSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G072AliquotaMva"} g072-aliquota-mva
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G072AliquotaMva" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G072AliquotaReducao"} g072-aliquota-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G072AliquotaReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G072AliquotaReducaoSt"} g072-aliquota-reducao-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G072AliquotaReducaoSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G072AliquotaSt"} g072-aliquota-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G072AliquotaSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G073"} g073
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G073" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G073" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G073AliquotaFcpSt"} g073-aliquota-fcp-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G073AliquotaFcpSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G073AliquotaMva"} g073-aliquota-mva
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G073AliquotaMva" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G073AliquotaReducao"} g073-aliquota-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G073AliquotaReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G073AliquotaReducaoSt"} g073-aliquota-reducao-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G073AliquotaReducaoSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G073AliquotaSt"} g073-aliquota-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G073AliquotaSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074"} g074
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G074" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074AliquotaBcEfetivo"} g074-aliquota-bc-efetivo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074AliquotaBcEfetivo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074AliquotaFcpRetido"} g074-aliquota-fcp-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074AliquotaFcpRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074AliquotaIcmsEfetivo"} g074-aliquota-icms-efetivo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074AliquotaIcmsEfetivo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074AliquotaStRetido"} g074-aliquota-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074AliquotaStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074BcStRetido"} g074-bc-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074BcStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074ValorFcpRetido"} g074-valor-fcp-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074ValorFcpRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074ValorIcmsSubstituto"} g074-valor-icms-substituto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074ValorIcmsSubstituto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G074ValorStRetido"} g074-valor-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G074ValorStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075"} g075
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G075" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075Aliquota"} g075-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075AliquotaFcp"} g075-aliquota-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075AliquotaFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075AliquotaImportacao"} g075-aliquota-importacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075AliquotaImportacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075AliquotaInterestadual"} g075-aliquota-interestadual
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075AliquotaInterestadual" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075BcIcms"} g075-bc-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075BcIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075BcIcmsSt"} g075-bc-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075BcIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075Majoracao"} g075-majoracao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075Majoracao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G075ValorIcms"} g075-valor-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G075ValorIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G076"} g076
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G076" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G076" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G076PautaFiscal"} g076-pauta-fiscal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G076PautaFiscal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G077"} g077
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G077" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G077" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G077QuantidadeBc"} g077-quantidade-bc
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G077QuantidadeBc" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G078"} g078
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G078" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G078" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G078AliquotaFcpSt"} g078-aliquota-fcp-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G078AliquotaFcpSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G078AliquotaMva"} g078-aliquota-mva
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G078AliquotaMva" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G078AliquotaReducaoSt"} g078-aliquota-reducao-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G078AliquotaReducaoSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G078AliquotaSt"} g078-aliquota-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G078AliquotaSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G079"} g079
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G079" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G079" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G079AliquotaRetencao"} g079-aliquota-retencao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G079AliquotaRetencao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G079PercentualReducao"} g079-percentual-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G079PercentualReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G079QuantidadeBc"} g079-quantidade-bc
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G079QuantidadeBc" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G079QuantidadeRetencao"} g079-quantidade-retencao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G079QuantidadeRetencao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G080"} g080
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G080" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G080" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G080AliquotaReducao"} g080-aliquota-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G080AliquotaReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G081"} g081
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G081" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G081" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G082"} g082
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G082" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G082" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G083"} g083
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G083" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G083" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G083AliquotaDiferimento"} g083-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G083AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G083AliquotaDiferimentoFcp"} g083-aliquota-diferimento-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G083AliquotaDiferimentoFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G084"} g084
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G084" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G084" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G084AliquotaDiferimento"} g084-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G084AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G084QuantidadeBc"} g084-quantidade-bc
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G084QuantidadeBc" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085"} g085
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G085" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085AliquotaBcEfetivo"} g085-aliquota-bc-efetivo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085AliquotaBcEfetivo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085AliquotaFcpRetido"} g085-aliquota-fcp-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085AliquotaFcpRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085AliquotaIcmsEfetivo"} g085-aliquota-icms-efetivo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085AliquotaIcmsEfetivo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085AliquotaStRetido"} g085-aliquota-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085AliquotaStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085BcStDest"} g085-bc-st-dest
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085BcStDest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085BcStRetido"} g085-bc-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085BcStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085ValorFcpRetido"} g085-valor-fcp-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085ValorFcpRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085ValorStDest"} g085-valor-st-dest
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085ValorStDest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G085ValorStRetido"} g085-valor-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G085ValorStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G086"} g086
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G086" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G086" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G086QuantidadeBc"} g086-quantidade-bc
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G086QuantidadeBc" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G087"} g087
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G087" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G087" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G087AliquotaFcpSt"} g087-aliquota-fcp-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G087AliquotaFcpSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G087AliquotaMva"} g087-aliquota-mva
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G087AliquotaMva" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G087AliquotaReducao"} g087-aliquota-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G087AliquotaReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G087AliquotaReducaoSt"} g087-aliquota-reducao-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G087AliquotaReducaoSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G087AliquotaSt"} g087-aliquota-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G087AliquotaSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G088"} g088
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G088" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G088" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G088AliquotaMva"} g088-aliquota-mva
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G088AliquotaMva" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G089"} g089
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G089" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G089" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G089PautaFiscal"} g089-pauta-fiscal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G089PautaFiscal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G090"} g090
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G090" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G090" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G090ValorOperacao"} g090-valor-operacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G090ValorOperacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G091"} g091
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G091" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G091" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G091Aliquota"} g091-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G091Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G091Valor"} g091-valor
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G091Valor" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G092"} g092
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G092" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G092" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G092Aliquota"} g092-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G092Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G092BcIpi"} g092-bc-ipi
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G092BcIpi" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G092CodigoEnquadramento"} g092-codigo-enquadramento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G092CodigoEnquadramento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G092IpiDevolvido"} g092-ipi-devolvido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G092IpiDevolvido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G092PercentualDevolvido"} g092-percentual-devolvido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G092PercentualDevolvido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G093"} g093
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G093" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G093" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G093Aliquota"} g093-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G093Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G093BcPis"} g093-bc-pis
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G093BcPis" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G093Majoracao"} g093-majoracao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G093Majoracao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G094"} g094
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G094" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G094" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G094Aliquota"} g094-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G094Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G094BcCofins"} g094-bc-cofins
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G094BcCofins" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G094Majoracao"} g094-majoracao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G094Majoracao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G095"} g095
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G095" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G095" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G095Aliquota"} g095-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G095Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G095Deducao"} g095-deducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G095Deducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G095DescontoCondicionado"} g095-desconto-condicionado
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G095DescontoCondicionado" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G095DescontoIncondicionado"} g095-desconto-incondicionado
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G095DescontoIncondicionado" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G095IssRetido"} g095-iss-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G095IssRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G095Retencoes"} g095-retencoes
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G095Retencoes" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G096"} g096
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G096" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G096" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G096BcIrrf"} g096-bc-irrf
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G096BcIrrf" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G096BcPrevidencia"} g096-bc-previdencia
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G096BcPrevidencia" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G096ValorCofins"} g096-valor-cofins
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G096ValorCofins" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G096ValorCsll"} g096-valor-csll
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G096ValorCsll" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G096ValorIrrf"} g096-valor-irrf
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G096ValorIrrf" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G096ValorPis"} g096-valor-pis
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G096ValorPis" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G096ValorPrevidencia"} g096-valor-previdencia
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G096ValorPrevidencia" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G097"} g097
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G097" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G097" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G097Aliquota"} g097-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G097Aliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G097Iof"} g097-iof
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G097Iof" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G100"} g100
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G100" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G100" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G100BaseCalculo"} g100-base-calculo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G100BaseCalculo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G101"} g101
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G101" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G101" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G101AliquotaDiferimento"} g101-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G101AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G101ValorDevolvido"} g101-valor-devolvido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G101ValorDevolvido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G102"} g102
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G102" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G102" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G102AliquotaDiferimento"} g102-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G102AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G102ValorDevolvido"} g102-valor-devolvido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G102ValorDevolvido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G103"} g103
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G103" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G103" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G103AliquotaDiferimento"} g103-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G103AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G103PercentualDevolvido"} g103-percentual-devolvido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G103PercentualDevolvido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G103ValorDevolvido"} g103-valor-devolvido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G103ValorDevolvido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G104"} g104
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G104" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G104" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G104AliquotaEfetivaReferencia"} g104-aliquota-efetiva-referencia
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G104AliquotaEfetivaReferencia" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G104ValorEfetivoReferencia"} g104-valor-efetivo-referencia
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G104ValorEfetivoReferencia" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105"} g105
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G105" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105AliquotaCbs"} g105-aliquota-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105AliquotaCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105AliquotaCbsRetencao"} g105-aliquota-cbs-retencao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105AliquotaCbsRetencao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105AliquotaCbsRetido"} g105-aliquota-cbs-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105AliquotaCbsRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105AliquotaDiferimentoCbs"} g105-aliquota-diferimento-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105AliquotaDiferimentoCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105AliquotaDiferimentoIbs"} g105-aliquota-diferimento-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105AliquotaDiferimentoIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105AliquotaIbs"} g105-aliquota-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105AliquotaIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105AliquotaIbsRetencao"} g105-aliquota-ibs-retencao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105AliquotaIbsRetencao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105AliquotaIbsRetido"} g105-aliquota-ibs-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105AliquotaIbsRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105QuantidadeBc"} g105-quantidade-bc
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105QuantidadeBc" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105QuantidadeBcRetencao"} g105-quantidade-bc-retencao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105QuantidadeBcRetencao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G105QuantidadeBcRetido"} g105-quantidade-bc-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G105QuantidadeBcRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G106"} g106
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G106" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G106" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G106AliquotaCbs"} g106-aliquota-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G106AliquotaCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G106AliquotaIbs"} g106-aliquota-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G106AliquotaIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G106Bc"} g106-bc
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G106Bc" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G108"} g108
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G108" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G108" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G108ValorCbs"} g108-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G108ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G108ValorIbs"} g108-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G108ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G109"} g109
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G109" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G109" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G109ValorCbs"} g109-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G109ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G109ValorIbs"} g109-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G109ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G110"} g110
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G110" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G110" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G110ValorCbs"} g110-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G110ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G110ValorIbs"} g110-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G110ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G111"} g111
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G111" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G111" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G111QuantidadeItem"} g111-quantidade-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G111QuantidadeItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G112"} g112
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G112" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G112" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G112ValorIcms"} g112-valor-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G112ValorIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G112ValorIcmsSt"} g112-valor-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G112ValorIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G113"} g113
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G113" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G113" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G114"} g114
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G114" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G114" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G114Impostos"} g114-impostos
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G114Impostos" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G114Impostos" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G114ImpostosIbsCbs"} g114-impostos-ibs-cbs
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G114ImpostosIbsCbs" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G114ImpostosIbsCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G114Quantidade"} g114-quantidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G114Quantidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G114QuantidadeTributavel"} g114-quantidade-tributavel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G114QuantidadeTributavel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G114Subtotal"} g114-subtotal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G114Subtotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G114SubtotalTributavel"} g114-subtotal-tributavel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G114SubtotalTributavel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G114Total"} g114-total
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G114Total" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G115"} g115
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G115" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G115" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G115AliquotaDiferimento"} g115-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G115AliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G115BcIcms"} g115-bc-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G115BcIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G115ValorFcp"} g115-valor-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G115ValorFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G115ValorIcms"} g115-valor-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G115ValorIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G115ValorOperacao"} g115-valor-operacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G115ValorOperacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G116"} g116
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G116" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G116" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G116AliquotaMva"} g116-aliquota-mva
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G116AliquotaMva" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G116BcIcmsSt"} g116-bc-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G116BcIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G116ValorFcpSt"} g116-valor-fcp-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G116ValorFcpSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G116ValorIcmsSt"} g116-valor-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G116ValorIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G117"} g117
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G117" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G117" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G117BcIpi"} g117-bc-ipi
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G117BcIpi" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G117ValorIpi"} g117-valor-ipi
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G117ValorIpi" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G118"} g118
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G118" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G118" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G118BcIssqn"} g118-bc-issqn
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G118BcIssqn" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G118ValorIssqn"} g118-valor-issqn
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G118ValorIssqn" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G119"} g119
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G119" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G119" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G120"} g120
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G120" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G120" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G120NfeReferenciada"} g120-nfe-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G120NfeReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G121"} g121
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G121" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G121" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G122"} g122
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G122" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G122" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G122DfeReferenciado"} g122-dfe-referenciado
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G122DfeReferenciado" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G122DfeReferenciado" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G123"} g123
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G123" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G123" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G124"} g124
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G124" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G124" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G125"} g125
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G125" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G125" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G127"} g127
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G127" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G127" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G127ControleEstoque"} g127-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G127ControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G127ControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G127ControleEstoqueQuantidade"} g127-controle-estoque-quantidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G127ControleEstoqueQuantidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G127ValorCbs"} g127-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G127ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G127ValorIbs"} g127-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G127ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G128"} g128
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G128" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G128" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G128ControleEstoque"} g128-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G128ControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G128ControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G128ControleEstoqueQuantidadePerecimento"} g128-controle-estoque-quantidade-perecimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G128ControleEstoqueQuantidadePerecimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G128ControleEstoqueValorCbsEstorno"} g128-controle-estoque-valor-cbs-estorno
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G128ControleEstoqueValorCbsEstorno" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G128ControleEstoqueValorIbsEstorno"} g128-controle-estoque-valor-ibs-estorno
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G128ControleEstoqueValorIbsEstorno" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G128ValorCbs"} g128-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G128ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G128ValorIbs"} g128-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G128ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G129"} g129
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G129" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G129" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G129ControleEstoque"} g129-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G129ControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G129ControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G129ControleEstoqueQuantidadeNaoFornecida"} g129-controle-estoque-quantidade-nao-fornecida
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G129ControleEstoqueQuantidadeNaoFornecida" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G129ValorCbs"} g129-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G129ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G129ValorIbs"} g129-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G129ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G130"} g130
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G130" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G130" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G131"} g131
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G131" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G131" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G131BaseCalculo"} g131-base-calculo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G131BaseCalculo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G131CreditoPresumido"} g131-credito-presumido
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G131CreditoPresumido" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G131CreditoPresumido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G131CreditoPresumidoAliquotaCbs"} g131-credito-presumido-aliquota-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G131CreditoPresumidoAliquotaCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G131CreditoPresumidoAliquotaIbs"} g131-credito-presumido-aliquota-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G131CreditoPresumidoAliquotaIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G131CreditoPresumidoValorCbs"} g131-credito-presumido-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G131CreditoPresumidoValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G131CreditoPresumidoValorIbs"} g131-credito-presumido-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G131CreditoPresumidoValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G132"} g132
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G132" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G132" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G132ControleEstoque"} g132-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G132ControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G132ControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G132ControleEstoqueQuantidadePerecimento"} g132-controle-estoque-quantidade-perecimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G132ControleEstoqueQuantidadePerecimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G132ValorCbs"} g132-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G132ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G132ValorIbs"} g132-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G132ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G133"} g133
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G133" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G133" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G134"} g134
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G134" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G134" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G134ControleEstoque"} g134-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G134ControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G134ControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G134ControleEstoqueQuantidadeImobilizada"} g134-controle-estoque-quantidade-imobilizada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G134ControleEstoqueQuantidadeImobilizada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G134ValorCbs"} g134-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G134ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G134ValorIbs"} g134-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G134ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G135"} g135
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G135" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G135" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G135ControleEstoque"} g135-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G135ControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G135ControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G135ControleEstoqueQuantidadeCombustivel"} g135-controle-estoque-quantidade-combustivel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G135ControleEstoqueQuantidadeCombustivel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G135ValorCbs"} g135-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G135ValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G135ValorIbs"} g135-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G135ValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G136"} g136
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G136" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G136" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G136ValorCreditoCbs"} g136-valor-credito-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G136ValorCreditoCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G136ValorCreditoIbs"} g136-valor-credito-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G136ValorCreditoIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G137"} g137
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G137" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G137" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G138"} g138
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G138" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G138" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G139"} g139
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G139" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G139" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G139ValorPagamento"} g139-valor-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G139ValorPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G140"} g140
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G140" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G140" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G141"} g141
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G141" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G141" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G142"} g142
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G142" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G142" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G143"} g143
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G143" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G143" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G144"} g144
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G144" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G144" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G145"} g145
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G145" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G145" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G146"} g146
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G146" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G146" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G147"} g147
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G147" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G147" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G148"} g148
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G148" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G148" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G149"} g149
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G149" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G149" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G150"} g150
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G150" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G150" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G151"} g151
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G151" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G151" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G151Cnae"} g151-cnae
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G151Cnae" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G152"} g152
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G152" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G152" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.G153"} g153
  ([] (value/model "com.webmania.sdk.model.api1fiscal.G153" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.G153" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112110Details"} ibs-cbs112110-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112110Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112110Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112110DetailsIndicadorQuitacao"} ibs-cbs112110-details-indicador-quitacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112110DetailsIndicadorQuitacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112110Request"} ibs-cbs112110-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112110Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112110Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112110RequestIndicadorQuitacao"} ibs-cbs112110-request-indicador-quitacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112110RequestIndicadorQuitacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120Details"} ibs-cbs112120-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItem"} ibs-cbs112120-details-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemControleEstoque"} ibs-cbs112120-details-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemControleEstoqueQuantidade"} ibs-cbs112120-details-itens-item-controle-estoque-quantidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemControleEstoqueQuantidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemItem"} ibs-cbs112120-details-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemValorCbs"} ibs-cbs112120-details-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemValorIbs"} ibs-cbs112120-details-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120DetailsItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120Request"} ibs-cbs112120-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItem"} ibs-cbs112120-request-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemControleEstoque"} ibs-cbs112120-request-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemControleEstoqueQuantidade"} ibs-cbs112120-request-itens-item-controle-estoque-quantidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemControleEstoqueQuantidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemItem"} ibs-cbs112120-request-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemValorCbs"} ibs-cbs112120-request-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemValorIbs"} ibs-cbs112120-request-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112120RequestItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130Details"} ibs-cbs112130-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItem"} ibs-cbs112130-details-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoque"} ibs-cbs112130-details-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoqueQuantidadePerecimento"} ibs-cbs112130-details-itens-item-controle-estoque-quantidade-perecimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoqueQuantidadePerecimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoqueValorCbsEstorno"} ibs-cbs112130-details-itens-item-controle-estoque-valor-cbs-estorno
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoqueValorCbsEstorno" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoqueValorIbsEstorno"} ibs-cbs112130-details-itens-item-controle-estoque-valor-ibs-estorno
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemControleEstoqueValorIbsEstorno" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemItem"} ibs-cbs112130-details-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemValorCbs"} ibs-cbs112130-details-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemValorIbs"} ibs-cbs112130-details-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130DetailsItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130Request"} ibs-cbs112130-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItem"} ibs-cbs112130-request-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoque"} ibs-cbs112130-request-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoqueQuantidadePerecimento"} ibs-cbs112130-request-itens-item-controle-estoque-quantidade-perecimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoqueQuantidadePerecimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoqueValorCbsEstorno"} ibs-cbs112130-request-itens-item-controle-estoque-valor-cbs-estorno
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoqueValorCbsEstorno" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoqueValorIbsEstorno"} ibs-cbs112130-request-itens-item-controle-estoque-valor-ibs-estorno
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemControleEstoqueValorIbsEstorno" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemItem"} ibs-cbs112130-request-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemValorCbs"} ibs-cbs112130-request-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemValorIbs"} ibs-cbs112130-request-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112130RequestItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140Details"} ibs-cbs112140-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItem"} ibs-cbs112140-details-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemControleEstoque"} ibs-cbs112140-details-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemControleEstoqueQuantidadeNaoFornecida"} ibs-cbs112140-details-itens-item-controle-estoque-quantidade-nao-fornecida
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemControleEstoqueQuantidadeNaoFornecida" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemItem"} ibs-cbs112140-details-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemValorCbs"} ibs-cbs112140-details-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemValorIbs"} ibs-cbs112140-details-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140DetailsItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140Request"} ibs-cbs112140-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItem"} ibs-cbs112140-request-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemControleEstoque"} ibs-cbs112140-request-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemControleEstoqueQuantidadeNaoFornecida"} ibs-cbs112140-request-itens-item-controle-estoque-quantidade-nao-fornecida
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemControleEstoqueQuantidadeNaoFornecida" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemItem"} ibs-cbs112140-request-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemValorCbs"} ibs-cbs112140-request-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemValorIbs"} ibs-cbs112140-request-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112140RequestItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112150Details"} ibs-cbs112150-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112150Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112150Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs112150Request"} ibs-cbs112150-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112150Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs112150Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110Details"} ibs-cbs211110-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItem"} ibs-cbs211110-details-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemBaseCalculo"} ibs-cbs211110-details-itens-item-base-calculo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemBaseCalculo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumido"} ibs-cbs211110-details-itens-item-credito-presumido
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumido" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaCbs"} ibs-cbs211110-details-itens-item-credito-presumido-aliquota-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaIbs"} ibs-cbs211110-details-itens-item-credito-presumido-aliquota-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumidoValorCbs"} ibs-cbs211110-details-itens-item-credito-presumido-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumidoValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumidoValorIbs"} ibs-cbs211110-details-itens-item-credito-presumido-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemCreditoPresumidoValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemItem"} ibs-cbs211110-details-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110DetailsItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110Request"} ibs-cbs211110-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItem"} ibs-cbs211110-request-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemBaseCalculo"} ibs-cbs211110-request-itens-item-base-calculo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemBaseCalculo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumido"} ibs-cbs211110-request-itens-item-credito-presumido
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumido" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumidoAliquotaCbs"} ibs-cbs211110-request-itens-item-credito-presumido-aliquota-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumidoAliquotaCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumidoAliquotaIbs"} ibs-cbs211110-request-itens-item-credito-presumido-aliquota-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumidoAliquotaIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumidoValorCbs"} ibs-cbs211110-request-itens-item-credito-presumido-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumidoValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumidoValorIbs"} ibs-cbs211110-request-itens-item-credito-presumido-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemCreditoPresumidoValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemItem"} ibs-cbs211110-request-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211110RequestItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124Details"} ibs-cbs211124-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItem"} ibs-cbs211124-details-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemControleEstoque"} ibs-cbs211124-details-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemControleEstoqueQuantidadePerecimento"} ibs-cbs211124-details-itens-item-controle-estoque-quantidade-perecimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemControleEstoqueQuantidadePerecimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemItem"} ibs-cbs211124-details-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemValorCbs"} ibs-cbs211124-details-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemValorIbs"} ibs-cbs211124-details-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124DetailsItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124Request"} ibs-cbs211124-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItem"} ibs-cbs211124-request-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemControleEstoque"} ibs-cbs211124-request-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemControleEstoqueQuantidadePerecimento"} ibs-cbs211124-request-itens-item-controle-estoque-quantidade-perecimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemControleEstoqueQuantidadePerecimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemItem"} ibs-cbs211124-request-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemValorCbs"} ibs-cbs211124-request-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemValorIbs"} ibs-cbs211124-request-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211124RequestItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211128Details"} ibs-cbs211128-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211128Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211128Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211128DetailsIndicadorAceitacao"} ibs-cbs211128-details-indicador-aceitacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211128DetailsIndicadorAceitacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211128Request"} ibs-cbs211128-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211128Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211128Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211128RequestIndicadorAceitacao"} ibs-cbs211128-request-indicador-aceitacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211128RequestIndicadorAceitacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130Details"} ibs-cbs211130-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItem"} ibs-cbs211130-details-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemControleEstoque"} ibs-cbs211130-details-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemControleEstoqueQuantidadeImobilizada"} ibs-cbs211130-details-itens-item-controle-estoque-quantidade-imobilizada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemControleEstoqueQuantidadeImobilizada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemItem"} ibs-cbs211130-details-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemValorCbs"} ibs-cbs211130-details-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemValorIbs"} ibs-cbs211130-details-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130DetailsItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130Request"} ibs-cbs211130-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItem"} ibs-cbs211130-request-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemControleEstoque"} ibs-cbs211130-request-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemControleEstoqueQuantidadeImobilizada"} ibs-cbs211130-request-itens-item-controle-estoque-quantidade-imobilizada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemControleEstoqueQuantidadeImobilizada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemItem"} ibs-cbs211130-request-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemValorCbs"} ibs-cbs211130-request-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemValorIbs"} ibs-cbs211130-request-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211130RequestItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140Details"} ibs-cbs211140-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItem"} ibs-cbs211140-details-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemControleEstoque"} ibs-cbs211140-details-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemControleEstoqueQuantidadeCombustivel"} ibs-cbs211140-details-itens-item-controle-estoque-quantidade-combustivel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemControleEstoqueQuantidadeCombustivel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemItem"} ibs-cbs211140-details-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemValorCbs"} ibs-cbs211140-details-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemValorIbs"} ibs-cbs211140-details-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140DetailsItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140Request"} ibs-cbs211140-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItem"} ibs-cbs211140-request-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemControleEstoque"} ibs-cbs211140-request-itens-item-controle-estoque
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemControleEstoque" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemControleEstoque" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemControleEstoqueQuantidadeCombustivel"} ibs-cbs211140-request-itens-item-controle-estoque-quantidade-combustivel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemControleEstoqueQuantidadeCombustivel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemItem"} ibs-cbs211140-request-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemValorCbs"} ibs-cbs211140-request-itens-item-valor-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemValorCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemValorIbs"} ibs-cbs211140-request-itens-item-valor-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211140RequestItensItemValorIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150Details"} ibs-cbs211150-details
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150Details" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150Details" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItem"} ibs-cbs211150-details-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItemItem"} ibs-cbs211150-details-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItemValorCreditoCbs"} ibs-cbs211150-details-itens-item-valor-credito-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItemValorCreditoCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItemValorCreditoIbs"} ibs-cbs211150-details-itens-item-valor-credito-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150DetailsItensItemValorCreditoIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150Request"} ibs-cbs211150-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150Request" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150Request" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItem"} ibs-cbs211150-request-itens-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItemItem"} ibs-cbs211150-request-itens-item-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItemItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItemValorCreditoCbs"} ibs-cbs211150-request-itens-item-valor-credito-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItemValorCreditoCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItemValorCreditoIbs"} ibs-cbs211150-request-itens-item-valor-credito-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.IbsCbs211150RequestItensItemValorCreditoIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequest"} nfce65-issue-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequestCteReferenciada"} nfce65-issue-request-cte-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequestCteReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequestEcfReferenciada"} nfce65-issue-request-ecf-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequestEcfReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequestNfRuralReferenciada"} nfce65-issue-request-nf-rural-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequestNfRuralReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequestNfeReferenciada"} nfce65-issue-request-nfe-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfce65IssueRequestNfeReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassContribution"} nfcom-class-contribution
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassContribution" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassContribution" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassContributionAliquota"} nfcom-class-contribution-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassContributionAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassIcms"} nfcom-class-icms
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassIcms" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassIcmsAliquota"} nfcom-class-icms-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassIcmsAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassIcmsAliquotaFcp"} nfcom-class-icms-aliquota-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassIcmsAliquotaFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassIcmsOrigem"} nfcom-class-icms-origem
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassIcmsOrigem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassIcmsPercentualReducao"} nfcom-class-icms-percentual-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassIcmsPercentualReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassPisCofins"} nfcom-class-pis-cofins
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassPisCofins" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassPisCofins" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomClassPisCofinsAliquota"} nfcom-class-pis-cofins-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomClassPisCofinsAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfcomCommunicationTaxClass"} nfcom-communication-tax-class
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfcomCommunicationTaxClass" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfcomCommunicationTaxClass" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfe55Customer"} nfe55-customer
  ([] (value/model "com.webmania.sdk.model.api1fiscal.Nfe55Customer" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfe55Customer" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequest"} nfe55-issue-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequestCteReferenciada"} nfe55-issue-request-cte-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequestCteReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequestEcfReferenciada"} nfe55-issue-request-ecf-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequestEcfReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequestNfRuralReferenciada"} nfe55-issue-request-nf-rural-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequestNfRuralReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequestNfeReferenciada"} nfe55-issue-request-nfe-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Nfe55IssueRequestNfeReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeAdjustmentRequest"} nfe-adjustment-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeAdjustmentRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeAdjustmentRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeAdjustmentRequestValorIcms"} nfe-adjustment-request-valor-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeAdjustmentRequestValorIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeAdjustmentRequestValorIcmsSt"} nfe-adjustment-request-valor-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeAdjustmentRequestValorIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelDocumentRequest"} nfe-cancel-document-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelDocumentRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelDocumentRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelDocumentResponse"} nfe-cancel-document-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelDocumentResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelIbsCbsEventRequest"} nfe-cancel-ibs-cbs-event-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelIbsCbsEventRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelIbsCbsEventRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelIbsCbsEventResponse"} nfe-cancel-ibs-cbs-event-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelIbsCbsEventResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelPaymentEventRequest"} nfe-cancel-payment-event-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelPaymentEventRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelPaymentEventRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelPaymentEventResponse"} nfe-cancel-payment-event-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelPaymentEventResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelRequest"} nfe-cancel-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelResult"} nfe-cancel-result
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelResult" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCancelResultLog"} nfe-cancel-result-log
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCancelResultLog" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCertificateValidity"} nfe-certificate-validity
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCertificateValidity" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCertificateValidity" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementIbsCbs"} nfe-complement-ibs-cbs
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementIbsCbs" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementIbsCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementIbsCbsBaseCalculo"} nfe-complement-ibs-cbs-base-calculo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementIbsCbsBaseCalculo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProduct"} nfe-complement-product
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProduct" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProduct" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProductDesconto"} nfe-complement-product-desconto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProductDesconto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProductPeso"} nfe-complement-product-peso
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProductPeso" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProductQuantidade"} nfe-complement-product-quantidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProductQuantidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProductQuantidadeTributavel"} nfe-complement-product-quantidade-tributavel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProductQuantidadeTributavel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProductSubtotal"} nfe-complement-product-subtotal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProductSubtotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProductSubtotalTributavel"} nfe-complement-product-subtotal-tributavel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProductSubtotalTributavel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProductTotal"} nfe-complement-product-total
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProductTotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementProductVeiculoUsado"} nfe-complement-product-veiculo-usado
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementProductVeiculoUsado" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementRequest"} nfe-complement-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeComplementTaxes"} nfe-complement-taxes
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementTaxes" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeComplementTaxes" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeContributorObservation"} nfe-contributor-observation
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeContributorObservation" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeContributorObservation" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCorrectionRequest"} nfe-correction-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCorrectionRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCorrectionRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCreateCorrectionRequest"} nfe-create-correction-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateCorrectionRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateCorrectionRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCreateCorrectionResponse"} nfe-create-correction-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateCorrectionResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCreateIbsCbsEventRequest"} nfe-create-ibs-cbs-event-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateIbsCbsEventRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateIbsCbsEventRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCreateIbsCbsEventResponse"} nfe-create-ibs-cbs-event-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateIbsCbsEventResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCreateManifestationRequest"} nfe-create-manifestation-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateManifestationRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateManifestationRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCreateManifestationResponse"} nfe-create-manifestation-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreateManifestationResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCreatePaymentEventRequest"} nfe-create-payment-event-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreatePaymentEventRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreatePaymentEventRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCreatePaymentEventResponse"} nfe-create-payment-event-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCreatePaymentEventResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeCustomer"} nfe-customer
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeCustomer" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeCustomer" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeDeleteTaxClassesRequest"} nfe-delete-tax-classes-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeDeleteTaxClassesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeDeleteTaxClassesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeDeleteTaxClassesResponse"} nfe-delete-tax-classes-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeDeleteTaxClassesResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeDocument"} nfe-document
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeDocument" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeDocument" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeDocumentEvento"} nfe-document-evento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeDocumentEvento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeDocumentLog"} nfe-document-log
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeDocumentLog" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeDocumentLogCancelamento"} nfe-document-log-cancelamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeDocumentLogCancelamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeDocumentNfe"} nfe-document-nfe
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeDocumentNfe" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeDocumentSerie"} nfe-document-serie
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeDocumentSerie" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeEventResult"} nfe-event-result
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeEventResult" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeEventResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeEventResultEvento"} nfe-event-result-evento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeEventResultEvento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeEventResultLog"} nfe-event-result-log
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeEventResultLog" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeGetCertificateValidityRequest"} nfe-get-certificate-validity-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetCertificateValidityRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetCertificateValidityRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeGetCertificateValidityResponse"} nfe-get-certificate-validity-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetCertificateValidityResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeGetDocumentRequest"} nfe-get-document-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetDocumentRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetDocumentRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeGetDocumentResponse"} nfe-get-document-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetDocumentResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeGetDocumentResponseVariant0"} nfe-get-document-response-variant0
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetDocumentResponseVariant0" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest"} nfe-get-sefaz-status-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusResponse"} nfe-get-sefaz-status-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIbsCbsEventCancelRequest"} nfe-ibs-cbs-event-cancel-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeIbsCbsEventCancelRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIbsCbsEventCancelRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIbsCbsEventRequest"} nfe-ibs-cbs-event-request
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIbsCbsEventRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcms"} nfe-icms
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcms" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquota"} nfe-icms-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaBcEfetivo"} nfe-icms-aliquota-bc-efetivo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaBcEfetivo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaCredito"} nfe-icms-aliquota-credito
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaCredito" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaDiferimento"} nfe-icms-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaDiferimentoFcp"} nfe-icms-aliquota-diferimento-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaDiferimentoFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaFcp"} nfe-icms-aliquota-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaFcpRetido"} nfe-icms-aliquota-fcp-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaFcpRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaFcpSt"} nfe-icms-aliquota-fcp-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaFcpSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaIcmsEfetivo"} nfe-icms-aliquota-icms-efetivo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaIcmsEfetivo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaImportacao"} nfe-icms-aliquota-importacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaImportacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaInterestadual"} nfe-icms-aliquota-interestadual
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaInterestadual" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaMva"} nfe-icms-aliquota-mva
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaMva" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaReducao"} nfe-icms-aliquota-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaReducaoSt"} nfe-icms-aliquota-reducao-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaReducaoSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaRetencao"} nfe-icms-aliquota-retencao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaRetencao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaSt"} nfe-icms-aliquota-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaStRetido"} nfe-icms-aliquota-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsAliquotaStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsBcIcms"} nfe-icms-bc-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsBcIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsBcIcmsSt"} nfe-icms-bc-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsBcIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsBcStDest"} nfe-icms-bc-st-dest
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsBcStDest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsBcStRetido"} nfe-icms-bc-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsBcStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsMajoracao"} nfe-icms-majoracao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsMajoracao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsPautaFiscal"} nfe-icms-pauta-fiscal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsPautaFiscal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsPercentualReducao"} nfe-icms-percentual-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsPercentualReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsQuantidadeBc"} nfe-icms-quantidade-bc
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsQuantidadeBc" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsQuantidadeRetencao"} nfe-icms-quantidade-retencao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsQuantidadeRetencao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsValor"} nfe-icms-valor
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsValor" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsValorFcpRetido"} nfe-icms-valor-fcp-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsValorFcpRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsValorIcms"} nfe-icms-valor-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsValorIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsValorIcmsSubstituto"} nfe-icms-valor-icms-substituto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsValorIcmsSubstituto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsValorOperacao"} nfe-icms-valor-operacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsValorOperacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsValorStDest"} nfe-icms-valor-st-dest
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsValorStDest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIcmsValorStRetido"} nfe-icms-valor-st-retido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIcmsValorStRetido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueAdjustmentRequest"} nfe-issue-adjustment-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueAdjustmentRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueAdjustmentRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueAdjustmentResponse"} nfe-issue-adjustment-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueAdjustmentResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueComplementRequest"} nfe-issue-complement-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueComplementRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueComplementRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueComplementResponse"} nfe-issue-complement-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueComplementResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueDocumentRequest"} nfe-issue-document-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueDocumentRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueDocumentRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueDocumentResponse"} nfe-issue-document-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueDocumentResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueRequest"} nfe-issue-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueRequestCteReferenciada"} nfe-issue-request-cte-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueRequestCteReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueRequestEcfReferenciada"} nfe-issue-request-ecf-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueRequestEcfReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueRequestModelo"} nfe-issue-request-modelo
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueRequestModelo" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueRequestNfRuralReferenciada"} nfe-issue-request-nf-rural-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueRequestNfRuralReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueRequestNfeReferenciada"} nfe-issue-request-nfe-referenciada
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueRequestNfeReferenciada" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueResult"} nfe-issue-result
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueReturnRequest"} nfe-issue-return-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueReturnRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueReturnRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeIssueReturnResponse"} nfe-issue-return-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeIssueReturnResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeListTaxClassesRequest"} nfe-list-tax-classes-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeListTaxClassesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeListTaxClassesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeListTaxClassesResponse"} nfe-list-tax-classes-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeListTaxClassesResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeLookupRequest"} nfe-lookup-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeLookupRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeLookupRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeManifestationRequest"} nfe-manifestation-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeManifestationRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeManifestationRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeManifestationRequestEvento"} nfe-manifestation-request-evento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeManifestationRequestEvento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeNotification"} nfe-notification
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeNotification" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeNotification" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeNotificationEvento"} nfe-notification-evento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeNotificationEvento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeNotificationLog"} nfe-notification-log
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeNotificationLog" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeNotificationLogCancelamento"} nfe-notification-log-cancelamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeNotificationLogCancelamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeNotificationNfe"} nfe-notification-nfe
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeNotificationNfe" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeNotificationSerie"} nfe-notification-serie
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeNotificationSerie" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrder"} nfe-order
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrder" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrder" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderAutorizacao"} nfe-order-autorizacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderAutorizacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderBandeira"} nfe-order-bandeira
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderBandeira" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderCnpjBeneficiario"} nfe-order-cnpj-beneficiario
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderCnpjBeneficiario" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderCnpjCredenciadora"} nfe-order-cnpj-credenciadora
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderCnpjCredenciadora" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderCnpjTransacionalPag"} nfe-order-cnpj-transacional-pag
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderCnpjTransacionalPag" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderDataPagamento"} nfe-order-data-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderDataPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderDescPagamento"} nfe-order-desc-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderDescPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderDesconto"} nfe-order-desconto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderDesconto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderDespesasAcessorias"} nfe-order-despesas-acessorias
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderDespesasAcessorias" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderDespesasAduaneiras"} nfe-order-despesas-aduaneiras
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderDespesasAduaneiras" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderFormaPagamento"} nfe-order-forma-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderFormaPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderFrete"} nfe-order-frete
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderFrete" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderIdTerminalPag"} nfe-order-id-terminal-pag
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderIdTerminalPag" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderPagamento"} nfe-order-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderTipoIntegracao"} nfe-order-tipo-integracao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderTipoIntegracao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderTotal"} nfe-order-total
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderTotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderUfEstabelecimentoPag"} nfe-order-uf-estabelecimento-pag
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderUfEstabelecimentoPag" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderValorPagamento"} nfe-order-valor-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderValorPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderValorPagamentoVariant0"} nfe-order-valor-pagamento-variant0
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderValorPagamentoVariant0" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeOrderValorPagamentoVariant1Item"} nfe-order-valor-pagamento-variant1-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeOrderValorPagamentoVariant1Item" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfePaymentEventCancelRequest"} nfe-payment-event-cancel-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfePaymentEventCancelRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfePaymentEventCancelRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfePaymentEventItem"} nfe-payment-event-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfePaymentEventItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfePaymentEventItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfePaymentEventItemValorPagamento"} nfe-payment-event-item-valor-pagamento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfePaymentEventItemValorPagamento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfePaymentEventRequest"} nfe-payment-event-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfePaymentEventRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfePaymentEventRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfePreviewResult"} nfe-preview-result
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfePreviewResult" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfePreviewResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProduct"} nfe-product
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeProduct" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProduct" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductAfrmm"} nfe-product-afrmm
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductAfrmm" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductDescDi"} nfe-product-desc-di
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductDescDi" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductDesconto"} nfe-product-desconto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductDesconto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductPeso"} nfe-product-peso
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductPeso" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductQtdExportacao"} nfe-product-qtd-exportacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductQtdExportacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductQuantidade"} nfe-product-quantidade
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductQuantidade" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductQuantidadeTributavel"} nfe-product-quantidade-tributavel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductQuantidadeTributavel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductSubtotal"} nfe-product-subtotal
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductSubtotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductSubtotalTributavel"} nfe-product-subtotal-tributavel
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductSubtotalTributavel" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductTaxClass"} nfe-product-tax-class
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductTaxClass" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductTaxClass" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductTaxClassTributosEstaduais"} nfe-product-tax-class-tributos-estaduais
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductTaxClassTributosEstaduais" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductTaxClassTributosFederais"} nfe-product-tax-class-tributos-federais
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductTaxClassTributosFederais" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductTotal"} nfe-product-total
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductTotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeProductVeiculoUsado"} nfe-product-veiculo-usado
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeProductVeiculoUsado" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentRequest"} nfe-query-document-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentResponse"} nfe-query-document-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentResponseVariant0"} nfe-query-document-response-variant0
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeQueryDocumentResponseVariant0" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeReturnRequest"} nfe-return-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeReturnRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeReturnRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeReturnRequestQuantidadeItem"} nfe-return-request-quantidade-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeReturnRequestQuantidadeItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeSaveTaxClassesRequest"} nfe-save-tax-classes-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeSaveTaxClassesRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeSaveTaxClassesRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeSaveTaxClassesResponse"} nfe-save-tax-classes-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeSaveTaxClassesResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeSefazStatus"} nfe-sefaz-status
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeSefazStatus" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeSefazStatus" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResult"} nfe-tax-calculation-result
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResult" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotas"} nfe-tax-calculation-result-aliquotas
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotas" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotas" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasCofinsItem"} nfe-tax-calculation-result-aliquotas-cofins-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasCofinsItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasIcmsDiferimentoItem"} nfe-tax-calculation-result-aliquotas-icms-diferimento-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasIcmsDiferimentoItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasIcmsItem"} nfe-tax-calculation-result-aliquotas-icms-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasIcmsItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasIcmsStItem"} nfe-tax-calculation-result-aliquotas-icms-st-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasIcmsStItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasIpiItem"} nfe-tax-calculation-result-aliquotas-ipi-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasIpiItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasPisItem"} nfe-tax-calculation-result-aliquotas-pis-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultAliquotasPisItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostos"} nfe-tax-calculation-result-impostos
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostos" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostos" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosCofins"} nfe-tax-calculation-result-impostos-cofins
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosCofins" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosFcpDest"} nfe-tax-calculation-result-impostos-fcp-dest
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosFcpDest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosFcpDestBase"} nfe-tax-calculation-result-impostos-fcp-dest-base
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosFcpDestBase" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosFcpSt"} nfe-tax-calculation-result-impostos-fcp-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosFcpSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIcms"} nfe-tax-calculation-result-impostos-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIcmsDesoneracao"} nfe-tax-calculation-result-impostos-icms-desoneracao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIcmsDesoneracao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIcmsSt"} nfe-tax-calculation-result-impostos-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosImportacao"} nfe-tax-calculation-result-impostos-importacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosImportacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIpi"} nfe-tax-calculation-result-impostos-ipi
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIpi" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIssqn"} nfe-tax-calculation-result-impostos-issqn
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosIssqn" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosPis"} nfe-tax-calculation-result-impostos-pis
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosPis" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosTotalTributacao"} nfe-tax-calculation-result-impostos-total-tributacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultImpostosTotalTributacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedido"} nfe-tax-calculation-result-pedido
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedido" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoDesconto"} nfe-tax-calculation-result-pedido-desconto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoDesconto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoDespesasAcessorias"} nfe-tax-calculation-result-pedido-despesas-acessorias
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoDespesasAcessorias" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoFrete"} nfe-tax-calculation-result-pedido-frete
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoFrete" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoProdutos"} nfe-tax-calculation-result-pedido-produtos
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoProdutos" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoSeguro"} nfe-tax-calculation-result-pedido-seguro
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoSeguro" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoTotal"} nfe-tax-calculation-result-pedido-total
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTaxCalculationResultPedidoTotal" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTransport"} nfe-transport
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeTransport" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTransport" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTransportPesoBruto"} nfe-transport-peso-bruto
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTransportPesoBruto" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTransportPesoLiquido"} nfe-transport-peso-liquido
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTransportPesoLiquido" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeTransportSeguro"} nfe-transport-seguro
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeTransportSeguro" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeVoidNumberingRequest"} nfe-void-numbering-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidNumberingRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidNumberingRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeVoidNumberingResponse"} nfe-void-numbering-response
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidNumberingResponse" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeVoidRequest"} nfe-void-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeVoidResult"} nfe-void-result
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidResult" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfeVoidResultLog"} nfe-void-result-log
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfeVoidResultLog" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseServiceTaxClass"} nfse-service-tax-class
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseServiceTaxClass" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider55"} nfse-tax-class-provider55
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider55" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider55" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider56"} nfse-tax-class-provider56
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider56" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider56" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider57"} nfse-tax-class-provider57
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider57" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider57" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider58"} nfse-tax-class-provider58
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider58" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider58" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider60"} nfse-tax-class-provider60
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider60" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider60" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider61"} nfse-tax-class-provider61
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider61" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider61" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider63"} nfse-tax-class-provider63
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider63" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider63" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider64"} nfse-tax-class-provider64
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider64" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider64" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider66"} nfse-tax-class-provider66
  ([] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider66" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider66" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.SefazLog"} sefaz-log
  ([] (value/model "com.webmania.sdk.model.api1fiscal.SefazLog" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.SefazLog" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.SefazLogCStat"} sefaz-log-c-stat
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogCStat" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.SefazLogEvento"} sefaz-log-evento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogEvento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant0"} sefaz-log-evento-variant0
  ([] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant0" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant0" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant0CStat"} sefaz-log-evento-variant0-c-stat
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant0CStat" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant1Item"} sefaz-log-evento-variant1-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant1Item" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant1Item" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant1ItemCStat"} sefaz-log-evento-variant1-item-c-stat
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogEventoVariant1ItemCStat" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.SefazLogTpAmb"} sefaz-log-tp-amb
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.SefazLogTpAmb" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassCreatedResult"} tax-class-created-result
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassCreatedResult" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassCreatedResult" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassDeleteItem"} tax-class-delete-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassDeleteItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassDeleteItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassDeleteRequest"} tax-class-delete-request
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassDeleteRequest" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassDeleteRequest" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassDeleteRequestReferencia"} tax-class-delete-request-referencia
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassDeleteRequestReferencia" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListBareRate"} tax-class-list-bare-rate
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListBareRate" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListCofins"} tax-class-list-cofins
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListCofins" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListCofins" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListCofinsAliquota"} tax-class-list-cofins-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListCofinsAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListGroupObject"} tax-class-list-group-object
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListGroupObject" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListGroupObject" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIbsCbs"} tax-class-list-ibs-cbs
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIbsCbs" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIbsCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIbsCbsDeferral"} tax-class-list-ibs-cbs-deferral
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIbsCbsDeferral" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIbsCbsDeferral" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIbsCbsDeferralAliquotaDiferimento"} tax-class-list-ibs-cbs-deferral-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIbsCbsDeferralAliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcms"} tax-class-list-icms
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcms" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaCredito"} tax-class-list-icms-aliquota-credito
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaCredito" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaDiferimento"} tax-class-list-icms-aliquota-diferimento
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaDiferimento" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaDiferimentoFcp"} tax-class-list-icms-aliquota-diferimento-fcp
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaDiferimentoFcp" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaEfetivaIcms"} tax-class-list-icms-aliquota-efetiva-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaEfetivaIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaEfetivaIcmsSt"} tax-class-list-icms-aliquota-efetiva-icms-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaEfetivaIcmsSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaImportacao"} tax-class-list-icms-aliquota-importacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaImportacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaReducao"} tax-class-list-icms-aliquota-reducao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaReducao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaReducaoDestino"} tax-class-list-icms-aliquota-reducao-destino
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaReducaoDestino" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaReducaoSt"} tax-class-list-icms-aliquota-reducao-st
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsAliquotaReducaoSt" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsNaoContribuinte"} tax-class-list-icms-nao-contribuinte
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsNaoContribuinte" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsPresumedCredit"} tax-class-list-icms-presumed-credit
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsPresumedCredit" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsPresumedCredit" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsPresumedCreditAliquota"} tax-class-list-icms-presumed-credit-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIcmsPresumedCreditAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIpi"} tax-class-list-ipi
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIpi" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIpi" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIpiAliquota"} tax-class-list-ipi-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIpiAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIssqn"} tax-class-list-issqn
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIssqn" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIssqn" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListIssqnAliquota"} tax-class-list-issqn-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListIssqnAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListItem"} tax-class-list-item
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListItem" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListItem" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListItemCofins"} tax-class-list-item-cofins
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListItemCofins" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListItemIbsCbs"} tax-class-list-item-ibs-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListItemIbsCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListItemIcms"} tax-class-list-item-icms
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListItemIcms" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListItemPis"} tax-class-list-item-pis
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListItemPis" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListItemTributosEstaduais"} tax-class-list-item-tributos-estaduais
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListItemTributosEstaduais" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListItemTributosFederais"} tax-class-list-item-tributos-federais
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListItemTributosFederais" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListPis"} tax-class-list-pis
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListPis" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListPis" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListPisAliquota"} tax-class-list-pis-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListPisAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCredit"} tax-class-list-presumed-credit
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCredit" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCredit" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCreditAliquotaCbs"} tax-class-list-presumed-credit-aliquota-cbs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCreditAliquotaCbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCreditAliquotaIbs"} tax-class-list-presumed-credit-aliquota-ibs
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCreditAliquotaIbs" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCreditClassificacao"} tax-class-list-presumed-credit-classificacao
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListPresumedCreditClassificacao" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListStateRate"} tax-class-list-state-rate
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListStateRate" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListStateRate" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListStateRateAliquota"} tax-class-list-state-rate-aliquota
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListStateRateAliquota" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListStateRates"} tax-class-list-state-rates
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListStateRates" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassListStateRatesVariant0Item"} tax-class-list-state-rates-variant0-item
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassListStateRatesVariant0Item" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.TaxClassNoResults"} tax-class-no-results
  ([] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassNoResults" {}))
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.TaxClassNoResults" values)))

(defn ^{:model-class "com.webmania.sdk.model.api1fiscal.Uuid"} uuid
  ([values] (value/model "com.webmania.sdk.model.api1fiscal.Uuid" values)))

