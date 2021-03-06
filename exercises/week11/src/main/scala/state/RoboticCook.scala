package state

case class RoboticCook(r: Robot) extends RoboticState {
  def walk(): Unit = {
    r.state = r.roboticOn
    r.state.walk()
  }
  def cook(): Unit = {
    println("Cooking...")
  }
  def off(): Unit = {
    r.state = r.roboticOff
    r.state.off()
  }
}
