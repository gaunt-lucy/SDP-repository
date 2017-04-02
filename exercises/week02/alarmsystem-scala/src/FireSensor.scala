
class FireSensor extends HazardSensor {
  var batteryPercent = 100.00

  override def isTriggered: Boolean = {
    val r = 5
    if (scala.util.Random.nextInt(100) < r) {
      true
    }
    else {
      false
    }
  }

  override def getLocation: String = {
    "Lobby 1st floor"
  }

  override def getSensorType: String = {
    "Fire sensor"
  }

  def getBatteryPercentage: Double = {
    batteryPercent = batteryPercent-(batteryPercent*0.1)
    batteryPercent

  }

}
