package proxy.protectedproxy

class Employee extends Staff {
  private var reportGenerator: ReportGeneratorProxy = _

  override def setReportGenerator(
    reportGenerator: ReportGeneratorProxy
  ): Unit = new ReportGeneratorProtectionProxy(this)

  override def isOwner(): Boolean = false

  def generateDailyReport(): String = reportGenerator.generateDailyReport()
}
