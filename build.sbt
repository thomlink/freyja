ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion     := scala3Version

ThisBuild / Compile / run / fork := true

val Http4sVersion               = "0.23.12"
val CirceVersion                = "0.14.2"
val CirisConfig                 = "2.4.0"
val LogbackVersion              = "1.3.1"
val EnumeratumVersion           = "1.7.0"
val ScalatestVersion            = "3.2.12"
val BuckyVersion                = "3.1.0"
val scalaPactVersion            = "4.4.0"
val awsSDKVersion               = "1.12.239"
val studiosCommonLibraryVersion = "1.0.94"
val natchezHttp4sVersion        = "0.1.3"
val TapirVersion                = "1.0.1"

lazy val root = (project in file("."))
  .settings(
    name := "freyja",
    idePackagePrefix := Some("com.tl")
  )
