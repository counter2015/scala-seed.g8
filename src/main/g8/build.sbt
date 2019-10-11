import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"


lazy val root = (project in file(".")).
  settings(
    name := "scala-seed",
    assemblySettings,
    assemblyJarName in assembly := "scala-seed-example.jar",
    libraryDependencies ++= Seq(
      logback,
      scalaLogging,
      scalaTest,
      typesafeConfig
    ),
    scalacOptions ++= Seq(
      "-deprecation", // Emit warning and location for usages of deprecated APIs.
      "-encoding", "utf-8", // Specify character encoding used by source files.
      "-explaintypes", // Explain type errors in more detail.
      "-feature", // Emit warning and location for usages of features that should be imported explicitly.
    )
  )

lazy val assemblySettings = Seq(
  assemblyMergeStrategy in assembly := {
    case PathList("META-INF", xs@_*) => MergeStrategy.discard
    case PathList("org", "apache", "spark", xs@_*) => MergeStrategy.first
    case "application.conf" => MergeStrategy.concat
    case x =>
      val oldStrategy = (assemblyMergeStrategy in assembly).value
      oldStrategy(x)
  }
)

