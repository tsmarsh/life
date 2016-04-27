(ns life.core-test
  (:require [clojure.test :refer :all]
            [life.core :refer :all]))

(deftest life
  (testing "a cell can come to life"
    (let [life (create)
          life' (bring-to-life life [0 0])]
      (is (is-alive? life' [0 0]))
      (is (not (is-alive? life' [0 1]))))))
