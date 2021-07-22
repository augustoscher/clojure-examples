(ns tutorial.loops
  (:gen-class))

(defn testLoop
  "loop in clojure"
  []
  (println "\nLOOP")
  (loop [value 0] ;; start a loop - assing 0 to value
    (when (< value 10) ;; loop stop condition
      (println value)
      (recur (inc value))) ;; return to loop statement with incremented value
  ))
(testLoop) ;; will print 0 to 9


(defn testDoTimes
  "DoTimes in clojure"
  []
  (println "\nDoTimes")
  (dotimes [times 10]
    (println times)))
(testDoTimes) ;; will print 0 to 9

