(defn just [freq]
  {:0 freq
   :1 (* freq (/ 25.0 24.0))
   :2 (* freq (/ 9.0 8.0))
   :3 (* freq (/ 6.0 5.0))
   :4 (* freq (/ 4.0 3.0))
   :5 (* freq (/ 45.0 32.0))
   :6 (* freq (/ 3.0 2.0))
   :7 (* freq (/ 8.0 5.0))
   :8 (* freq (/ 5.0 3.0))
   :9 (* freq (/ 9.0 5.0))
   :10 (* freq (/ 15.0 8.0))
   :11 (* freq (/ 2.0 1.0))
   }
  )


(println (just 440.0) )



(defn equaltemp
  ([]
    (equaltemp [440.0 {}]))
  ([a acc]
    (if (< a 20000.0)
      (conj acc a)
      (equaltemp
        (* a (** 2.0 (/ 1.0 12.0)
        acc))))))
