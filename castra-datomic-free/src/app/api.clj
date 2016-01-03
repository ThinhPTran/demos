(ns app.api
  (:require
    [app.db :refer [datomic-conn]]
    [app.datomic-query :refer [fetch-random-data]]
    [castra.core :refer [defrpc]]))

(defrpc get-state []
  {:random (fetch-random-data datomic-conn)})