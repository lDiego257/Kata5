(ns temp.core
  (:gen-class))

(defn -kata5
  "I don't do a whole lot ... yet."
  [str1 str2]
  (def Isomorfica (atom false))
  
  (if (= (count str1) (count str2))
    (if (> (count str1) 0)
      (reset! Isomorfica true)
      (reset! Isomorfica false)
      )
    (reset! Isomorfica false)
    )
  
  
  (= @Isomorfica true)
  )
