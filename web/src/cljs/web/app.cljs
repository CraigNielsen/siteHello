(ns web.app)

(defn init []
  (let [c (.. js/document (createElement "DIV"))]
    (aset c "innerHTML" "<p>i'm dynamically created by craig</p>")
    (.. js/document (getElementById "container") (appendChild c))))
