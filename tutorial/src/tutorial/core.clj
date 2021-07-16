(ns tutorial.core ;; define namespace
  (:gen-class)) ;; generate java class so we can run in jvm

(defn -main ;; define function called main
  "I don't do a whole lot ... yet." ;; description, not executed. Just a way to say what function does
  [& args] ;; list of zero or more arguments
  (println "Hello, World!")) ;; calls (verb) function println with arg "Hello World!"

(defn -call
  "test call"
  [name]
  (println "My name is" name)
)

(defn -test
  "test"
  [x]
  (println "Hi" x)
  (-call "Augusto"))


(-test "xunda") ;; Hi xunda
