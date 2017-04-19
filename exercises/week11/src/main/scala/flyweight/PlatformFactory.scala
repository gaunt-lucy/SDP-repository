package flyweight

import scala.collection.mutable.Map

object PlatformFactory {

  private var map: Map[String, Platform] = Map[String, Platform]()

  map.put("SCALA", new ScalaPlatform)
  map.put("JAVA", new JAVAPlatform)
  map.put("C", new CPlatform)
  map.put("RUBY", new RubyPlatform)

  def getPlatformInstance(platformType: String): Platform = {
    platformType match {
      case "SCALA" => map("SCALA")
      case "JAVA" => map("JAVA")
      case "C" => map("C")
      case "RUBY" => map("RUBY")
    }
  }
  // this method will probably need to be synchronized

}
