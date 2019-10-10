import sbt._

object Dependencies {
  // Versions
  val logbackVersion                    =             "1.2.3"
  val scalaLoggingVersion               =             "3.9.2"
  val scalaTestVesrion                  =             "3.0.8"

  // Libraries
  val logback              = "ch.qos.logback"             %  "logback-classic"         % logbackVersion
  val scalaLogging         = "com.typesafe.scala-logging" %% "scala-logging"           % scalaLoggingVersion
  val scalaTest            = "org.scalatest"              %% "scalatest"               % scalaTestVesrion         % Test
}