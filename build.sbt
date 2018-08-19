val scalaTestDep = "org.scalatest" %% "scalatest" % "3.0.5" % "test"
val scalacticDep = "org.scalactic" %% "scalactic" % "3.0.5"

lazy val commonSettings = Seq(
  organization := "shemer.dynamicpubsub",
  scalaVersion := "2.12.3",
  version := "0.1-SNAPSHOT"
)
lazy val root  = (project in file("."))
  .settings(
    name := "A1",
    commonSettings,
    libraryDependencies += scalaTestDep,
    libraryDependencies += scalacticDep
  )