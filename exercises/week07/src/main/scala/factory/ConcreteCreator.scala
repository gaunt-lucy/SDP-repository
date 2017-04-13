package main.scala.factory

/**
  * Created by Lucy on 02/04/2017.
  */
class ConcreteCreator extends Creator {
  override def factory: Product = {
    new ConcreteProduct
  }
}
