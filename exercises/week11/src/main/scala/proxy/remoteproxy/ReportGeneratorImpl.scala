package proxy.remoteproxy

import java.rmi
import java.rmi.{Naming, Remote, RemoteException}
import java.rmi.server.UnicastRemoteObject
import java.util.Date

object ReportGeneratorImpl extends App {
  try {
    val reportGenerator: ReportGenerator = new ReportGeneratorImpl()
    Naming.rebind("PizzaCoRemoteGenerator", reportGenerator)
  } catch {
    case e: Exception => e.printStackTrace()
  }
}

class ReportGeneratorImpl protected () extends UnicastRemoteObject with ReportGenerator {
  val d = new Date
  val c = d.toString
  @throws (classOf[RemoteException])
  override def generateDailyReport(): String = {
    val str = new StringBuilder
    str.append("********************Location X Daily Report********************\n")
    str.append("Location ID: 012\n")
    str.append("Today’s Date: " + c +"\n")
    str.append(" Total Pizza Sell: 112\n")
    str.append("Total Sale: $2534\n")
    str.append("Net Profit: $1985\n")
    str.append("***************************************************************")
    str.toString()
  }
}
