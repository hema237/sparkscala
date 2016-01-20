name := "sparkscala9"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
              "org.apache.spark" %% "spark-core" % "1.6.0",
              "org.apache.spark" %% "spark-sql" % "1.6.0"
)
resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
