val root = (project in file("."))
  .settings(
    name := "dfdl-quasixml",

    organization := "com.tresys",

    version := "0.1.0-SNAPSHOT"
  )
  .daffodilProject()
