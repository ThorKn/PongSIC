val spinalVersion = "1.6.0"

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      scalaVersion := "2.13.3",
      version      := "0.1"
    )),
    libraryDependencies ++= Seq(
      "com.github.spinalhdl" % "spinalhdl-core_2.13" % spinalVersion,
      "com.github.spinalhdl" % "spinalhdl-lib_2.13"  % spinalVersion,
      compilerPlugin("com.github.spinalhdl" % "spinalhdl-idsl-plugin_2.13" % spinalVersion)
    ),
    name := "PongSIC",
  )

fork := true

