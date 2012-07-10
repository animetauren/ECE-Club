(ns ececlub.views.welcome
  (:require [ececlub.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
         (common/layout
          (html
           [:h1
            [:center "Welcome to ECE Club"]])))
(defpage "/about" []
         (html
	   			[:h1
           [:center "About the ECE Club!!"]]))
