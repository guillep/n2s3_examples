name := "My Project"
version := "1.0"
scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "fr.univ-lille.cristal" %% "n2s3" % "1.0" exclude("net.sf", "jaer_2.11"),
  "net.sf" %% "jaer" % "1.0" from "https://sourcesup.renater.fr/frs/download.php/file/5047/jaer.jar"
)