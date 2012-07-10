(ns ececlub.views.welcome
  (:require [ececlub.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/ececlub" []
         (common/layout
           [:p "Welcome to ececlub"]))
(defpage "/ececlub/about" []
         (html
	   [:h1
            [:center "About the ECE Club!"]]))
