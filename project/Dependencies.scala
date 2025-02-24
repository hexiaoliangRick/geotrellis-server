import sbt._
import sbt.Keys._

object Dependencies {

  def catsVersion(module: String) =
    Def.setting {
      module match {
        case "core"   => "org.typelevel" %% s"cats-$module" % "2.7.0"
        case "effect" => "org.typelevel" %% s"cats-$module" % "2.5.4"
      }
    }

  def circeVersion(module: String) = Def.setting("io.circe" %% s"circe-$module" % "0.14.1")
  def http4sVer(module: String)    = Def.setting("org.http4s" %% s"http4s-$module" % "0.21.31")

  val crossScalaVer = List("2.12.15")
  val scalaVer      = crossScalaVer.head

  val dispatchVer  = "0.11.3"
  val gtVer        = "3.6.0"
  val stac4sVer    = "0.6.2"
  val jaxbApiVer   = "2.3.1"
  val refinedVer   = "0.9.23"
  val shapelessVer = "2.3.3"
  val log4jVer     = "2.20.0"

  val cats                 = catsVersion("core")
  val catsEffect           = catsVersion("effect")
  val circeCore            = circeVersion("core")
  val circeShapes          = circeVersion("shapes")
  val circeGeneric         = circeVersion("generic")
  val circeGenericExtras   = circeVersion("generic-extras")
  val circeOptics          = Def.setting("io.circe" %% "circe-optics" % "0.14.1")
  val circeParser          = circeVersion("parser")
  val circeRefined         = circeVersion("refined")
  val circeJava8           = circeVersion("java8")
  val commonsIO            = "commons-io"                             % "commons-io"                  % "2.11.0"
  val concHashMap          = "com.googlecode.concurrentlinkedhashmap" % "concurrentlinkedhashmap-lru" % "1.4.2"
  val decline              = "com.monovore"                          %% "decline"                     % "1.4.0"
  val geotrellisRaster     = "org.locationtech.geotrellis"           %% "geotrellis-raster"           % gtVer
  val geotrellisLayer      = "org.locationtech.geotrellis"           %% "geotrellis-layer"            % gtVer
  val geotrellisVector     = "org.locationtech.geotrellis"           %% "geotrellis-vector"           % gtVer
  val geotrellisS3         = "org.locationtech.geotrellis"           %% "geotrellis-s3"               % gtVer
  val geotrellisStore      = "org.locationtech.geotrellis"           %% "geotrellis-store"            % gtVer withSources()
  val geotrellisHBase      = "org.locationtech.geotrellis"           %% "geotrellis-hbase"            % gtVer
  val geotrellisAccumulo   = "org.locationtech.geotrellis"           %% "geotrellis-accumulo"         % gtVer
  val geotrellisCassandra  = "org.locationtech.geotrellis"           %% "geotrellis-cassandra"        % gtVer
  val geotrellisGdal       = "org.locationtech.geotrellis"           %% "geotrellis-gdal"             % gtVer
  val http4sBlazeClient    = http4sVer("blaze-client")
  val http4sBlazeServer    = http4sVer("blaze-server")
  val http4sCirce          = http4sVer("circe")
  val http4sDsl            = http4sVer("dsl")
  val http4sXml            = http4sVer("scala-xml")
  val jaxbApi              = "javax.xml.bind"                         % "jaxb-api"                    % jaxbApiVer
  val kindProjector        = "org.typelevel"                         %% "kind-projector"              % "0.13.2"
  val semanticdbScalac     = "org.scalameta"                          % "semanticdb-scalac"           % "4.4.31"
  val log4cats             = "io.chrisdavenport"                     %% "log4cats-slf4j"              % "1.1.1"
  val mamlJvm              = "com.azavea.geotrellis"                 %% "maml-jvm"                    % "0.6.1"
  val pureConfig           = "com.github.pureconfig"                 %% "pureconfig"                  % "0.14.1"
  val pureConfigCatsEffect = "com.github.pureconfig"                 %% "pureconfig-cats-effect"      % "0.14.1"
  val scaffeine            = "com.github.blemale"                    %% "scaffeine"                   % "5.1.1"
  val scalaXml             = "org.scala-lang.modules"                %% "scala-xml"                   % "1.3.0"
  val scalatest            = "org.scalatest"                         %% "scalatest"                   % "3.2.10" % Test
  val scalacheck           = "org.scalacheck"                        %% "scalacheck"                  % "1.14.0" % Test
  val scalacheckCats       = "io.chrisdavenport"                     %% "cats-scalacheck"             % "0.1.1"  % Test
  val sttpHttp4s           = "com.softwaremill.sttp.client3"         %% "http4s-ce2-backend"          % "3.3.9"
  val macrosParadise       = "org.scalamacros"                        % "paradise"                    % "2.1.1"
  val scalaParser          = "org.scala-lang.modules"                %% "scala-parser-combinators"    % "1.1.2"
  val shapeless            = "com.chuusai"                           %% "shapeless"                   % shapelessVer
  val logback              = "ch.qos.logback"                         % "logback-classic"             % "1.2.7"  % Runtime
  val droste               = "io.higherkindness"                     %% "droste-core"                 % "0.8.0"
  val stac4sCore           = "com.azavea.stac4s"                     %% "core"                        % stac4sVer
  val stac4sClient         = "com.azavea.stac4s"                     %% "client"                      % stac4sVer
  val refinedCats          = "eu.timepit"                            %% "refined-cats"                % refinedVer
  val refinedPureconfig    = "eu.timepit"                            %% "refined-pureconfig"          % refinedVer
  val threetenExtra        = "org.threeten"                           % "threeten-extra"              % "1.7.0"
  val ansiColors212        = "org.backuity"                          %% "ansi-interpolator"           % "1.1.0"  % Provided
  val tofuCore             = "tf.tofu"                               %% "tofu-core"                   % "0.10.3"
  val azureStorage         = "com.azure"                              % "azure-storage-blob"          % "12.14.2"
}
