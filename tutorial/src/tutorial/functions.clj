(ns tutorial.functions
  (:gen-class))


(defn -main
  "firts function"
  []
  (println "My name is Augusto")
  (println "Loving clojure so far")
  (+ 2 5))

;; Functions are also values

;; defn keyword creates a function
;; def keyword assign a function to the main

;; Anonim function
(println "Hello" %)

;; calling it
(#(println "Hello" %1 %2) "Augusto" "Scher")

;; increment receives a function as argument
(def increment
  (fn [x] (+ x 1)))

(defn increment_set ;; will return 2 3 4
  []
  (map increment [1 2 3])) ;; apply each value of set to increment function

(defn increment_value ;; calling (increment_value [1 2 3 4 5])
  [v]
  (map increment v))
