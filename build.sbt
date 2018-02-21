scalaVersion in ThisBuild := "2.11.8"

organization := "com.tresys"

name := "quasiXML"

version := "0.0.1"

crossPaths := false

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

// This resolver needed for Daffodil 2.0.0, but can be deleted for Daffodil 2.1.0
resolvers in ThisBuild += "NCSA Sonatype Releases" at "https://opensource.ncsa.illinois.edu/nexus/content/repositories/releases"

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "edu.illinois.ncsa" %% "daffodil-tdml" % "2.0.0" % "test"
)

// Change the edu.illinois line above to this for Daffodil 2.1.0
// "org.apache.daffodil" %% "daffodil-tdml" % "2.1.0" % "test"

retrieveManaged := true

exportJars in ThisBuild := true

exportJars in Test in ThisBuild := true

publishArtifact in Test := true

