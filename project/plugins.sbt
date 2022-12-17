addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.12.0")

resolvers += MavenRepository("sonatype-s01-snapshots", "https://s01.oss.sonatype.org/content/repositories/snapshots")
addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta40+19-8967ae38-SNAPSHOT")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.11")
