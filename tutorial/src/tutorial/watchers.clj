(ns tutorial.watchers
  (:gen-class))

;; Watchers attach some function to a data type that will be trigger when value changes.

(defn testWatcher
  []
  (def x (atom 5)) ;; define atom called x
  (add-watch x :xWatcher
              (fn [key atom old-state new-state]
                (println "key: " key)
                (println "atom: "atom)
                (println "old-state: " old-state)
                (println "new-state: " new-state)
              )) ;; define watcher for atom x called xWatcher 
  (reset! x 10) ;; reset atom value to 10. That should trigger our watcher
  (remove-watch x :xWatcher) ;; remove watcher
  (reset! x 10) ;; This shouldnt trigger watcher anymore
)
(testWatcher)