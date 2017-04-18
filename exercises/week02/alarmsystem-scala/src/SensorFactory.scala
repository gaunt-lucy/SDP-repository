import scala.collection.mutable.ListBuffer

/**
  * Created by Lucy on 19/03/2017.
  */
class SensorFactory {

  def getHazSensors: ListBuffer[Sensor] = {
    val hazSensors = new ListBuffer[Sensor]() //Create an empty instance of listBuffer object
    hazSensors += new FireSensor() // Creates new FireSensor, adds to listBuffer
    hazSensors += new SmokeSensor() // Creates new instance of SmokeSensor, adds to listBuffer

    hazSensors //return listBuffer of sensors
  }
    def getSecSensors: ListBuffer[SecuritySensor] = {
      val secSensors = new ListBuffer[SecuritySensor]()
      secSensors += new MotionSensor() //Creates new instance of motion Sensor, adds to listBuffer

      secSensors //return listBuffer of sensors
  }

}
