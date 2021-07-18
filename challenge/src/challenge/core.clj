(ns challenge.core
  (:gen-class))

(defn -main
  "Gives us the age of a pet in human years"
  [pet year]
  (def petYear {'DOG 7, 'CAT 5, 'FISH 10})
  (println pet "has" (* year (get petYear pet)) "in human years"))
