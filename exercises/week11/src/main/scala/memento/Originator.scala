package memento


case class Originator(
  var x: Double,
  var y: Double,
  var careTaker: CareTaker
) {

  private var lastUndoSavepoint: String = _

  createSavepoint("INITIAL")

  def createSavepoint(savepointName: String): Unit = {
    val newSave = Memento(x, y)
    careTaker.saveMemento(newSave, savepointName)
    lastUndoSavepoint = savepointName
    println(s"Saving state...$savepointName")
  }

  def undo(): Unit = {
    setOriginatorState(lastUndoSavepoint)
    println(s"Undo at...$lastUndoSavepoint")
  }

  def undo(savepointName: String): Unit = {
    setOriginatorState(savepointName)
    createSavepoint(savepointName)
    println(s"Undo at...$lastUndoSavepoint")
  }

  def undoAll(): Unit = {
    undo("INITIAL")
    careTaker.clearSavepoints()
  }

  private def setOriginatorState(savepointName: String): Unit = {
    val undoPoint = careTaker.getMemento(savepointName)
    this.x = undoPoint.x
    this.y = undoPoint.y
  }

  override def toString(): String = "X: " + x + ", Y: " + y
}
