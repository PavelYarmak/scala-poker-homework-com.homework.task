name := "scala-poker-homework-com.homework.task"

version := "0.1"

scalaVersion := "2.13.6"

logBuffered in Test := false

logLevel := util.Level.Error

mainClass in (Compile, run) := Some("com.homework.com.homework.task.ConsolePokerRunner")

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-Ymacro-annotations",
  "-Xfatal-warnings",
  "-Xsource:3"
)

ThisBuild / scalafmtOnCompile := true

val catsScalacheckVersion   = "0.2.0"
val scalaTestVersion        = "3.1.0.0-RC2"

libraryDependencies ++= Seq(
  "io.chrisdavenport"        %% "cats-scalacheck"               % catsScalacheckVersion % Test,
  "org.scalatestplus"        %% "scalatestplus-scalacheck"      % scalaTestVersion      % Test,
  "org.scalatestplus"        %% "selenium-2-45"                 % scalaTestVersion      % Test,
)

addCompilerPlugin(
  "org.typelevel" %% "kind-projector" % "0.13.0" cross CrossVersion.full
)