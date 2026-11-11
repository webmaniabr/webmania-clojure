# Changelog

## 0.1.0-alpha.6 (unreleased)

- README rewritten for integrators: requirements, installation, credentials from environment variables, homologation examples that issue, consult and cancel an NF-e and an NFS-e, and the method list per product. The technical details that were in the README moved unchanged to `docs/INTEGRATION.md`, `docs/TESTING.md`, `docs/OPERATIONS.md` and `examples/homologacao/README.md`. Documentation only.
- README: the SDK is presented as available from the public GitHub repository and installed from a clone (`git clone https://github.com/webmaniabr/webmania-clojure.git`); it is still not published to a package registry. Documentation only: code and contract are unchanged.
- Pins the Java SDK whose in-process DNS fallback runs at most 16 lookups at once, so a hanging DNS cannot accumulate threads (new JAR, POM and sources SHA-256; the contract digest is unchanged).
- Homologation example: `WEBMANIA_LIVE_ALLOWED_HOSTS` is required (absent or empty, the example exits 77 before any request), and a payload is accepted only when its top-level `ambiente` is the JSON integer `2` (the text `"2"` is refused).
- Homologation example: after an NFS-e cancellation the example keeps consulting while the document is in `processando_cancelamento`; only `cancelado` counts as success.
- Pins the Java SDK rebuilt from the current public contracts: tax-class list items (`nfeListTaxClasses`) are read with dedicated schemas that accept every value a saved class returns (ICMS `nao_contribuinte` as a boolean or `"0"`/`"1"`, a `null` rate when none is stored, one object instead of a list for NFCom and NFS-e groups, `type` always present); the tax-class save request (`nfeSaveTaxClasses`) follows the rules the save enforces (per-UF ICMS rates are `{estado, aliquota}` instead of `{estado, valor}`, `icms`, `ipi`, `pis` and `cofins` need at least one scenario, IBS/CBS `credito_presumido` is one object, `aliquota_carga_efetiva` is no longer published).
- Pins the Java SDK rebuilt from the current public contracts: tax-class list totals (`tributos_federais`, `tributos_estaduais`) accept an empty string for an unset value; tax-class `situacao_tributaria` has 2 digits for IPI, PIS and COFINS and 2 to 3 for ICMS; NFS-e `impostos.reducao` and `impostos.cp` accept text or a JSON number.
- Homologation example: a document the issue call does not return as `aprovado` is only consulted and never cancelled by the example; the refused NF-e status is `reprovado`; decimal numbers of the payload files are read exactly (`BigDecimal`), as the SDK refuses binary floating point.
- Pins the Java SDK `com.webmania:webmania-sdk:0.1.0-preview.9` rebuilt from the current public contracts (14 modules, 103 operations, 102 enabled), by JAR, POM and sources SHA-256 in `runtime-contract.lock.json`; the contract is identified by `contract_digest` instead of a commit.
- Model factories of the API 2.0 issuance request bodies follow the operation-derived Java names (`<OperationId>Payload`).
- `fiscal-download-report-v2` and `helpers/download-report` for current reports through the `nfe-files` client; legacy CSV/XLSX reports labeled `text/xml` are identified by their bytes.
- Runtime dependencies follow the Java SDK: Jackson `jackson-databind`/`jackson-core` 2.21.7 and `jackson-annotations` 2.21.
- `nfeDownloadIbsCbsEventXml` is not available in this release.
- README states that `mvn install` does not run the Clojure tests and gives the exact command that does.
- New optional homologation example in `examples/homologacao`.

## Earlier previews

- Clojure/JVM bindings with named operations, scoped clients and model factories over the Java SDK, exact bounded value conversion, explicit presence/null helpers, bounded pagination/polling and inspected file metadata.
