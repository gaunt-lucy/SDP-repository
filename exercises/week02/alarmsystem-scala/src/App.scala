import java.io.IOException
import java.util.Scanner
import scala.collection.mutable.ListBuffer

object App {
  private val EXIT: String = "exit"
  private val POLL: String = "poll"

  @throws[IOException]
  def main(args: Array[String]) {
    val sensorFactory = new SensorFactory
    val sSensors = sensorFactory.getSecSensors
    val hSensors = sensorFactory.getHazSensors
    val controlUnit: ControlUnit = new ControlUnit(hSensors)
    val secUnit: SecurityControlUnit = new SecurityControlUnit(sSensors)
    val scanner: Scanner = new Scanner(System.in)
    var input: String = ""
    while (input != EXIT) {
      println("Type \"poll\" to poll all sensors once or \"exit\" to exit")
      input = scanner.nextLine
      if (input == POLL) {
        secUnit.pollSensors
        controlUnit.pollSensors
      }
    }
  }
}
