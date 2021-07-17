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

(#(println "Sum" %1) (+ 1 2))
(#(println "Sub" %1) (- 5 3))
(#(println "Mult" %1) (* 3 6))
(#(println "Div" %) (/ 3 2))

(#(println "INC" %) (INC 6))
(#(println "DEC" %) (DEC 6))
(#(println "MAX" %) (MAX 3 6))
(#(println "MIN" %) (MIN 3 6))
(#(println "REM" %) (REM 6 3)) ;; remaining value when divide the first with de second
