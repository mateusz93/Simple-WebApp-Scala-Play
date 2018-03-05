name := "webapp"
 
version := "1.0" 
      
lazy val `webapp` = (project in file(".")).enablePlugins(PlayScala)
lazy val myProject = (project in file(".")).enablePlugins(PlayScala, PlayEbean)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"


scalaVersion := "2.12.2"

libraryDependencies += jdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      