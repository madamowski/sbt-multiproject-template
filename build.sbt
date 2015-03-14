name := "sbt-multiproject-template"

version := "1.0"

scalaVersion := "2.11.5"

lazy val root = project.in( file("."))
    .aggregate(lib1,proj1)
    //add dependsOn if you want to call both from root project
    //.dependsOn(lib1,proj1)

lazy val lib1 = project.in(file("lib1"))

lazy val proj1 = project.in(file("proj1")).dependsOn(lib1)
    