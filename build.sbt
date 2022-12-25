import ScalablyTypedConverterGenSourcePlugin.autoImport.stImport

val common: Project => Project = p =>
  p.enablePlugins(ScalaJSPlugin)
    .settings(
      organization := "com.olvind.st-material-ui",
      scalaVersion := "3.2.1",
      homepage := Some(new URL("https://github.com/oyvindberg/st-material-ui")),
      startYear := Some(2022),
      developers := List(
        Developer(
          "oyvindberg",
          "Øyvind Raddum Berg",
          "elacin@gmail.com",
          url("https://github.com/oyvindberg")
        )
      ),
      sonatypeProfileName := "com.olvind",
      licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
      scalacOptions ++= {
        val isDotty = scalaVersion.value startsWith "3"
        val ver     = version.value
        if (isSnapshot.value) Nil
        else {
          val a    = p.base.toURI.toString.replaceFirst("[^/]+/?$", "")
          val g    = s"https://raw.githubusercontent.com/oyvindberg/st-material-ui"
          val flag = if (isDotty) "-scalajs-mapSourceURI" else "-P:scalajs:mapSourceURI"
          s"$flag:$a->$g/v$ver/" :: Nil
        }
      },
      /* disable scaladoc */
      Compile / doc / sources := Nil
    )

def setupST(iconsMaterialDir: File, joyDir: File): Project => Project =
  _.enablePlugins(ScalablyTypedConverterGenSourcePlugin).settings(
    /* javascript / typescript deps */
    Compile / npmDependencies ++= Seq(
      "@emotion/react" -> "11.10.5",
      "@emotion/styled" -> "11.10.5",
      "@mui/material" -> "5.11.1",
      "@mui/icons-material" -> "5.11.0",
      "@mui/joy" -> "5.0.0-alpha.59",
      "@types/react" -> "18.0.26",
      "@types/react-dom" -> "18.0.9",
      "react" -> "18.2.0",
      "react-dom" -> "18.2.0"
    ),
    // shade into another package
    stOutputPackage := "com.olvind.mui",
    stSourceGenMode := SourceGenMode.Manual(
      baseDirectory.value / s"src/main/scala-3",
      Map(
        "@mui/icons-material" -> iconsMaterialDir,
        "@mui/joy" -> joyDir
      )
    ),
    // focus only on these libraries
    stMinimize := Selection.AllExcept("@mui/joy", "@mui/material", "@mui/material-next"),
    stReactEnableTreeShaking := Selection.All,
    // because npm is slow
    useYarn := true
  )

lazy val `st-material-ui-scalajs-react`: Project = project
  .configure(
    common,
    setupST(
      iconsMaterialDir = file("st-material-ui-icons-scalajs-react/src/main/scala-3").getAbsoluteFile,
      joyDir = file("st-joy-scalajs-react/src/main/scala-3").getAbsoluteFile
    )
  )
  .settings(
    stFlavour := Flavour.ScalajsReact,
    // seriously, let's keep it easy. the built-in hooks are a mouthful
    stMinimizeKeep := List(
      "useCallback",
      "useContext",
      "useDebugValue",
      "useDeferredValue",
      "useEffect",
      "useId",
      "useImperativeHandle",
      "useInsertionEffect",
      "useLayoutEffect",
      "useMemo",
      "useReducer",
      "useRef",
      "useState",
      "useSyncExternalStore",
      "useTransition"
    ).map("react.mod." + _)
  )

lazy val `st-material-ui-icons-scalajs-react`: Project = project
  .configure(common)
  .dependsOn(`st-material-ui-scalajs-react`)

lazy val `st-joy-scalajs-react`: Project = project
  .configure(common)
  .dependsOn(`st-material-ui-scalajs-react`)

lazy val `st-material-ui-slinky`: Project = project
  .configure(
    common,
    setupST(
      iconsMaterialDir = file("st-material-ui-icons-slinky/src/main/scala-3").getAbsoluteFile,
      joyDir = file("st-joy-slinky/src/main/scala-3").getAbsoluteFile
    )
  )
  .settings(
    stFlavour := Flavour.Slinky
  )

lazy val `st-material-ui-icons-slinky`: Project = project
  .configure(common)
  .dependsOn(`st-material-ui-slinky`)

lazy val `st-joy-slinky`: Project = project
  .configure(common)
  .dependsOn(`st-material-ui-slinky`)

lazy val root = project
  .configure(common)
  .in(file("."))
  .settings(
    name := "st-material-ui-root",
    publish / skip := true
  )
  .aggregate(
    `st-material-ui-slinky`,
    `st-material-ui-icons-slinky`,
    `st-joy-scalajs-react`,
    `st-material-ui-scalajs-react`,
    `st-material-ui-icons-scalajs-react`,
    `st-joy-scalajs-react`
  )
