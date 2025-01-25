(defproject com.github.zjjfly/lein-template "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://www.github.com/zjjfly/lein-template"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [junit/junit "4.13.2"]]
  :main ^:skip-aot template.core
  :plugins [[lein-cljfmt "0.9.2"]
            [lein-junit "1.1.9"]]
  ;compile some namespaces ahead of time
  ;:aot [template.core]
  ;compile some clojure namespace before compiling java
  ;:prep-tasks [["compile" "xxx.yyy.zzz"]
  ;             "javac" "compile"]
  :target-path "target/%s"
  :global-vars {*warn-on-reflection* true}
  :source-paths ["src/clj"]
  :java-source-paths ["src/java" "test/java"]
  :javac-options ["-target" "21" "-source" "21" "-encoding" "utf8" "-Xlint:-options"]
  :resource-paths ["resources"]
  :test-paths ["test/clj"]
  :junit ["test/java"]
  :profiles {:uberjar {:aot [template.core]}}
  )
