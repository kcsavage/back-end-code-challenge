;; Problem 6
(def s (reduce + (range 101)))
(- (* s s) (reduce + (map #(* % %) (range 101))))
;; output 25164150