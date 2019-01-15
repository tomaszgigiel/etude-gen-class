(ns pl.tomaszgigiel.etude-gen-class.MyBigInteger
  (:gen-class
    :name pl.tomaszgigiel.etude-gen-class.MyBigInteger
    :extends java.math.BigInteger
    :exposes-methods {toString toStringOld}
    :main false))

(defn -toString
  ([this] (.toString this 10)) 
  ([this radix] (str "MyBigInteger = " (.toStringOld this radix))))