addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.12.0")

// Yeah, sorry. this is a locally built snapshot of https://github.com/ScalablyTyped/Converter/tree/mui5-support.
// - If you just want to build the project you can comment out this and remove reference
// - If you want to regenerate code, `publishLocal` that branch of ST and update here
addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta40+17-6351f8df+20221217-0235-SNAPSHOT")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.11")
