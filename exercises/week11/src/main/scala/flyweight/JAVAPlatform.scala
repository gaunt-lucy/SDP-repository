package flyweight

/**
  * Created by Lucy on 18/04/2017.
  */
class JAVAPlatform extends Platform{
  println("JAVAPlatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing Java code.")
}
