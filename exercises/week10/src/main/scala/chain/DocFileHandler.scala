package chain

case class DocFileHandler(s: String) extends Handler {
  var nextHandler: Handler = null

  override def setHandler(handler: Handler): Unit = {
    nextHandler = handler
  }

  override def process(file: File): Unit = {

    file.fileType match {
      case "doc" => println(s"Process and saving doc file... by $s")
      case _ => {
        nextHandler match {
          case null => println("File not supported.")
          case _ => {
            println(f"$s forward request to $nextHandler")
            nextHandler.process(file)
          }
        }
      }
    }
  }

  override def getHandlerName(): String = s
}
