(ns tutorial.bankTransactions
  (:gen-class))

;; CODE CHALLENGE
;; Bank with 2 accounts: Buyer and Merchant

;; Merchant has items to sale
;; Pen 1
;; Notebook 5
;; Backpack 90

;; Build a function to buy item
;; Receives the item
;; Check if the buyer have money
;; Stores the item in data structure

(def buyerAccount (ref 100))
(def merchantAccount (ref 0))
(def prices {'pen 1, 'notebook 5, 'backpack 90})
(def items (ref []))

(defn printInfo
  []
  (println "\nInfos:")
  (println "BuyerAccount: " @buyerAccount)
  (println "MerchantAccount: " @merchantAccount)
  (println "Items: " @items))

(defn buy
  [item]
  (def itemPrice (get prices item))
  (if (<= itemPrice @buyerAccount)
    (dosync
      (ref-set merchantAccount (+ @merchantAccount itemPrice))
      (ref-set buyerAccount (- @buyerAccount itemPrice))
      (def newItems (cons item @items))
      (ref-set items newItems)
    )
    (println "\nNot enough money in buyer account")
  )
  (printInfo)
  )

(buy 'pen)
(buy 'notebook)
(buy 'backpack)
(buy 'notebook)
(buy 'notebook)