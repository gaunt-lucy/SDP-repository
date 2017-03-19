import scala.collection.mutable.ListBuffer

object ControlUnit

class ControlUnit (sensors: ListBuffer[Sensor]) {
  val theseSensors = sensors

  def pollSensors{
    for (sensor <- theseSensors) { // For each sensor in the listBuffer:
      if (sensor.isTriggered) { //print if isTriggered == True
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else { //print if isTriggered == False
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}
