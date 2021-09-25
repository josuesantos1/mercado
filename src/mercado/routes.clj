(ns mercado.routes 
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.body-params :as body-params]
            
            [mercado.handlers.user.user :as user]))


;; Defines "/" and "/about" routes with their associated :get handlers.
;; The interceptors defined after the verb map (e.g., {:get home-page}
;; apply to / and its children (/about).
(def common-interceptors [(body-params/body-params) http/html-body])

;; Tabular routes
(def routes #{["/user" :get (conj common-interceptors `user/get-user)]
              ["/user" :post (conj common-interceptors `user/create-user)]})
