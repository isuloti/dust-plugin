import sbt.Defaults._

// Comment to get more information during initialization
logLevel := Level.Warn

sbtPlugin := true

name := "play-dust-plugins"

version := "1.4"

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "commons-io" % "commons-io" % "2.2"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.0.2")