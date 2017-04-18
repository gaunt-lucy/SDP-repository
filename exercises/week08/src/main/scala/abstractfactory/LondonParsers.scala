package abstractfactory

/**
  * Created by Lucy on 17/04/2017.
  */

//noinspection ScalaStyle
class LondonErrorXMLParser extends XMLParser {
  val tpe = "error"
  val client = "London"

  override def parse: String = {
    println(client.concat(" Parsing ").concat(tpe).concat(" XML..."))
    client.concat(" ").concat(tpe.capitalize).concat(" XML Message")
  }
}

class LondonFeedbackXML extends XMLParser {
  val tpe = "feedback"
  val client = "London"

  override def parse: String = {
    println(client.concat(" Parsing ").concat(tpe).concat(" XML..."))
    client.concat(" ").concat(tpe.capitalize).concat(" XML Message")
  }
}

class LondonOrderXMLParser extends XMLParser {
  val tpe = "order"
  val client = "London"

  override def parse: String = {
    println(client.concat(" Parsing ").concat(tpe).concat(" XML..."))
    client.concat(" ").concat(tpe.capitalize).concat(" XML Message")
  }
}

class LondonResponseXMLParser extends XMLParser {
  val tpe = "response"
  val client = "London"

  override def parse: String = {
    println(client.concat(" Parsing ").concat(tpe).concat(" XML..."))
    client.concat(" ").concat(tpe.capitalize).concat(" XML Message")
  }
}

