import sbt._

object Dependencies {
  // Versions
  val logbackVersion                    =             "1.2.3"
  val scalaLoggingVersion               =             "3.9.2"
  val scalaTestVesrion                  =             "3.0.8"
  val typesafeConfigVersion             =             "1.3.4"

  // Libraries
  val logback              = "ch.qos.logback"             %  "logback-classic"         % logbackVersion
  val scalaLogging         = "com.typesafe.scala-logging" %% "scala-logging"           % scalaLoggingVersion
  val scalaTest            = "org.scalatest"              %% "scalatest"               % scalaTestVesrion         % Test
  val typesafeConfig       = "com.typesafe"               % "config"                   % typesafeConfigVersion

}