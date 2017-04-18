package abstractfactory

/**
  * Created by Lucy on 17/04/2017.
  */
class NYCFactory extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = {
    parserType match {
      case "NYCORDER" => new NYCOrderXMLParser
      case "NYCERROR" => new NYCErrorXMLParser
      case "NYCFEEDBACK" => new NYCFeedbackXML
      case "NYCRESPONSE" => new NYCResponseXMLParser
    }
  }
}
