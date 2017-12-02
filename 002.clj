;; problem 2
(def fib (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))
(reduce + (filter even? (filter (fn [x](< x 4000000)) fib)))
;; output: 4613732