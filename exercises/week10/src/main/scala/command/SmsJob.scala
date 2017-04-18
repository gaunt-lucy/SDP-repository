package command

class SmsJob extends Job {

  var thisSMS: Sms = _

  def setSms(sms: Sms): Unit = {
    thisSMS = sms
  }

  override def run(): Unit = {

    thisSMS.sendSms
  }
}