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
#(println "Hello" %)

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

;; def is also used to define variables
;; variables are imutable, once assigned, we could not reassign
;; variable are caseSensitive
(defn DataTypes []
  (def a 1)    ;; integer
  (def b 1.25) ;; float
  (def c 1.25e-12) ;; float cientific notation
  (def d 0xfbfc) ;; hex values (print decimal 64508)
  (def e nil) ;; nil value
  (def f true) ;; boolean
  (def g "string") ;; string
  (def h 'hello) ;; keyword - symbol 

  (def status false)
  (def STATUS true)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h)
  (println status)
  (println STATUS)
  )

(DataTypes)