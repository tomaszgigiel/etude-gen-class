(defproject etude-gen-class "1.0.0.0-SNAPSHOT"
  :description ":gen-class in Clojure"
  :url "http://tomaszgigiel.pl"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.7"]
                 [org.clojure/tools.logging "0.4.1"]
                 ;; otherwise log4j.properties has no effect
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]]

  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :resource-paths ["src/main/resources"]
  :target-path "target/%s"
  :jar-name "etude-gen-class.jar"
  :uberjar-name "etude-gen-class-uberjar.jar"
  :main ^:skip-aot pl.tomaszgigiel.etude-gen-class.core
  ;; MyBigInteger is compiled twice, but:
  ;; I do not want to maintain:
  ;; :aot [pl.tomaszgigiel.etude-gen-class.MyBigInteger #"^(?:(?!pl.tomaszgigiel.etude-gen-class.MyBigInteger$).)*$"]
  ;; this is not a big problem for me
  :aot [pl.tomaszgigiel.etude-gen-class.MyBigInteger #".*"]
)