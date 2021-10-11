;; fizzbuzz without conditionals
;; Author: @augustoscher

;; Simple patten matching using a single map lookup
(defn fizzbuzz [x]
  (let [v [(= (mod x 3) 0) (= (mod x 5) 0)]]
    ({[true false] "fizz"
      [false true] "buzz"
      [true true] "fizzbuzz"
      [false false] x} v)))

(map fizzbuzz (range 1 101))
