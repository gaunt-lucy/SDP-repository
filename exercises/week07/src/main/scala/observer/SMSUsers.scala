package observer

case class SMSUsers(s: Subject, msg: String) extends Observer {
  def update(desc: String) = s.notifyObservers()

  def subscribe() = s.subscribeObserver(this)

  def unSubscribe() = s.subscribeObserver(this)
}
