name := "SML_Scala"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies <++= (scalaVersion)(sv =>
  Seq(
    "org.scala-lang" % "scala-reflect" % "2.12.2"
  )
)
    