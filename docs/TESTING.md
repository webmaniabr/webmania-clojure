# Testes e desenvolvimento

Como compilar e testar o SDK para Clojure a partir da fonte. O contrato fixado e a versão estão descritos em [INTEGRATION.md](INTEGRATION.md).

`mvn install` compila e empacota o SDK, mas **não executa os testes Clojure**: eles rodam explicitamente com `clojure.main` contra o JAR instalado. Dentro de um contêiner de desenvolvimento (os testes leem as fixtures sintéticas em `/input-fixtures`):

```sh
mvn -B -ntp -Dmaven.repo.local=.maven-local install dependency:build-classpath -Dmdep.outputFile=target/classpath.txt
mkdir -p /input-fixtures && cp -R src/test/resources/. /input-fixtures/ && cp operation-map.json /input-fixtures/operation-map.json
java -cp ".maven-local/com/webmania/webmania-sdk-clojure/0.1.0-alpha.6/webmania-sdk-clojure-0.1.0-alpha.6.jar:target/test-classes:$(cat target/classpath.txt):src/test/clojure" clojure.main src/test/clojure/author.clj
```

Os testes em `src/test` usam HTTP/TLS loopback com fixtures sintéticas e não fazem chamadas fiscais reais. O repositório Maven local precisa conter o JAR Java exato indicado em [runtime-contract.lock.json](../runtime-contract.lock.json).
