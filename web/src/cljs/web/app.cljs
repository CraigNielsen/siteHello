(ns web.app)

(defn init []
  (let [c (.. js/document (createElement "DIV"))]
    (aset c "innerHTML" "<p>I'm dynamically created by Craig to test deployment.
              this is quite something...</p>")
    (.. js/document (getElementById "container") (appendChild c))))
