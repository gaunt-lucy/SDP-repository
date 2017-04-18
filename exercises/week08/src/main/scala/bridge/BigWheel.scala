package bridge

// TODO

case class BigWheel(product: Product, s: String) extends Car(product, s) {
  override def assemble: Unit = println("Assembling "+product.productName+" for "+s)

  override def produceProduct: Unit = {
    println("Producing "+product.productName)
    println("Modifying product"+s+" according to "+product.productName)
  }

  override def printDetails: Unit = println("Car: "+s+", Product: "+product.productName)
}
