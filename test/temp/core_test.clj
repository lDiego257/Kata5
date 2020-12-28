(ns temp.core-test
  (:require [clojure.test :refer :all]
            [temp.core :refer :all]))

(deftest a-test
  (testing "Escenario 311"
    (is (= (-kata5 "abcd" "ab") false)))
  
   (testing "Escenario 321 cadenas vacias = false"
    (is (= (-kata5 "" "") false)))
  
     (testing "Escenario 331 gato wxyz = true"
    (is (= (-kata5 "wxyz" "gato") true)))
  
  )
