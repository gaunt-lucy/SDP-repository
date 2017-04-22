package observer

import scala.collection.mutable.ListBuffer

//noinspection ScalaStyle
class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject {

  var commentary: String = ""

  def subscribeObserver(observer: Observer): Unit = subscribers += observer

  def unSubscribeObserver(observer: Observer): Unit = subscribers += observer

  def notifyObservers(): Unit = {
    for (s <- subscribers){
      s.update(this.subjectDetails)
    }
  }

  def setDesc (s: String): Unit = {
    commentary = s
    notifyObservers()
  }

  def subjectDetails: String = {
    commentary
  }

}
