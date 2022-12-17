val common: Project => Project = _.enablePlugins(ScalaJSPlugin)
  .settings(
    organization := "com.olvind.st-material-ui",
    scalaVersion := "3.2.1",
    homepage := Some(new URL("https://github.com/oyvindberg/st-material-ui")),
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
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    /* disabled because it somehow triggers many warnings */
    scalaJSLinkerConfig ~= (_.withSourceMap(false)),
    /* disable scaladoc */
    Compile / doc / sources := Nil
  )

val setupST: Project => Project = _.enablePlugins(ScalablyTypedConverterGenSourcePlugin).settings(
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
  stMinimize := Selection.AllExcept("@mui/material"),
  stReactEnableTreeShaking := Selection.All,
  // because npm is slow
  useYarn := true
)

lazy val `st-material-ui-scalajs-react`: Project = project
  .configure(common, setupST)
  .settings(
    stFlavour := Flavour.ScalajsReact,
    ScalablyTypedConverterGenSourcePlugin.autoImport.stImport := {
      val old  = ScalablyTypedConverterGenSourcePlugin.autoImport.stImport.value
      val from = (baseDirectory.value / s"src/main/scala-3" / "com.olvind.mui/muiIconsMaterial").toPath
      val to =
        ((ThisBuild / baseDirectory).value / s"st-material-ui-icons-scalajs-react/src/main/scala-3" / "com.olvind.mui/muiIconsMaterial").toPath

      if (java.nio.file.Files.exists(from)) {
        def deleteDirectory(directoryToBeDeleted: File): Unit = {
          val allContents = directoryToBeDeleted.listFiles
          if (allContents != null)
            for (file <- allContents)
              deleteDirectory(file)
          directoryToBeDeleted.delete
        }

        if (java.nio.file.Files.exists(to)) {
          deleteDirectory(to.toFile)
        } else {
          java.nio.file.Files.createDirectories(to.getParent)
        }

        java.nio.file.Files.move(from, to)
      }

      old
    }
  )

lazy val `st-material-ui-icons-scalajs-react`: Project = project
  .configure(common)
  .dependsOn(`st-material-ui-scalajs-react`)

lazy val `st-material-ui-slinky`: Project = project
  .configure(common, setupST)
  .settings(
    stFlavour := Flavour.Slinky,
    ScalablyTypedConverterGenSourcePlugin.autoImport.stImport := {
      val old  = ScalablyTypedConverterGenSourcePlugin.autoImport.stImport.value
      val from = (baseDirectory.value / s"src/main/scala-3" / "com.olvind.mui/muiIconsMaterial").toPath
      val to =
        ((ThisBuild / baseDirectory).value / s"st-material-ui-icons-slinky/src/main/scala-3" / "com.olvind.mui/muiIconsMaterial").toPath

      if (java.nio.file.Files.exists(from)) {
        def deleteDirectory(directoryToBeDeleted: File): Unit = {
          val allContents = directoryToBeDeleted.listFiles
          if (allContents != null)
            for (file <- allContents)
              deleteDirectory(file)
          directoryToBeDeleted.delete
        }

        if (java.nio.file.Files.exists(to)) {
          deleteDirectory(to.toFile)
        } else {
          java.nio.file.Files.createDirectories(to.getParent)
        }

        java.nio.file.Files.move(from, to)
      }
      old
    }
  )

lazy val `st-material-ui-icons-slinky`: Project = project
  .configure(common)
  .dependsOn(`st-material-ui-slinky`)
