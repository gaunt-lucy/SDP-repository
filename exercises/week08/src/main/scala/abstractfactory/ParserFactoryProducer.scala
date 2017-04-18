package abstractfactory

object ParserFactoryProducer {
  def getFactory(s: String) = {
    s match {
      case "NYCFactory" => new NYCFactory
      case "LondonFactory" => new LondonFactory
    }
  }

  // TODO

}
