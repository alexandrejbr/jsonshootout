name := "jsonshootout"

organization := "com.despegar"

scalaVersion := "2.10.4"

scalacOptions += "-deprecation"

resolvers += "spray" at "http://repo.spray.io/"

resolvers += "Mandubian repository snapshots" at "https://github.com/mandubian/mandubian-mvn/raw/master/snapshots/"

fork in run := true

libraryDependencies += "io.spray" %%  "spray-json" % "1.2.6"

libraryDependencies += "net.liftweb" % "lift-json-ext_2.10" % "2.5.1"

libraryDependencies += "play" %% "play-json" % "2.2-SNAPSHOT"

libraryDependencies += "org.json4s" %% "json4s-native" % "3.2.9"

libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.2.9"

