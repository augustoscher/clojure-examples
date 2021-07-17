(ns tutorial.operators
  (:gen-class))

(defn -main
  "operators function"
  []
  (println "All Operators:")
  (println "Arithmetic Operators")
  (println "Relational Operators")
  (println "Logical Operators")
  (println "Bitwise Operators"))

;; ARITHMETIC
(#(println "Sum" %1) (+ 1 2))
(#(println "Sub" %1) (- 5 3))
(#(println "Mult" %1) (* 3 6))
(#(println "Div" %) (/ 3 2))

;;(#(println "INC" %) (INC 6))
;;(#(println "DEC" %) (DEC 6))
;;(#(println "MAX" %) (MAX 3 6))
;;(#(println "MIN" %) (MIN 3 6))
;;(#(println "REM" %) (REM 6 3)) ;; remaining value when divide the first with de second

;; RELATIONAL
(defn -relational
  "relational operators"
  []
  (= 2 2)
  (< 3 6)
  (> 6 3)
  (<= 6 3)
  ;;(NOT= 2 2)
  )

  ;; LOGICAL
(defn -logical
  "logical operators"
  []
  (AND true false) ;; false
  (OR true false) ;; true
  (NOT true)) ;; false

  ;; BITWISE
(defn -bitwise
  "logical operators"
  []
  (BIT-AND 0101 1100) ;; 0100
  (BIT-OR 0101 1100) ;; true
  (BIT-XOR 0101 1100)
  (BIT-NOT 0101 1100))
  