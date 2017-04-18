package facadepattern

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting: Unit = println("Starting boot...")

  override def readSystemConfigFile: Unit = println("Reading system config file...")

  override def init: Unit = println("Initialising:")

  override def initializeContext: Unit = println("- Context")

  override def initializeListeners: Unit = println("- Listeners")

  override def createSystemObjects: Unit = println("Created system objects.")

  override def releaseProcesses: Unit = println("Releasing processes...")

  override def destory: Unit = println("Destroying:")

  override def destroySystemObjects: Unit = println("- System objects")

  override def destoryListeners: Unit = println("- Listeners")

  override def destoryContext: Unit = println("- Context")

  override def shutdown: Unit = println("***Server is shut down.***")
}
