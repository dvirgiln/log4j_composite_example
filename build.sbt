resolvers += Resolver.sonatypeRepo("releases")
resolvers += "Maven EAN" at "http://maven.ean/content/groups/public/"
resolvers += Resolver.mavenLocal
lazy val root = (project in file(".")).
  configs(IntegrationTest).
  settings(
    organization := "com.example",
    name := "example_log4j",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.0",
    libraryDependencies ++= Seq(
      "log4j"           % "log4j"          % "1.2.17",
      "log4j"           % "apache-log4j-extras"          % "1.2.17"
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-language:_"
    )

  )
