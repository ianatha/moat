import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "moat"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
     jdbc
    ,anorm
    ,"com.typesafe.slick" %% "slick" % "1.0.0"
    ,"postgresql" % "postgresql" % "9.1-901.jdbc4"
    ,"mysql" % "mysql-connector-java" % "5.1.18"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}
