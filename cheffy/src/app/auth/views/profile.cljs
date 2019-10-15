(ns app.auth.views.profile
  (:require [app.components.page_nav :refer [page-nav]]))

(defn profile
  []
  [page-nav {:center "Profile"}])
