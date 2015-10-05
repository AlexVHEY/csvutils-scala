name := "csvutils-scala"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += Resolver.bintrayRepo("pathikrit", "maven")

libraryDependencies ++= Seq(
  "com.github.pathikrit" %% "better-files" % "2.9.0",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"
)

scalacOptions in ThisBuild ++= Seq(
  "-target:jvm-1.8",
  "-encoding", "UTF-8",
  "-deprecation", // warning and location for usages of deprecated APIs
  "-feature", // warning and location for usages of features that should be imported explicitly
  "-unchecked", // additional warnings where generated code depends on assumptions
  //  "-Xlint", // recommended additional warnings
  "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver
  "-Ywarn-inaccessible",
  "-Ywarn-dead-code",
  "-Xfatal-warnings",
  "-language:reflectiveCalls",
  "-language:experimental.macros"
)