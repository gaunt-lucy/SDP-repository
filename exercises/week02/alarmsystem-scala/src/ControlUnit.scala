import scala.collection.mutable.ListBuffer

object ControlUnit

class ControlUnit {
  def pollSensors() {
    val sensors = new ListBuffer[Sensor]() //Create an empty instance of listBuffer object
    sensors += new FireSensor() // Creates new FireSensor, adds to listbuffer
    sensors += new SmokeSensor() // Creates new instance of SmokeSensor, adds to listbuffer
    for (sensor <- sensors) { // For each sensor in the listbuffer:
      if (sensor.isTriggered) { //print if isTriggered == True
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else { //print if isTriggered == False
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}
