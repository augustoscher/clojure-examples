(ns tutorial.references
  (:gen-class))

(defn testReferences
  []
  (println "\nReferences in clojure")
  (def amount (ref 100))
  (println @amount)

  ;; dosync do things in transaction. If any error occours, all transactions are undone
  (dosync (ref-set amount 110))
  (println @amount)

  (dosync (alter amount inc))
  (println @amount)
)
(testReferences)