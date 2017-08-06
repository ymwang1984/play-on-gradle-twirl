import play.twirl.sbt.Import.TwirlKeys

name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .settings(TwirlKeys.templateFormats += ("sh" -> "play.twirl.api.HtmlFormat"))
  .settings(TwirlKeys.templateImports ++= Seq("java.util.Random", "java.util.Map"))

scalaVersion := "2.11.11"

routesGenerator := InjectedRoutesGenerator

libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs
libraryDependencies += "commons-lang" % "commons-lang" % "2.6"
