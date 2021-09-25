(ns mercado.handlers.product.product
  (:require [ring.util.response :as ring-resp]))

(defn create-product
  [request]
  (let [product (get-in request [:body-params :product])]
    (ring-resp/response {:status 200 :body "Created"})))

(defn get-product
  [request]
  (let [product (get-in request [:body-params :product])]
    (ring-resp/response {:status 200 :body "Product"})))

(defn update-product
  [request]
  (let [product (get-in request [:body-params :product])
        product-id (get-in product [:id])]
    (ring-resp/response {:status 200 :body "Updated"})))

(defn delete-product
  [request]
  (let [product-id (get-in request [:body-params :product-id])]
    (ring-resp/response {:status 200 :body "Deleted"})))

