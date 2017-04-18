package command

class EmailJob extends Job {
  var thisEmail: Email = _

  def setEmail(email: Email): Unit = {
    thisEmail = email
    //println("Job details to go here?")
  }

  override def run(): Unit = thisEmail.sendEmail()
}