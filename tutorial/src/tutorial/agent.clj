(ns tutorial.agent
  (:gen-class))

;; Agents are like atoms, but in async mode
;; Its possible to update the value in asynchronous mode

(defn testAgent
  []
  (println "\nAgents in clojure")
  
  (def amount (agent 1000))
  (println @amount)
  
  (send amount inc) ;; send inc function to amount agent
  (println @amount) ;; @amount still 1000 because agent is async
  (println "some time must pass")
  (println @amount) ;; now @amount is 1001 because time passed

  ;; await for agent work
  (println "\nawait-for ")
  (send amount inc)
  (await-for 1000 amount) ;; await for 1s, but if value is updated before 1s it'll continue execution
   (println @amount) ;; @amount is 1002

  (println (agent-error amount)) ;; how we can get error when more thread tries to update the agent
)

(testAgent)