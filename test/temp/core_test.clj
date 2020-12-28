(ns temp.core-test
  (:require [clojure.test :refer :all]
            [temp.core :refer :all]))

(deftest a-test
  (testing "Escenario 311"
    (is (= (-kata5 "abcd" "ab") false)))
  
  
  )
