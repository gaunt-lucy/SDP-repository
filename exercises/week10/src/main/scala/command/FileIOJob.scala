package command

class FileIOJob extends Job {
  var thisFileIO: FileIO = _

  def setFileIO(fileIO: FileIO): Unit = {
    thisFileIO = fileIO
    //println("Job deets here?")
  }

  override def run(): Unit = {
    thisFileIO.execute
  }
}