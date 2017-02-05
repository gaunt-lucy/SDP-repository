class FireSensor extends Sensor {
  override def isTriggered: Boolean = false {
    val r = 5
    if (scala.random.util.nextInt(100) < r){
      true
    }
  }

  override def getLocation: String = null {
    "Lobby 1st floor"
  }

  override def getSensorType: String = null {
    "Fire sensor"
  }

  override def getBatteryPercentage: Double = -1 {

  }
}
