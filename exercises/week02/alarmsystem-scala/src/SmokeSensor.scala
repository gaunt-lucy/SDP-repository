class SmokeSensor extends Sensor {
  override def isTriggered: Boolean = false{
    val r = 10
    if (scala.random.util.nextInt(100) < r){
      true
    }
  }
  override def getLocation: String = null{
    "In the auditorium"
  }

  override def getSensorType: String = null{
    "Smoke sensor"
  }

  override def getBatteryPercentage: Double = -1{

  }
}
