(defproject org.signaut/ring-jetty8-adapter "1.1.1"
  :description "Ring Jetty adapter."
  :url "https://github.com/ring-clojure/ring"
  :dependencies [[ring/ring-core "1.1.1"]
                 [ring/ring-servlet "1.1.1"]
                 [org.eclipse.jetty/jetty-server "8.1.4.v20120524"]]
  :dev-dependencies [[clj-http "0.3.2"]
                     [lein-clojars "0.9.0"]]
)
