(ns ececlub.views.welcome
  (:require [ececlub.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]
         [hiccup.page-helpers :only [include-css html5 link-to]]))

(defpage "/" []
         (common/layout
          (html
               [:h1
                [:center "Welcome to ECE Club"]]
                [:h2 (link-to "/about" "link")]
                 )))
(defpage "/about" []
         (html5
          (include-css "/css/reset.css")
          [:body
	   			[:h1
           [:center "About the ECE Club!!"]]
           ]))
