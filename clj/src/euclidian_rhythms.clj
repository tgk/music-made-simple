(ns euclidian-rhythms)

(defn fill-pattern
  [beats note]
  (cons note (repeat (dec beats) nil)))

(defn euclidian-pattern
  [beats n note]
  (let [segment (quot beats n)
        extras (rem beats n)]
    (flatten
     (concat
      (for [i (range extras)]
        (fill-pattern (inc segment) note))
      (for [i (range (- n extras))]
        (fill-pattern segment note))))))
