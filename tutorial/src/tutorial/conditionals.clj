(ns tutorial.conditionals
  (:gen-class))

(defn testIf
  "If conditional in clojure"
  []
  (println "\nIF")
  (if (= 5 7)
    (println "Equal")
    (println "Not Equal")
  ))
(testIf)


(defn testIfDo
  "IfDo conditional in clojure"
  []
  (println "\nIFDO")
  (if (= 5 3)
    (do (println "Equal - First statement")
        (println "Equal - Second statement"))
    (do (println "Not Equal - First statement")
        (println "Not Equal - Second statement"))
  ))
(testIfDo)