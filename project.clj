(defproject org.signaut/ring-jetty7-adapter "0.3.8.1"
  :description "Ring Jetty 7 adapter."
  :url "http://github.com/jalpedersen/ring-jetty7-adapter"
  :dependencies [[ring/ring-core "0.3.8"]
                 [ring/ring-servlet "0.3.8"]
                 [org.eclipse.jetty/jetty-server "7.4.1.v20110513"]]
  :dev-dependencies [[clj-http "0.1.3"]
                     [lein-clojars "0.6.0"]])
