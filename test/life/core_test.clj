(ns life.core-test
  (:require [clojure.test :refer :all]
            [life.core :refer :all]))

(deftest life-test
  (testing "a cell can come to life"
    (let [life (create)
          life' (bring-to-life life [0 0])]
      (is (alive? life' [0 0]))
      (is (not (alive? life' [0 1])))))
  
  (testing "a cell can die"
    (let [life (create)
          life' (bring-to-life life [0 0])
          life'' (kill life' [0 0])]
      (is (not (alive? life'' [0 0]))))))
