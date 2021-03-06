scalaVersion := "2.13.1"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "Common Typeclasses Exercises"
  )

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.3" cross CrossVersion.full)

libraryDependencies += "org.typelevel" %% "cats-core" % "2.1.1"
libraryDependencies += "org.typelevel" %% "cats-laws" % "2.1.1"
libraryDependencies += "org.typelevel" %% "discipline-core" % "1.0.0" % Test
libraryDependencies += "org.typelevel" %% "discipline-scalatest" % "2.1.1" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2"
libraryDependencies += "org.typelevel" %% "cats-effect" % "2.3.3"
