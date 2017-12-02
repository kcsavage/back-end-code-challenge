;; problem 1
(defn oddDivis [num] (
                       if (or
                            (integer? (/ num 3))
                            (integer? (/ num 5)))
                       num 0))
(reduce + (map oddDivis (range 1 1000)))
;; output: 233168