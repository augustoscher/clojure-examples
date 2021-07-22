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


(defn testWhileDo
  "WhileDo in clojure"
  [times]
  (println "\nWhileDo")
  (def i (atom 0)) ;; define i atom with zero. Atom is a variable that we can change de value of. (not immutable var)
  (while (< @i times) ;; while 0 < parameter
    (do
      (println @i)
      (swap! i inc))) 
)
(testWhileDo 12) ;; will print 0 to 11