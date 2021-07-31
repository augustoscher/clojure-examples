(ns tutorial.exceptions
  (:gen-class))

(defn testExceptions
  "Exceptions in clojure"
  [value]
  (println "\nExceptions")
  (try
    (inc value)
    (catch ClassCastException e (println "Got error: " (.getMessage e)))
    (catch Exception e (println "Got generic errror: " (.getMessage e)))
    (finally (println "finally"))
  )
  )

(testExceptions "test")