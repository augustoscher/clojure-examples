(ns tutorial.sequences
  (:gen-class))


(defn testSequences
  "Sequences in clojure"
  []
  (println "\nSequences")
  (def colors (seq ["blue" "green" "yellow" "red"])) ;; define seq with vector
  (println colors)
  
  ;; Appends element in the beginning of the structure
  (println (cons "yellow" colors)) ;; cons is used to append an element in a sequence. This will return a new sequence
  (println (cons colors "yellow")) ;; will transform yellow in a sequence and append colors sequence inside the created sequence.

  ;; Appends element in the way that make sense accordind data structure
  (println (conj colors "yellow")) ;; add element according the data structure. In sequence, element will be in first position
  (println (conj ["blue" "green"] "yellow")) ;; Vectors growth in the end, so the new element will be the last element.

  ;; Concat allow us to join sequences
  (println (concat colors (seq ["pink" "gray"])))

  ;; Distinct allow us to get uniq elements in a sequences
  (println (distinct (seq [1 2 3 1 2 3])))

  ;; reverse the order of elements in sequence
  (println (reverse (seq [1 2 3 4 5 6])))

  (println (first colors))
  (println (last colors))
  (println (rest colors)) ;; returns new sequence withou first element

  ;; return new sorted sequence
  (println (sort (seq [1 2 3 4 5 6 1 1 2])))

  )
(testSequences)
