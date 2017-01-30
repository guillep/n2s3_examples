name := "My Project"
version := "1.0"
scalaVersion := "2.11.6"

libraryDependencies ++= {
  val scalaXmlV = "1.0.2"
  val akkaV = "2.3.7"
  val scalatestV = "2.2.1"
  Seq(
    "org.scala-lang.modules" %% "scala-xml" % scalaXmlV,
    "com.typesafe.akka" %% "akka-actor"      % akkaV,
    "com.typesafe.akka" %% "akka-testkit"    % akkaV,
    "com.typesafe.akka" %% "akka-cluster"    % akkaV,
    "org.scalatest"     %% "scalatest"       % scalatestV % "test",
    "com.squants"  %% "squants"  % "0.5.3",
    "com.storm-enroute" %% "scalameter" % "0.7",
    "com.xeiam.xchart" % "xchart" % "2.5.0" exclude("de.erichseifert.vectorgraphics2d", "VectorGraphics2D"),
    "net.sf" %% "jaer" % "1.0" from "https://sourcesup.renater.fr/frs/download.php/file/5047/jaer.jar"
  )
}

unmanagedJars in Compile += file("../lib/n2s3_2.11-1.0.jar")