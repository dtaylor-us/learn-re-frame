(ns app.auth.views.log-in
  (:require [app.components.page_nav :refer [page-nav]]))

(defn log-in
  []
  [page-nav {:center "Log in"}])
