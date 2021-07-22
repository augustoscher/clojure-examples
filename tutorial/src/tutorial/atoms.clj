(ns tutorial.atoms
  (:gen-class))

;; ATOMS is data type that we can change the values.
;; Like muttable variable
;; Thread safe!

(defn testAtoms
  "Atoms in clojure"
  []
  (println "\nAtoms")
  (def amount (atom 100)) ;;defining atom
  (println @amount)

  (swap! amount inc) ;;thread safe change atom value. swap allows us to apply function to change value
  (println @amount)

  (reset! amount 110) ;; replaces the value of amount. thread safe too.
  (println @amount)

  (compare-and-set! amount 110 120) ;; compares amount value, if is 110 changes to 120
  (println @amount)

  (compare-and-set! amount 110 150)
  (println @amount) ;;120
)
(testAtoms)
