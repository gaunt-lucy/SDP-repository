class SmokeSensor extends Sensor {
  val counter = 0
  var batteryPercent = 100.00

  override def isTriggered: Boolean = {
    val r = 10
    if (scala.util.Random.nextInt(100) < r){
      true
    }
    else {
      false
    }
  }
  override def getLocation: String = {"In the auditorium"
  }

  override def getSensorType: String = {
    "Smoke sensor"
  }

  def getBatteryPercentage: Double = {
    batteryPercent = batteryPercent-(batteryPercent*0.2)
    batteryPercent
  }

  override def getSensorCategory = "Hazard"
}
