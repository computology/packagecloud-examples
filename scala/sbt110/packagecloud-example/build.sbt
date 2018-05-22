name := "packagecloud-example"

version := "1.1"

scalaVersion := "2.12.2"

import aether.AetherKeys._

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

aetherWagons := Seq(aether.WagonWrapper("packagecloud+https", "io.packagecloud.maven.wagon.PackagecloudWagon"))

publishTo := {
  Some("packagecloud+https" at "packagecloud+https://packagecloud.io/capotej/scala-test")
}
