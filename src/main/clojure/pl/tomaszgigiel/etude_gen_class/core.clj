(ns pl.tomaszgigiel.etude-gen-class.core
  (:import pl.tomaszgigiel.etude-gen-class.MyBigInteger)
  (:require [clojure.tools.logging :as log])
  (:gen-class))

(defn -main [& args]
  "etude-gen-class: :gen-class in Clojure"
  (-> "255" MyBigInteger. log/info)
  (-> "255" MyBigInteger. (.toString 16) log/info)
  (log/info "ok"))