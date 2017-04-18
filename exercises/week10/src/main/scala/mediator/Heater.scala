package mediator

class Heater extends Colleague {

  var mediator: MachineMediator = _
  var temp: Int = _

  override def setMediator(mediator: MachineMediator): Unit = this.mediator = mediator

  def on(temp: Int): Unit = {
    println("Heater is on...")
    this.temp = temp

  }

  def off(): Unit = println("Heater is off...")
}