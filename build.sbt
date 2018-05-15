name := "uPickle"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "com.lihaoyi" %% "upickle" % "0.6.5"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.9"

libraryDependencies += "io.argonaut" %% "argonaut" % "6.2"

val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)