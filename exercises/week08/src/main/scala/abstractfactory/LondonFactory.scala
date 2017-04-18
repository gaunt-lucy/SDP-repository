package abstractfactory

/**
  * Created by Lucy on 17/04/2017.
  */
class LondonFactory extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = {
    parserType match {
      case "LondonORDER" => new LondonOrderXMLParser
      case "LondonERROR" => new LondonErrorXMLParser
      case "LondonFEEDBACK" => new LondonFeedbackXML
      case "LondonRESPONSE" => new LondonResponseXMLParser
    }
  }
}

