logLevel := Level.Warn

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.2")
addSbtPlugin("org.lyranthe.sbt" % "partial-unification" % "1.1.2")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.18-1")
addSbtPlugin("name.de-vries" % "sbt-typescript" % "2.6.2")
