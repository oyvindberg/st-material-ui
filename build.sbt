def p(flavour: Flavour): Project = {
  val id = s"st-material-ui-${flavour.id}"
  Project(id, file(id))
    .enablePlugins(ScalablyTypedConverterGenSourcePlugin)
    .settings(
      organization := "com.olvind.st-material-ui",
      name := s"st-material-ui-${flavour.id}",
      version := "0.1",
//      crossScalaVersions := List("2.13.7", "3.1.0"),
      scalaVersion := "3.1.0",
      /* javascript / typescript deps */
      Compile / npmDependencies ++= Seq(
        "@emotion/react" -> "11.7.1",
        "@emotion/styled" -> "11.6.0",
        "@mui/material" -> "5.2.6",
        "@mui/icons-material" -> "5.2.5",
        "@types/react" -> "17.0.38",
        "@types/react-dom" -> "17.0.11",
        "@types/stylis" -> "4.0.2",
        "react" -> "17.0.2",
        "react-dom" -> "17.0.2",
      ),
      // shade into another package
      stOutputPackage := "com.olvind.mui",
      stSourceGenMode := SourceGenMode.Manual(baseDirectory.value / s"src/main/scala-${scalaVersion.value.takeWhile(_ != '.')}"),
      // focus only on these libraries
      stMinimize := Selection.AllExcept("@mui/material", "@mui/icons-material"),
      /* disabled because it somehow triggers many warnings */
      scalaJSLinkerConfig ~= (_.withSourceMap(false)),
      // because npm is slow
      useYarn := true,
      // say we want custom code for slinky
      stFlavour := flavour,
      homepage := Some(new URL("https://github.com/ScalablyTyped/st-material-ui")),
      startYear := Some(2022),
      pomExtra := (
        <scm>
    <connection>scm:git:github.com:/ScalablyTyped/st-material-ui</connection>
    <developerConnection>scm:git:git@github.com:ScalablyTyped/st-material-ui.git</developerConnection>
    <url>github.com:ScalablyTyped/st-material-ui.git</url>
  </scm>
    <developers>
      <developer>
        <id>oyvindberg</id>
        <name>Øyvind Raddum Berg</name>
      </developer>
    </developers>
      ),
      licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
    )
}

lazy val muiSlinky       = p(Flavour.ScalajsReact)
lazy val muiScalaJsReact = p(Flavour.Slinky)
