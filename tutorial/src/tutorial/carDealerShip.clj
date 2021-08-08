(ns tutorial.carDealerShip
  (:gen-class))

;; CODE CHALLENGE
;; 3 types of cars: bmw 60000, ferrari 100000, fiat 20000
;; cupom code with 20%

;; Return all cars that are in clients budget considering cupom code

(defn isCodeValid
  [code]
  (defstruct coupon :Name :Discount) ;; struct definition
  (def validCoupon (struct coupon "20%" 0.8)) ;; create struct object using definition
  (if (= (:Name validCoupon) code)
    true
    false
  ))

(defn getCarPrices
  [budget code]
  (def cars {"bmw" 60000, "ferrari" 100000, "fiat" 20000})
  (if (isCodeValid code)
    (do
      (println "The coupon code is valid")
      (def discount (:Discount validCoupon))
      (doseq [car cars]
        (def carType (first car))
        (def price (last car))
        (def priceDiscount (* price discount))
        (if (<= priceDiscount budget)
          (println "the car" carType "costs" priceDiscount)
        )
      )
    )

    (do
      (println "The coupon code is invalid")
      (doseq [car cars]
        (def carType (first car))
        (def price (last car))
        (if (<= price budget)
          (println "the car" carType "costs" priceDiscount)
        )
      )
    )
  )
  (println))

(getCarPrices 50000 "20%")
(getCarPrices 50000 "20asdad")