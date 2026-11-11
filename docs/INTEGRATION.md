# Detalhes técnicos de integração

Este documento reúne os detalhes técnicos do SDK para Clojure que complementam o [README](../README.md): autenticação, URL base, limites de transporte, arquivos, relatórios e o tratamento do resultado fiscal. O texto é o mesmo que estava no README até esta versão.

## Escopo e disponibilidade

Integração de **Emissor Fiscal e Monitor Fiscal** em aplicações de servidor. O Emissor abrange NF-e/NFC-e na API1 e NFS-e, CT-e/CT-e OS, MDF-e, NFCom e DC-e na API2, com arquivos, eventos e as três operações gerenciais B2B públicas da API1. O Monitor mantém apenas as famílias de documentos e capacidades do seu contrato documentado.

Disponível no repositório público [github.com/webmaniabr/webmania-clojure](https://github.com/webmaniabr/webmania-clojure), com instalação a partir do clone (veja a seção Instalação). Ainda não há publicação em registro de pacotes; os nomes e versões abaixo identificam os pacotes gerados a partir desta fonte. Regras do provedor, aceitação fiscal real e plataformas adicionais permanecem com limitações explícitas.

## Visão geral para desenvolvedores

| Item | Detalhe |
|---|---|
| Status | Disponível no GitHub: versão `0.1.0-alpha.6` (`com.webmania:webmania-sdk-clojure`), instalada a partir do clone do repositório em um repositório Maven local; ainda sem publicação no Clojars, Maven Central ou outro registro de pacotes |
| Runtime | Clojure 1.12.0, JDK 17+; chamadas bloqueantes; depende exclusivamente de `com.webmania:webmania-sdk:0.1.0-preview.9` (SDK Java) |
| Clientes (`webmania.core`) | `nfe-client` (NF-e/NFC-e API 1.0), `nfe-files-client`, `reseller-client` (gerencial B2B API 1.0), `emitter-client` (emissor API 2.0), `emitter-files-client`, `monitor-client` (Monitor Fiscal); operações em `webmania.operations` |
| Cobertura | Mapa de operações em [operation-map.json](../operation-map.json); modelos em `webmania.models.*` |
| Erros | `com.webmania.sdk.ApiException` do SDK Java (`kind`, `status`, `outcomeUncertain`); erros locais de configuração usam `ex-info` com `{:kind :configuration}` |
| Contrato | OpenAPI fixado em [runtime-contract.lock.json](../runtime-contract.lock.json) por `contract_digest` (`371a499f74012bb6b41f23642869dee4954e8394dcba7642edc701aedb3dd59e`), o mesmo do SDK Java fixado |

### Autenticação

- **NF-e/NFC-e (API 1.0)** — `(sdk/company-credentials key secret token token-secret)` e `(sdk/reseller-credentials ...)` são enviadas pelo SDK Java nos cabeçalhos `X-Consumer-Key`, `X-Consumer-Secret`, `X-Access-Token` e `X-Access-Token-Secret`.
- **API 2.0** — `(sdk/issuer-credentials token)`, `(sdk/monitor-credentials token)` e `(sdk/file-company-credentials token)` são enviadas como `Authorization: Bearer <token>`. `(sdk/document-token token)` é o modo explícito de token de documento para arquivos.

O exemplo abaixo lê as credenciais com `System/getenv` (`WEBMANIA_CONSUMER_KEY`, `WEBMANIA_CONSUMER_SECRET`, `WEBMANIA_ACCESS_TOKEN`, `WEBMANIA_ACCESS_TOKEN_SECRET`).

## Requisitos

Clojure 1.12.0 e JDK 17+. Perfil controlado em Linux/JDK 17 e 21. Os métodos bloqueiam a thread chamadora. Não há qualificação ClojureScript, mobile ou de outras plataformas.

## Instalação

Clone os repositórios públicos do SDK Java e deste SDK e instale os dois, nessa ordem, no mesmo repositório Maven local:

```sh
git clone https://github.com/webmaniabr/webmania-java.git
git clone https://github.com/webmaniabr/webmania-clojure.git
mvn -B -ntp -f webmania-java/pom.xml -Dmaven.repo.local=/caminho/feed-maven install
mvn -B -ntp -f webmania-clojure/pom.xml -Dmaven.repo.local=/caminho/feed-maven install
```

Declare no consumidor:

```xml
<dependency>
  <groupId>com.webmania</groupId>
  <artifactId>webmania-sdk-clojure</artifactId>
  <version>0.1.0-alpha.6</version>
</dependency>
```

Use mvn -Dmaven.repo.local=/caminho/feed-maven compile no consumidor; esse repositório local recebe os dois SDKs e suas dependências no `install`. As coordenadas ainda não estão publicadas no Clojars nem no Maven Central. Não é necessário executar o gerador. A dependência Java é exclusivamente com.webmania:webmania-sdk:0.1.0-preview.9; mantenha o JAR exato indicado no lock. Classes avulsas ou outro JAR no classpath são recusados. Em deps.edn use {:deps {com.webmania/webmania-sdk-clojure {:mvn/version "0.1.0-alpha.6"}}} com o mesmo repositório Maven local.

## Primeira consulta

Configure somente a credencial do serviço escolhido, por instância, a partir de ambiente privado ou cofre de segredos. O exemplo não emite nem cancela documentos. Execute consultas apenas com conta e ambiente autorizados; uma origem de fixture controlada deve ser configurada explicitamente pela API do cliente.

```clojure
(require '[webmania.core :as sdk]
         '[webmania.operations :as api]
         '[webmania.models.api1fiscal :as fiscal])

;; Obtenha os quatro valores por um canal de segredos da aplicação.
(def credential (sdk/company-credentials
  (System/getenv "WEBMANIA_CONSUMER_KEY") (System/getenv "WEBMANIA_CONSUMER_SECRET")
  (System/getenv "WEBMANIA_ACCESS_TOKEN") (System/getenv "WEBMANIA_ACCESS_TOKEN_SECRET")))
(with-open [client (sdk/nfe-client credential)]
  (let [result (api/nfe-get-sefaz-status client (fiscal/nfe-get-sefaz-status-request))]
    (println (.status result))))
```

A construção do cliente não comprova habilitação da conta. Respostas de sucesso e conversões explícitas para JSON podem conter dados fiscais, credenciais novas ou URLs privadas. Exponha apenas os campos necessários à aplicação.

## Integração e limites

`nfe-client`, `reseller-client`, `emitter-client`, `monitor-client`, `nfe-files-client` e `emitter-files-client` recebem suas respectivas credenciais. Os escopos e a classe nominal do request são conferidos antes do envio. A operação XML de evento IBS/CBS permanece bloqueada pelo contrato antes de qualquer conexão. Nenhuma rota API2 B2B foi inventada. Produtos independentes CNPJ/CIOT/Validador não fazem parte deste SDK.

Factories ficam em `webmania.models.<módulo>`. Recebem mapas com chaves string ou keywords sem namespace e retornam as classes Java tipadas, incluindo seus getters/setters e unions. `nil` representa JSON null; ausência da chave representa omissão. `webmania.value/explicit-null!` e `omit!` operam campos declarados. Extensões desconhecidas são explícitas e não podem substituir campos declarados. Use inteiros arbitrários e `BigDecimal`/literais `M`; `Float`, `Double`, ratios, ciclos, chaves duplicadas após conversão e Unicode inválido são recusados sem renderizar o valor original.

A conversão explícita de valores limita profundidade a 64 e nós a 100.000, incluindo containers vazios e modelos aninhados. `json-value` aceita até 16 MiB codificados; a construção de modelos aceita até 32 MiB para que o envelope de uma operação não reduza o limite padrão de corpo de 8 MiB. O runtime aplica o limite ao corpo HTTP e limita respostas a 16 MiB por padrão. Os limites de construção continuam aplicáveis caso a aplicação aumente limites no `ClientConfig` Java. Mapas Clojure não prometem ordem de propriedades; valores e números permanecem exatos.

`webmania.value/to-json-bytes` e `to-json-string` são conversões deliberadas para uso dos dados. Inspeção textual de credenciais, clientes, resultados e modelos é protegida; essas conversões explícitas contêm os dados. Mapeamento bean arbitrário de unions pelo Jackson não é suportado; o caminho explícito de árvore/bytes é suportado.

`webmania.helpers` fornece `collect-companies`, `collect-company-municipalities`, `collect-reports`, `wait-import` e `wait-report`, com opções limitadas de páginas, itens, tentativas, prazo e intervalo mínimo de cinco segundos. Não há retry automático de emissão/cancelamento, seguimento de redirects ou polling implícito nas operações normais. Os métodos são bloqueantes; interrupção nativa da thread cancela a chamada, preservando incerteza e referência quando uma mutação já foi enviada. Feche clientes com `with-open`.

Downloads expõem `download-kind`, `download-encrypted?`, `download-protection` e `download-bytes`. Os oito tipos são PDF, XML, ZIP, XLSX, CSV, HTML, PDF criptografado e ZIP protegido. Pendência JSON e redirect não têm tipo de arquivo inspecionado. Criptografia e autorização são metadados distintos. A inspeção ZIP comum é estrutural e de metadados; não promete CRC/conteúdo de todos os membros. Não há descriptografia ou validação de autenticidade fiscal.

## Credenciais e resultado fiscal

Credenciais da empresa API1, revenda API1, Bearer do emissor API2 e Bearer Monitor pertencem a escopos diferentes. Arquivos exigem a modalidade de acesso documentada. Uma falha não autoriza trocar automaticamente o modo ou a credencial. Mantenha segredos no servidor.

O catálogo contém 102 operações habilitadas. `nfeDownloadIbsCbsEventXml` não está disponível nesta versão do SDK: a chamada falha com `CAPABILITY_DISABLED` e nenhuma requisição é enviada. Condições fiscais, municipais, de cadastro, provedor e implantação ainda pendentes continuam sujeitas ao contrato e ao serviço. Validação local, cálculo ou prévia não comprovam autorização fiscal.

Não há retry automático de operação nem seguimento automático de redirects. Depois de possível envio de uma operação com efeito, uma falha pode indicar resultado desconhecido. Preserve o seletor original com segurança, consulte a tentativa anterior e decida explicitamente como prosseguir. Uma referência protegida exige acesso deliberado e pode estar ausente; não é uma chave de idempotência.

## Arquivos e processamento

Verifique tipo de resultado, status e representação antes de consumir bytes. JSON pendente, HTML e redirect não comprovam PDF pronto. Proteção de PDF/ZIP é distinta da autorização de download; não há descriptografia automática nem confirmação de autenticidade fiscal. O reconhecimento de formatos cobre somente o perfil documentado desta implementação. Uma Location revelada continua privada e exige decisão explícita de origem e autenticação para outra transferência.

Paginação e espera são optativas e limitadas quando disponíveis. Um estado futuro ou desconhecido não significa conclusão. Não repita emissão, cancelamento ou importação inicial como se fossem consultas de processamento.

Para migrar uma integração anterior, remapeie métodos, modelos e escopos de credencial pela referência desta versão. Não há promessa de substituição automática de outro SDK; compare também o changelog quando disponível.

## Ambiente e URL base

Cada módulo usa a origem pública do contrato (`https://webmania.com.br/api`, `https://nfe.webmania.com.br` e `https://api.webmania.com.br`) até que outra seja configurada. Para outro ambiente, informe a origem HTTPS de cada módulo, com prefixo de caminho quando necessário:

```clojure
(def config (sdk/client-config
  (fn [builder]
    (.origin builder "api1/fiscal.openapi.json" (java.net.URI/create (System/getenv "WEBMANIA_API1_BASE_URL")))
    (.origin builder "api1/files.openapi.json" (java.net.URI/create (System/getenv "WEBMANIA_FILES_BASE_URL")))
    (.origin builder "api2/nfse-issuance.openapi.json" (java.net.URI/create (System/getenv "WEBMANIA_API2_BASE_URL"))))))
(with-open [client (sdk/nfe-client credential config)] (api/nfe-get-sefaz-status client))
```

A origem precisa ser HTTPS (HTTP só em loopback explícito), sem informação de usuário, query, fragmento ou segmentos de ponto; uma origem inválida falha antes de DNS ou socket.

## Documentação para assistentes e contratos

Índices em Markdown para assistentes: [documentação Webmania](https://webmania.com.br/docs/llms.txt) e [API 2.0](https://api.webmania.com.br/llms.txt). Contratos OpenAPI: [API 2.0](https://api.webmania.com.br/docs/openapi) e [NF-e](https://webmania.com.br/docs/rest-api-nfe/?format=openapi).

No catálogo de SDKs, `clojure` aparece como disponível no repositório público, com instalação pelo clone; plataforma Clojure 1.12 / JVM 17+. Estar listado nesses índices não amplia a cobertura documentada deste SDK.
