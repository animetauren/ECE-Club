(ns ececlub.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5 include-js javascript-tag link-to]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "NJIT ECE Club"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper content]]))
