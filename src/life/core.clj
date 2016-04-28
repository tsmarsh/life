(ns life.core)

(def DEFAULT_CELL {:energy 0})
(def DEFAULT_ENERGY 100)

(defn create [] {})

(defn bring-to-life
  [life coords]
  (let [cell (get life coords DEFAULT_CELL)]
    (assoc-in life [coords :energy] DEFAULT_ENERGY)))

(defn alive?
  [life coords]
  (let [cell (get life coords)]
    (if cell
      (> (:energy cell) 0)
      false)))

(defn kill
  [life coords]
  (dissoc life coords))
