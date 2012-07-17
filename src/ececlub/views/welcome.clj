(ns ececlub.views.welcome
  (:require [ececlub.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]
         [hiccup.page-helpers :only [include-css html5 link-to]]))

(defpage "/" []
         (common/layout
          (html
            [:head (include-css "/css/reset.css")]
              [:body 
              [:div#id "container_part_1"
              [:class "spacer_15"
               [:class "container_16"
                [:class "grid_4"
                 [:image "/img/logo.png"]]
                  [:class "grid_10"
                   [:ul#id "nav"
                    [:li [link-to "/about"]
                     ]
                     :li [link-to "/contact"]
                       ]
                        ]
                         ]
                          ]
                           ]
                            ]
          )))
(defpage "/about" []
         (html5
          (include-css "/css/reset.css")
          [:body
	   			[:h1
           [:center "About the ECE Club!!"]]
           ]))
(defpage "/contact" []
         (html5
          (include-css "/css/reset.css")
          [:body
          [:h1
           [:center "About the ECE Club!!"]]
           ]))