(ns tutorial.types
  (:gen-class))

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
(#(println "\n"))
;; Composite Data Types
;; contains one or more data types

;; SET
;; Set of a differente type os values
;; They're immutable
;; Efficient and fast

(defn testingSet []
  (#{1 43 1.5 "Nice" 'Cat}))
