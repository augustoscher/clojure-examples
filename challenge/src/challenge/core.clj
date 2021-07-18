(ns challenge.core
  (:gen-class))

(defn -main
  "Gives us the age of a pet in human years"
  [pet year]
  (def petYear {'DOG 7, 'CAT 5, 'FISH 10})
  (println pet "has" (* year (get petYear pet)) "in human years"))

;; ================================

(defn petAgeRation
  "returns the ratio of a pet in human years"
  [x]
  (def petStore {'dog 7, 'cat 5, 'fish 10})
  (get petStore x))

(defn age
  "This function returns the age of a pet"
  [petName petType petAge]
  (def ratio (petAgeRation petType))
  (println petName "is" (* ratio petAge) "years old in human years."))

(age "Fido" 'dog 4)
(age "Mutley" 'dog 1)
(age "Fred" 'cat 1)
(age "Nemo" 'fish 1)