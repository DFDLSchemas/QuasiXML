lazy val nom = "quasiXML"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.tresys",
      version      := "0.1.0-SNAPSHOT",
      scalaVersion := "2.12.6",
      crossPaths := false,
      testOptions += Tests.Argument(TestFrameworks.JUnit, "-v"),
      scmInfo := Some(
        ScmInfo(
        browseUrl = url("https://github.com/DFDLSchemas/" + nom),
        connection = "scm:git:https://github.com/DFDLSchemas/" + nom + ".git")
      ),
      homepage in ThisBuild := Some(url("https://github.com/DFDLSchemas/quasiXML"))
    )),
    name := nom,
    libraryDependencies := Seq(
      // 
      // Note: for Daffodil 2.2.0, this module is named daffodil-tdml.
      // For Daffodil 2.3.0+ (and latest.integration snapshots thereof) it is named
      // daffodil-tdml-processor.
      //
      "org.apache.daffodil" %% "daffodil-tdml-processor" % "latest.integration" % "test",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test"
    ))  
  //
  // Uncomment this line below to run against IBM DFDL.
  // You need to have IBM DFDL installed and the IBM DFDL Cross Tester
  //
  // Note: This requires a 2.3.0 release of daffodil. 
  // (See version of daffodil-tdml-processor above)
  // or a development snapshot (e.g., version "latest.integration")
  // 
  .settings(IBMDFDLCrossTesterPlugin.settings)

