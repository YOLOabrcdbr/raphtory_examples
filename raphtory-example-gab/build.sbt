name := "example-gab"

version := "0.1"

ThisBuild / organization := "com.raphtory.examples"
ThisBuild / scalaVersion := "2.12.4"

lazy val root = (project in file(".")).
  settings(
    name := "example-gab"
  )

// SBT already finds jars jars present in the "lib" directory. However it is always best to express unmanaged dependencies explicitly.
// It eliminates scope of any assumptions and documents the dependencies right here in the "build.sbt" file.
Compile / unmanagedJars += baseDirectory.value / "lib/raphtory.jar"