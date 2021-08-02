(ns tutorial.macros)

;; Code that will build code. They transform code into code.

(macroexpand-1 `(when true (println "hello")))
;; transformed in: (if true (do (clojure.core/println "hello")))

(macroexpand-1 `(when (= 2 2) (println "hello")))
;; transformed in: (if (= 2 2) (do (clojure.core/println "hello")))
