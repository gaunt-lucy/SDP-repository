package proxy.remoteproxy

import java.rmi.Naming

object ReportGeneratorClient extends App {
  val x = new ReportGeneratorClient
  x.generateReport()
}

class ReportGeneratorClient {
  def generateReport(): Unit = {
    try {
      val reportGenerator: ReportGenerator = Naming
        .lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator") //TODO: connectException - does not compile!
        .asInstanceOf[ReportGenerator]
      println(reportGenerator.generateDailyReport())
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }
}
