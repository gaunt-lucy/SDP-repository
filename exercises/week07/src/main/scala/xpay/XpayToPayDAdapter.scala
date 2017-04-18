package xpay

/**
  * Created by Lucy on 02/04/2017.
  */
class XpayToPayDAdapter (val payD: PayD) extends Xpay {
  private var cardExpYear: String = null

  def getCreditCardNo: String = {
    return payD.getCustCardNo
  }

  def setCreditCardNo(creditCardNo: String) {
    payD.setCustCardNo(creditCardNo)
  }

  def getCustomerName: String = {
    return payD.getCardOwnerName
  }

  def setCustomerName(customerName: String) {
    payD.setCardOwnerName(customerName)
  }

  def getCardExpMonth: String = {
    return payD.getCardExpMonthDate
  }

  def setCardExpMonth(cardExpMonth: String) {
    payD.setCardExpMonthDate(cardExpMonth)
  }

  def getCardExpYear: String = {
    return cardExpYear
  }

  def setCardExpYear(cardExpYear: String) {
    this.cardExpYear = cardExpYear
  }

  def getCardCVVNo: Short = {
    return payD.getCVVNo.asInstanceOf[Short]
  }

  def setCardCVVNo(cardCVVNo: Short) {
    payD.setCVVNo(cardCVVNo.asInstanceOf[Integer])
  }

  def getAmount: Double = {
    return payD.getTotalAmount
  }

  def setAmount(amount: Double) {
    payD.setTotalAmount(amount)
  }
}

