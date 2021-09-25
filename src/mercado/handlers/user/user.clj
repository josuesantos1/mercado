(ns mercado.handlers.user.user
  (:require [ring.util.response :as ring-resp]))


(defn create-user 
  [request]
  (let [user (get-in request [:body-params :user])]
    (ring-resp/response  {:status 200 :body "Created"})))

(defn get-user 
  [request]
  (let [user (get-in request [:body-params :user])]
    (ring-resp/response  {:status 200 :body "User"})))

(defn update-user
  [request]
  (let [user (get-in request [:body-params :user])]
    (ring-resp/response  {:status 200 :body "Updated"})))


(defn delete-user
  [request]
  (let [user (get-in request [:body-params :user])]
    (ring-resp/response  {:status 200 :body "Deleted"})))

