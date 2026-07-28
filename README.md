# capability-fs-app-data

Atomic authority package for `fs/app-data`.

- imports: `#{:fs-read :fs-write :fs-write-atomic}`
- effects: `#{:storage-read :storage-write}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
