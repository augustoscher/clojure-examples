# clojure-examples

Clojure hacking, courses and code examples

1. Compiler

- Compiled language;
- Compiler -> JVM Code (generate .class files)
- One pass compiler (functions needs to be defined before they're called)

2. Code

- Everything is a list: (verb param1 param2)
- Everything has a return value. There's not return word. The value is returned on the end of operations
- There's no break operation
- Chaining operations: An operation can be the entry parameter of an other operation

This prints "Alice has 5 apples and returns nil:

```clojure
(println "Alice has" (+ 2 3) "apples")
```

3. What are we doing here:

```clojure
(ns tutorial.core ;; define namespace
  (:gen-class)) ;; generate java class so we can run in jvm

(defn -main ;; define function called main
  "I don't do a whole lot ... yet." ;; description, not executed. Just a way to say what function does
  [& args] ;; list of zero or more arguments
  (println "Hello, World!")) ;; calls (verb) function println with arg "Hello World!"
```

With param

```clojure
(defn -test
  "test"
  [x]
  (println "Hi" x))

(-test "xunda")

;; output: Hi xunda
```

## Requirements

- OpenJDK 11
- Leiningen

## Generating Clojure Project

1. Generating project with Leiningen:

```bash
lein new app tutorial
```

2. Enter in generated folder

```bash
cd tutoral
```

### Running

Running app from terminal

```bash
lein run
```

### REPL

#### 1. Run REPL

```bash
lein repl
```

#### 2. Executing function

```bash
(-main)
```

####  3. Running commands:

```bash
(println "Hello World!")

(+ 2 3)
```

####  4. Running project files in REPL

Enter on project directory
```bash
cd tutorial
```

Run REPL
```bash
lein repl
```

Call main function
```clojure
(-main)
```

#### 5. Calling functions from another file

Load other file on REPL
```clojure
(load-file "src/tutorial/functions.clj")
```

Change the namespace in REPL:
```clojure
(in-ns 'tutorial.functions)
```

Call main function from `tutorial/functions.clj`
```clojure
(-main)
```

