name := "MxAnalytics"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.1.0" % "provided"   ,
  "org.apache.spark" % "spark-sql_2.11" % "2.1.0"  % "provided"   ,
  "com.github.seratch" %% "awscala" % "0.5.9",
  "com.typesafe" % "config" % "1.3.1",
  "com.typesafe.play" % "play-json_2.11" % "2.4.10",
  "org.scalatest" % "scalatest_2.11" % "3.0.1",
  "com.databricks" % "spark-redshift_2.11" % "3.0.0-preview1",
  "com.amazon.redshift" % "jdbc4" % "1.1.7.1007" % "test" from "https://s3.amazonaws.com/redshift-downloads/drivers/RedshiftJDBC4-1.1.7.1007.jar",
  "org.mockito" % "mockito-core" % "1.10.19" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5"
)

libraryDependencies += "com.spotify" % "docker-client" % "3.5.13"



