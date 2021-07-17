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
(defn printSet []
  (def s #{1 42 1.3 "Test" 'Symbol})
  (println "Set: " s))

(printSet)


;; MAP
;; Key value data structure
;; They're immutable
;; Efficient
(defn printMap []
  (def m {:Key1 10.000, :key2 "xunda"})
  (println "Map: " m))

(printMap)


;; VECTORS (ARRAYS)
;; Indexed by position
;; They're immutable
;; Efficient
(defn printVec []
  (def v [1 "two" 'three {:k1 "x" :k2 "y"}])
  (println "Vec: " v)
  (println "Vec 3pos: " (get v 3))
  )

(printVec)