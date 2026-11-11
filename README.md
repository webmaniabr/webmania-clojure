<p align="center"><img src=".github/assets/webmania-logo.png" alt="Webmania" width="320"></p>

# Webmania SDK para Clojure

Através do emissor fiscal da Webmania®, você conta com a emissão e o arquivamento dos seus documentos fiscais, cálculo automático de impostos, geração do DANFE para impressão e envio automático de e-mails para os clientes. Com este SDK, o seu sistema em Clojure se integra à nossa REST API para emitir, consultar e cancelar NF-e, NFC-e, NFS-e, CT-e, MDF-e, NFCom e DC-e, baixar XML e PDF dos documentos e usar o Monitor Fiscal.

- Emissor de Nota Fiscal Webmania®: [Saiba mais](https://webmania.com.br/nota-fiscal-eletronica/)
- Documentação da REST API: [Visualizar](https://webmania.com.br/docs/)
- Índice da documentação para assistentes de IA: [llms.txt](https://webmania.com.br/docs/llms.txt)

## Requisitos

- Contrate um dos planos de Nota Fiscal Eletrônica da Webmania®: [Assine agora mesmo](https://webmania.com.br/nota-fiscal-eletronica/#plans-section).
- Clojure 1.12, JDK 17 ou superior e Maven 3.9.
- O SDK para Java, instalado junto (passo abaixo); as chamadas são bloqueantes.
- Credenciais de acesso da sua empresa, disponíveis no [Painel de Controle](https://webmania.com.br/painel/).

## Instalação

O SDK é distribuído pelo repositório [github.com/webmaniabr/webmania-clojure](https://github.com/webmaniabr/webmania-clojure) e ainda não está publicado no Clojars nem no Maven Central. Clone o SDK para Java e este SDK e instale os dois, nessa ordem, no mesmo repositório Maven local:

```sh
git clone https://github.com/webmaniabr/webmania-java.git
git clone https://github.com/webmaniabr/webmania-clojure.git
mvn -B -ntp -f webmania-java/pom.xml -Dmaven.repo.local=/caminho/feed-maven install
mvn -B -ntp -f webmania-clojure/pom.xml -Dmaven.repo.local=/caminho/feed-maven install
```

Declare a dependência no `pom.xml` da sua aplicação:

```xml
<dependency>
  <groupId>com.webmania</groupId>
  <artifactId>webmania-sdk-clojure</artifactId>
  <version>0.1.0-alpha.6</version>
</dependency>
```

Compile a aplicação com o mesmo repositório local (`mvn -Dmaven.repo.local=/caminho/feed-maven compile`), que recebeu os dois SDKs e as suas dependências no `install`.

## Credenciais

Cada serviço usa a sua própria credencial. Guarde-as em variáveis de ambiente (ou em um cofre de segredos) no servidor e nunca as escreva no código-fonte:

| Variável de ambiente | Uso |
|---|---|
| `WEBMANIA_CONSUMER_KEY`, `WEBMANIA_CONSUMER_SECRET`, `WEBMANIA_ACCESS_TOKEN`, `WEBMANIA_ACCESS_TOKEN_SECRET` | NF-e e NFC-e (`sdk/nfe-client`) e arquivos da NF-e (`sdk/nfe-files-client`) |
| `WEBMANIA_ISSUER_TOKEN` | NFS-e, CT-e, MDF-e, NFCom e DC-e (`sdk/emitter-client`) e seus arquivos (`sdk/emitter-files-client`) |
| `WEBMANIA_MONITOR_TOKEN` | Monitor Fiscal (`sdk/monitor-client`) |

```clojure
(ns minha-app
  (:require [webmania.core :as sdk]
            [webmania.operations :as api])
  (:import [com.fasterxml.jackson.databind ObjectMapper]
           [com.webmania.sdk ApiException]
           [com.webmania.sdk.model.api1fiscal NfeIssueDocumentRequest NfeGetDocumentRequest NfeCancelDocumentRequest]
           [com.webmania.sdk.model.api1files NfeDownloadDanfeRequest NfeDownloadXmlRequest]
           [com.webmania.sdk.model.api2nfseissuance EmitterIssueNfseRequest EmitterCancelNfseRequest]
           [com.webmania.sdk.model.api2emitterreads EmitterGetNfseRequest]))

(def credenciais (sdk/company-credentials (System/getenv "WEBMANIA_CONSUMER_KEY") (System/getenv "WEBMANIA_CONSUMER_SECRET")
                                          (System/getenv "WEBMANIA_ACCESS_TOKEN") (System/getenv "WEBMANIA_ACCESS_TOKEN_SECRET")))
(def nfe (sdk/nfe-client credenciais))                ; NF-e e NFC-e
(def arquivos (sdk/nfe-files-client credenciais))     ; arquivos da NF-e
(def emissor (sdk/emitter-client (sdk/issuer-credentials (System/getenv "WEBMANIA_ISSUER_TOKEN"))))  ; NFS-e, CT-e, MDF-e, NFCom e DC-e

(def json (ObjectMapper.))
(defn corpo [no] (doto (.createObjectNode json) (.set "body" no)))  ; {"body": ...}
(defn campo [nome valor] (.put (.createObjectNode json) nome valor))
(defn resposta [resultado] (.toJson (.data resultado)))
```

As operações ficam em `webmania.operations` e recebem o cliente e a classe `<Operação>Request` do SDK para Java. Cada uma devolve um `ApiResult`: `.status` traz o status HTTP e `.data` o conteúdo. Feche os clientes com `.close` (ou `with-open`) ao terminar.

## Utilização

Os exemplos abaixo usam o ambiente de **homologação** (`ambiente` 2), em que os documentos não têm validade fiscal. Para emitir em produção, envie `ambiente` 1. Os pedidos são montados a partir de JSON; informe valores decimais como texto (`"44.90"`) para manter a precisão.

### Status do SEFAZ e certificado A1

```clojure
(println (.asText (.path (resposta (api/nfe-get-sefaz-status nfe)) "status")))                 ; online ou offline
(println (.asInt (.path (resposta (api/nfe-get-certificate-validity nfe)) "expiration")))      ; dias até o vencimento do certificado A1
```

### Emitir NF-e

Para emitir uma NF-e, use `api/nfe-issue-document` com o JSON da nota no campo `body`. A mesma função emite NFC-e com `"modelo": 2`.

```clojure
(def dados (.readTree json "{
  \"operacao\": 1,
  \"natureza_operacao\": \"Venda de produção do estabelecimento\",
  \"modelo\": 1,
  \"finalidade\": 1,
  \"ambiente\": 2,
  \"cliente\": {
    \"cpf\": \"000.000.000-00\", \"nome_completo\": \"Nome do Cliente\",
    \"endereco\": \"Av. Brg. Faria Lima\", \"numero\": \"1000\", \"bairro\": \"Itaim Bibi\",
    \"cidade\": \"São Paulo\", \"uf\": \"SP\", \"cep\": \"00000-000\", \"email\": \"nome@email.com\"
  },
  \"produtos\": [{
    \"nome\": \"Nome do produto\", \"codigo\": \"nome-do-produto\", \"ncm\": \"6109.10.00\",
    \"quantidade\": \"1\", \"unidade\": \"UN\", \"origem\": 0,
    \"subtotal\": \"44.90\", \"total\": \"44.90\", \"classe_imposto\": \"REF1000\"
  }],
  \"pedido\": {\"presenca\": 2, \"modalidade_frete\": 9, \"pagamento\": 0, \"forma_pagamento\": \"01\", \"total\": \"44.90\"}
}"))

(def nota (resposta (api/nfe-issue-document nfe (NfeIssueDocumentRequest. (corpo dados)))))
(def uuid (.asText (.path nota "uuid")))   ; identificador único da nota fiscal
(println (.asText (.path nota "status")))  ; aprovado, reprovado, processamento...
(println (.asText (.path nota "nfe")))     ; número da NF-e
(println (.asText (.path nota "chave")))   ; chave de acesso
(println (.asText (.path nota "xml")))     ; URL do XML
(println (.asText (.path nota "danfe")))   ; URL do DANFE (PDF)
(println (.asText (.path nota "motivo")))  ; retorno do SEFAZ
```

Somente o status `aprovado` indica uma nota autorizada. Quando o retorno for `processamento`, consulte a nota alguns segundos depois.

### Consultar NF-e

```clojure
(def consulta (resposta (api/nfe-get-document nfe (NfeGetDocumentRequest. (campo "uuid" uuid)))))
(println (.asText (.path consulta "status")))
```

A consulta também aceita a chave de acesso (`chave`).

### Cancelar NF-e

```clojure
(def cancelamento (doto (campo "uuid" uuid)
                    (.put "motivo" "Cancelamento por erro no pedido.")))  ; mínimo de 15 caracteres
(def cancelada (resposta (api/nfe-cancel-document nfe (NfeCancelDocumentRequest. (corpo cancelamento)))))
(println (.asText (.path cancelada "status")))
```

### Baixar o DANFE e o XML

```clojure
(let [danfe (.data (api/nfe-download-danfe arquivos (NfeDownloadDanfeRequest. (campo "identifier" uuid))))]
  (with-open [saida (clojure.java.io/output-stream "danfe.pdf")] (.write saida (.bytes danfe))))

(let [xml (.data (api/nfe-download-xml arquivos (NfeDownloadXmlRequest. (campo "identifier" uuid))))]
  (with-open [saida (clojure.java.io/output-stream "nfe.xml")] (.write saida (.bytes xml))))
```

### Emitir, consultar e cancelar NFS-e

A NFS-e é emitida a partir de um ou mais RPS com `api/emitter-issue-nfse`:

```clojure
(def rps (.readTree json "{
  \"ambiente\": 2,
  \"rps\": [{
    \"servico\": {
      \"valor_servicos\": \"15.00\",
      \"discriminacao\": \"Prestação de serviço referente ao mês 10/2026\",
      \"classe_imposto\": \"REF000000\"
    },
    \"tomador\": {\"cpf\": \"000.000.000-00\", \"nome_completo\": \"Nome do tomador\"}
  }]
}"))
(def nfse (resposta (api/emitter-issue-nfse emissor (EmitterIssueNfseRequest. (corpo rps)))))
(def uuid-nfse (.asText (.path nfse "uuid")))
(println (.asText (.path nfse "status")))

(def consulta-nfse (resposta (api/emitter-get-nfse emissor (EmitterGetNfseRequest. (campo "identifier" uuid-nfse)))))
(println (.asText (.path consulta-nfse "status")) (.asText (.path consulta-nfse "numero")))

(def cancela (doto (campo "uuid" uuid-nfse)
               (.put "motivo" "1")                                              ; código do motivo (veja a documentação da NFS-e)
               (.put "justificativa" "Serviço cancelado a pedido do tomador.")))  ; mínimo de 15 caracteres
(println (.asText (.path (resposta (api/emitter-cancel-nfse emissor (EmitterCancelNfseRequest. (corpo cancela)))) "status")))
```

### Tratamento de erros

As falhas da API lançam `ApiException` (do SDK para Java); erros locais de configuração usam `ex-info` com `{:kind :configuration}`:

```clojure
(try
  (api/nfe-issue-document nfe (NfeIssueDocumentRequest. (corpo dados)))
  (catch ApiException erro
    (println (.kind erro))         ; VALIDATION (dados recusados antes do envio), API (recusa da API ou do SEFAZ), HTTP, TIMEOUT...
    (println (.status erro))       ; status HTTP, quando houver
    (println (.getMessage erro))   ; mensagem, com dados sensíveis mascarados
    (when (.outcomeUncertain erro)
      ;; A requisição pode ter sido processada: consulte a nota antes de emitir de novo.
      nil)))
```

O SDK não repete requisições automaticamente. Se uma emissão ou um cancelamento terminar com resultado desconhecido (`.outcomeUncertain` verdadeiro), consulte o documento antes de tentar novamente, para não emitir em duplicidade.

## Métodos disponíveis

**NF-e e NFC-e** — `sdk/nfe-client`

- **api/nfe-issue-document**: Emissão de NF-e ou NFC-e junto ao SEFAZ.
- **api/nfe-get-document**: Consulta da nota fiscal pelo UUID, pela chave de acesso ou pelo ID do pedido.
- **api/nfe-cancel-document**: Cancelamento de NF-e ou NFC-e.
- **api/nfe-create-correction**: Carta de correção.
- **api/nfe-void-numbering**: Inutilização de sequência de numeração.
- **api/nfe-issue-return**: Emissão de NF-e de devolução.
- **api/nfe-issue-complement**: Emissão de NF-e complementar.
- **api/nfe-issue-adjustment**: Emissão de NF-e de ajuste.
- **api/nfe-create-manifestation**: Manifestação do destinatário.
- **api/nfe-create-payment-event** / **api/nfe-cancel-payment-event**: Evento de conciliação financeira (ECONF) e o seu cancelamento.
- **api/nfe-create-ibs-cbs-event** / **api/nfe-cancel-ibs-cbs-event**: Eventos de IBS/CBS e o seu cancelamento.
- **api/nfe-list-tax-classes** / **api/nfe-save-tax-classes** / **api/nfe-delete-tax-classes**: Classes de imposto.
- **api/fiscal-create-or-poll-report**: Relatórios fiscais.
- **api/fiscal-update-company**: Atualização dos dados da empresa emissora.
- **api/nfe-get-sefaz-status**: Verifica se o SEFAZ está online ou offline.
- **api/nfe-get-certificate-validity**: Verifica quantos dias faltam para o certificado A1 expirar.

**NFS-e** — `sdk/emitter-client`

- **api/emitter-issue-nfse**: Emissão de NFS-e a partir de RPS.
- **api/emitter-get-nfse**: Consulta da NFS-e.
- **api/emitter-cancel-nfse**: Cancelamento da NFS-e.
- **api/emitter-replace-nfse**: Substituição de NFS-e.
- **api/emitter-manifest-nfse**: Manifestação sobre NFS-e nacional.
- **api/emitter-get-nfse-provider-status**: Recursos do provedor de NFS-e do município da empresa.

**CT-e e CT-e OS** — `sdk/emitter-client`

- **api/emitter-issue-cte** / **api/emitter-issue-simplified-cte**: Emissão de CT-e, CT-e OS e CT-e simplificado.
- **api/emitter-get-cte**: Consulta do CT-e.
- **api/emitter-cancel-cte**: Cancelamento do CT-e.
- **api/emitter-correct-cte**: Carta de correção do CT-e.
- **api/emitter-confirm-cte-delivery** / **api/emitter-cancel-cte-delivery**: Comprovante de entrega e o seu cancelamento.
- **api/emitter-link-cte-payment** / **api/emitter-cancel-cte-payment-link** / **api/emitter-get-cte-payment-events**: Eventos de pagamento do CT-e.

**MDF-e** — `sdk/emitter-client`

- **api/emitter-issue-mdfe**: Emissão do MDF-e.
- **api/emitter-get-mdfe**: Consulta do MDF-e pela chave de acesso.
- **api/emitter-close-mdfe**: Encerramento do MDF-e.
- **api/emitter-cancel-mdfe**: Cancelamento do MDF-e.
- **api/emitter-add-mdfe-conductor**: Inclusão de condutor.

**NFCom e DC-e** — `sdk/emitter-client`

- **api/emitter-issue-nfcom** / **api/emitter-get-nfcom** / **api/emitter-cancel-nfcom**: Emissão, consulta e cancelamento da NFCom.
- **api/emitter-get-nfcom-payment-events**: Eventos de pagamento da NFCom.
- **api/emitter-get-nfcom-service-status**: Disponibilidade do serviço da NFCom no SEFAZ.
- **api/emitter-issue-dce** / **api/emitter-get-dce** / **api/emitter-cancel-dce**: Emissão, consulta e cancelamento da DC-e.

**Arquivos (XML e PDF)** — `sdk/nfe-files-client` e `sdk/emitter-files-client`

- **api/nfe-download-danfe** / **api/nfe-download-simple-danfe** / **api/nfe-download-label-danfe**: DANFE completo, simplificado e etiqueta.
- **api/nfe-download-xml** / **api/nfe-download-cancellation-xml**: XML da NF-e e do cancelamento.
- **api/nfe-download-correction-pdf** / **api/nfe-download-correction-xml**: PDF e XML da carta de correção.
- **api/file-get-nfse-xml** / **api/file-get-nfse-pdf** / **api/file-get-nfse-rps-pdf**: XML e PDF da NFS-e e PDF do RPS.
- **api/file-get-cte-xml** / **api/file-get-cte-pdf** / **api/file-get-mdfe-xml** / **api/file-get-mdfe-pdf** / **api/file-get-nfcom-xml** / **api/file-get-nfcom-pdf** / **api/file-get-dce-xml** / **api/file-get-dce-pdf**: XML e PDF de CT-e, MDF-e, NFCom e DC-e.

**Monitor Fiscal** — `sdk/monitor-client`

- **api/monitor-search-documents** / **api/monitor-get-document** / **api/monitor-list-document-events**: Busca e consulta de documentos recebidos e do histórico de eventos.
- **api/monitor-manifest-document**: Manifestação do destinatário.
- **api/monitor-import-document** / **api/monitor-get-import-status**: Importação por chave de acesso, XML ou ZIP.
- **api/monitor-list-companies** / **api/monitor-create-company** / **api/monitor-update-company**: Empresas monitoradas.

**Gerencial B2B** — `sdk/reseller-client`

- **api/b2b-v1-create-companies** / **api/b2b-v1-list-companies** / **api/b2b-v1-get-processed-requests**: Cadastro de empresas, listagem e contagem de notas processadas por empresa.

A lista completa, com todas as funções do Monitor Fiscal e dos arquivos, está em [docs/OPERATIONS.md](docs/OPERATIONS.md).

## Exemplo completo em homologação

A pasta [examples/homologacao](examples/homologacao) traz um programa que emite, consulta, baixa os arquivos e cancela uma NF-e e uma NFS-e em homologação, usando as credenciais das variáveis de ambiente. Por segurança, ele só envia requisições quando `WEBMANIA_LIVE=1` está definido e `WEBMANIA_LIVE_ALLOWED_HOSTS` lista os hosts da API. Para rodar só as consultas (status do SEFAZ, certificado e provedor de NFS-e):

```sh
WEBMANIA_LIVE=1 WEBMANIA_LIVE_SCOPE=readonly WEBMANIA_LIVE_ALLOWED_HOSTS=webmania.com.br,nfe.webmania.com.br,api.webmania.com.br sh examples/homologacao/run.sh
```

As variáveis aceitas e o formato da saída estão em [examples/homologacao/README.md](examples/homologacao/README.md).

## Documentação

- Documentação da REST API: [NF-e / NFC-e](https://webmania.com.br/docs/rest-api-nfe/) · [NFS-e](https://webmania.com.br/docs/rest-api-nfse/) · [CT-e](https://webmania.com.br/docs/rest-api-cte/) · [MDF-e](https://webmania.com.br/docs/rest-api-mdfe/) · [NFCom](https://webmania.com.br/docs/rest-api-nfcom/) · [DC-e](https://webmania.com.br/docs/rest-api-dce/) · [Monitor Fiscal](https://webmania.com.br/docs/rest-api-monitor-fiscal/) · [Gerencial B2B](https://webmania.com.br/docs/rest-api-gerencial-b2b/)
- Contratos OpenAPI: [API 2.0](https://api.webmania.com.br/docs/openapi) e [NF-e](https://webmania.com.br/docs/rest-api-nfe/?format=openapi)
- Detalhes técnicos do SDK (URL base, arquivos, relatórios, limites): [docs/INTEGRATION.md](docs/INTEGRATION.md)
- Lista completa de funções: [docs/OPERATIONS.md](docs/OPERATIONS.md)
- Desenvolvimento e testes do SDK: [docs/TESTING.md](docs/TESTING.md)
- Histórico de versões: [CHANGELOG.md](CHANGELOG.md)

## Suporte

Qualquer dúvida entre em contato na nossa [Central de Ajuda](https://ajuda.webmania.com.br) ou acesse o [Painel de Controle](https://webmania.com.br/painel/) para conversar em tempo real no Chat ou Abrir um chamado.

## Licença

Licença proprietária Webmania®: veja [LICENSE](LICENSE) e os [Termos de Uso](https://webmania.com.br/termos-de-uso/). As dependências de terceiros mantêm as suas próprias licenças.
