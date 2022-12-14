def p(flavour: Flavour): Project = {
  val id = s"st-material-ui-${flavour.id}"
  Project(id, file(id))
    .enablePlugins(ScalablyTypedConverterGenSourcePlugin)
    .settings(
      organization := "com.olvind.st-material-ui",
      name := s"st-material-ui-${flavour.id}",
      version := "0.1",
      scalaVersion := "3.2.1",
      /* javascript / typescript deps */
      Compile / npmDependencies ++= Seq(
        "@emotion/react" -> "11.10.5",
        "@emotion/styled" -> "11.10.5",
        "@mui/material" -> "5.11.0",
        "@mui/icons-material" -> "5.11.0",
        "@types/react" -> "18.0.26",
        "@types/react-dom" -> "18.0.9",
        "@types/stylis" -> "4.0.2",
        "react" -> "18.2.0",
        "react-dom" -> "18.2.0"
      ),
      // shade into another package
      stOutputPackage := "com.olvind.mui",
      stSourceGenMode := SourceGenMode.Manual(baseDirectory.value / s"src/main/scala-3"),
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
