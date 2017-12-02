(require '[clojure.string :as s])
(defn palindrome [n]
  (= (str n) (s/reverse (str n)))
)

(filter palindrome (map #(* 995 %) (range 999 99 -1)))