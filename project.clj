(defproject painful-clojurescript-compilation "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1934"]]
  :profiles {:dev {:plugins [[lein-cljsbuild "0.3.4"]]
                   :cljsbuild {:builds [{:source-paths ["src"]
                                         :compiler {:output-to     "painful-clojurescript-compilation-whitespace.js"
                                                    :optimizations :whitespace}}
                                        {:source-paths ["src"]
                                         :compiler {:output-to     "painful-clojurescript-compilation-simple.js"
                                                    :optimizations :simple}}
                                        {:source-paths ["src"]
                                         :compiler {:output-to     "painful-clojurescript-compilation-advanced.js"
                                                    :optimizations :advanced}}]}}})
