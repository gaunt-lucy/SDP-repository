package chain

//noinspection ScalaStyle
case class VideoFileHandler(s: String) extends Handler {
  var nextHandler: Handler = null

  override def setHandler(handler: Handler): Unit = {
    nextHandler = handler
  }

  override def process(file: File): Unit = {

    file.fileType match {
      case "video" => println(s"Process and saving video file... by $s")
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
