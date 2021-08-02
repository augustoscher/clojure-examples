(ns tutorial.namespaces
  (:require [clojure.string :refer [capitalize]])) ;; IMPORTING capitalize from clojure.string
  ;; (:require [clojure.string :refer :all])) NOT RECOMENDED

(defn -main
  []
  (println (capitalize "hello")))
(-main)