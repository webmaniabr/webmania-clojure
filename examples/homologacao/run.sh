#!/bin/sh
# Optional homologation example (ambiente 2). Builds this SDK into a temporary directory and runs
# homologacao.clj. Nothing is built or sent unless WEBMANIA_LIVE=1. Configuration comes only from the
# WEBMANIA_* environment documented in the README.
set -eu
if [ "${WEBMANIA_LIVE:-}" != "1" ]; then
  printf '%s\n' '{"result":"blocked"}'
  exit 77
fi
here=$(cd "$(dirname "$0")" && pwd)
root=$(cd "$here/../.." && pwd)
work=$(mktemp -d "${TMPDIR:-/tmp}/webmania-homologacao.XXXXXX")
trap 'rm -rf "$work"' EXIT INT TERM
# WEBMANIA_MAVEN_REPO selects a prepared offline Maven repository (absolute path). It must already contain
# the pinned Java SDK, its dependencies and the Maven plugins the build uses. Without it, prepared container
# locations are used when present: an offline Maven repository and the pinned Java SDK archive (JAR and POM).
# Otherwise the user's local repository must already contain the pinned Java SDK.
repo="${HOME:-/tmp}/.m2/repository"
if [ -n "${WEBMANIA_MAVEN_REPO:-}" ]; then
  case "$WEBMANIA_MAVEN_REPO" in
    /*) [ -d "$WEBMANIA_MAVEN_REPO" ] || { printf '%s\n' '{"result":"blocked","reason":"maven_repo"}'; exit 77; } ;;
    *) printf '%s\n' '{"result":"blocked","reason":"maven_repo"}'; exit 77 ;;
  esac
  repo="$WEBMANIA_MAVEN_REPO"
elif [ -d /opt/m2-seed ]; then cp -R /opt/m2-seed "$work/m2"; repo="$work/m2"; fi
# A selected feed is used as given: the script does not copy the Java SDK archive into it.
if [ -z "${WEBMANIA_MAVEN_REPO:-}" ] && [ -d /deps/java ]; then
  dest="$repo/com/webmania/webmania-sdk/0.1.0-preview.9"; mkdir -p "$dest"
  cp /deps/java/webmania-sdk-0.1.0-preview.9.jar /deps/java/webmania-sdk-0.1.0-preview.9.pom "$dest/"
fi
mkdir -p "$work/sdk"
(cd "$root" && tar -cf - --exclude ./target --exclude ./.maven-local --exclude ./.git .) | (cd "$work/sdk" && tar -xf -)
# Build in a subshell so relative WEBMANIA_LIVE_* paths keep resolving against the caller's directory.
(cd "$work/sdk" && mvn -o -q -B -ntp -Dmaven.repo.local="$repo" -DskipTests package dependency:build-classpath -Dmdep.outputFile="$work/classpath.txt" >&2)
jar=$(ls "$work"/sdk/target/webmania-sdk-clojure-*.jar | grep -v -- '-sources.jar' | head -n 1)
java -cp "$jar:$(cat "$work/classpath.txt")" clojure.main "$here/homologacao.clj"
