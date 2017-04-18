package command

class LoggingJob extends Job {

  var thisLog: Logging = _

  def setLogging(logging: Logging) = {
    thisLog = logging
    //println("Set Logging job here!!")
  }
  override def run(): Unit = thisLog.log
}