(ns tutorial.structMaps
  (:gen-class))

(defn testStructMaps
  "StructMaps in clojure"
  []
  (println "\nStructMaps")
  (defstruct pet :PetType :PetName) ;; define the information that we want for out pet
  (def myPet (struct pet "dog" "Marley")) ;; define struct myPet
  (println myPet)

  (def myPet2 (struct-map pet :PetName "Fred" :PetType "cat"))
  (println myPet2)

  (println (:PetName myPet))
  (println (:PetName myPet2))

  ;; structs or struct maps are immutable

  (def myNewPet (assoc myPet :PetName "Max")) ;; define new struct based on existing one
  (println myNewPet)
  (println myPet)

  (def myNewPet2 (assoc myNewPet :PetAge 10)) ;; define new attribute for struct
  (println myNewPet2)
  )

(testStructMaps)