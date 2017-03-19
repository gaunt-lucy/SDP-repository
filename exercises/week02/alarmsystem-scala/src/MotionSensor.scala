/**
  * Created by Lucy on 19/03/2017.
  */
class MotionSensor extends Sensor {

  override def isTriggered = {
    val r = 15
    if (scala.util.Random.nextInt(100) < r) {
      true
    }
    else {
      false
    }
  }

  override def getLocation = "Entrance way"

  override def getSensorType = "Motion sensor"

  override def getSensorCategory = "Security"
}
