(ns tutorial.destructuring
  (:gen-class))

(defn testDestructuring
  "Destructuring in clojure"
  []
  (println "\nDestructuring")

  (def myVec [1 2 3 4 5])
  (let [[a b c] myVec] (println a b c))
  (let [[a b & rest] myVec] (println a b rest)) ;; returns 1 2 (3 4 5) - rest returns a list with remaining elements

  (def myMap {'name "Augusto" 'lastname "Scher" 'age 30})
  (let [{a 'name b 'lastname} myMap] (println a b))
  (let [{a 'name b 'lastname c 'test} myMap] (println a b c)) ;; with inexisting value
  )

(testDestructuring)