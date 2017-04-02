import scala.collection.mutable.ListBuffer

/**
  * Created by Lucy on 19/03/2017.
  */
class SensorFactory {

  def getSensors: ListBuffer[HazardSensor] = {
    val sensors = new ListBuffer[HazardSensor]() //Create an empty instance of listBuffer object
    sensors += new FireSensor() // Creates new FireSensor, adds to listBuffer
    sensors += new SmokeSensor() // Creates new instance of SmokeSensor, adds to listBuffer

    sensors //return listBuffer of sensors
  }

//  def getSecSensors: ListBuffer[Sensor] = {
//    val sensors = new ListBuffer[Sensor]() //Create an empty instance of listBuffer object
//    sensors += new MotionSensor() // Creates new FireSensor, adds to listBuffer
//
//    sensors //return listBuffer of sensors
//  }

}
