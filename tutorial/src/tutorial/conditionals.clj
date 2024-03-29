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


(defn testNestedIf
  "Nested if conditions in  clojure"
  []
  (println "\nNested IF Conditions")
  (if (and (= 5 5) (or (= 2 2) (not true)))
    (println "True")
    (println "False")
  ))
(testNestedIf)


(defn testCase
  "case in  clojure"
  [pet]
  (println "\nCase")
  (case pet
    "cat" (println "i have a cat")
    "dog" (println "i have a dog")
    "fish" (println "i have a fish")))
(testCase "cat")
(testCase "dog")
(testCase "fish")


(defn testCond
  "cond in  clojure"
  [amount]
  (println "\nCond")
  (cond
    (<= amount 2) (println "<= 2")
    (<= amount 10) (println "<= 10")
    (<= amount 100) (println "<= 100")
    :else (println "> 100")))
(testCond 101)
(testCond 100)
(testCond 10)
(testCond 2)
