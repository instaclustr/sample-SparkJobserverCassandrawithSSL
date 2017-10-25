name := "cassandra-count"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1" % "provided"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.2"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.1" % "provided"

resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"

libraryDependencies += "spark.jobserver" %% "job-server-api" % "0.8.0" % "provided"

assemblyMergeStrategy in assembly := {
case PathList("META-INF", "io.netty.versions.properties") => MergeStrategy.last
case x =>
val old = (assemblyMergeStrategy in assembly).value
old(x)
}
