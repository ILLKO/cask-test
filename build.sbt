name := "cors"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "cask" % "0.1.9",
  "com.lihaoyi" %% "utest" % "0.6.3" % Test,
  "com.lihaoyi" %% "requests" % "0.1.5" % Test
)

testFrameworks += new TestFramework("utest.runner.Framework")

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)