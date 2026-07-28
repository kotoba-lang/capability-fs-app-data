(ns kotoba.capability.fs.app-data
  "Importable contract for fs/app-data.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:fs-read :fs-write :fs-write-atomic}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z51vNMpisTEAsj9pHU6KQuUwfQZ3", :capability/repository "kotoba-lang/capability-fs-app-data", :capability/id "fs/app-data", :capability/effects #{:storage-read :storage-write}, :capability/provider-status :contract-only})
