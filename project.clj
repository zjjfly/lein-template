(defproject clj-lein-template "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [junit/junit "4.13.2"]]
  :main ^:skip-aot com.github.zjjfly.core
  :plugins [[lein-cljfmt "0.8.2"]
            [lein-junit "1.1.9"]]
  :target-path "target/%s"
  :global-vars {*warn-on-reflection* true}
  :source-paths ["src/main/clj"]
  :java-source-paths ["src/main/java" "src/test/java"]
  :javac-options ["-target" "1.8" "-source" "1.8" "-encoding" "utf8" "-Xlint:-options"]
  :resource-paths ["src/main/resources"]
  :test-paths ["src/test/clj"]
  :junit ["src/test/java"]
  :profiles {:uberjar {:aot :all}}
  )
