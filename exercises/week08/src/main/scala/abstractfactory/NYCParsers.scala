package abstractfactory

/**
  * Created by Lucy on 17/04/2017.
  */

class NYCErrorXMLParser extends XMLParser {
  val tpe = "error"
  val client = "NYC"

  override def parse: String = {
    println(client.concat(" Parsing ").concat(tpe).concat(" XML..."))
    client.concat(" ").concat(tpe.capitalize).concat(" XML Message")
  }
}

class NYCFeedbackXML extends XMLParser {

  val tpe = "feedback"
  val client = "NYC"

  override def parse: String = {
    println(client.concat(" Parsing ").concat(tpe).concat(" XML..."))
    client.concat(" ").concat(tpe.capitalize).concat(" XML Message")
  }
}

class NYCOrderXMLParser extends XMLParser {
  val tpe = "order"
  val client = "NYC"

  override def parse: String = {
    println(client.concat(" Parsing ").concat(tpe).concat(" XML..."))
    client.concat(" ").concat(tpe.capitalize).concat(" XML Message")
  }
}

class NYCResponseXMLParser extends XMLParser {
  val tpe = "response"
  val client = "NYC"

  override def parse: String = {
    println(client.concat(" Parsing ").concat(tpe).concat(" XML..."))
    client.concat(" ").concat(tpe.capitalize).concat(" XML Message")
  }
}

