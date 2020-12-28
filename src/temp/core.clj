(ns temp.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -kata5
  
  [str1 str2]
  (def Isomorfica (atom true))
  
  (if (= (count str1) (count str2))
    (if (> (count str1) 0)
      (dotimes [i (count str1)]
        (if (not= (str/index-of str1 (.charAt str1 i)) (str/index-of str2 (.charAt str2 i)))
          (reset! Isomorfica false)
          )
        )
      (reset! Isomorfica false)
      )
    (reset! Isomorfica false)
    )  
  (= @Isomorfica true)
  )
