(ns app.auth.views.sign-up
  (:require [app.components.page_nav :refer [page-nav]]))

(defn sign-up
  []
  [page-nav {:center "Sign up"}])
