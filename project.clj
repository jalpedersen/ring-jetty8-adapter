(defproject org.signaut/ring-jetty8-adapter "1.1.6"
            :description "Ring Jetty adapter."
            :url "https://github.com/ring-clojure/ring"
            :dependencies [[ring/ring-core "1.1.6" :exclusions [javax.servlet/servlet-api]]
                           [ring/ring-servlet "1.1.6" :exclusions [javax.servlet/servlet-api]]
                           [org.eclipse.jetty/jetty-server "8.1.8.v20121106"]]
            :profiles {:dev {:dependencies [[clj-http "0.3.2"]]}}
            :plugins [[lein-clojars "0.9.1"]])
