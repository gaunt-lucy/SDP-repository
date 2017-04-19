package flyweight

/**
  * Created by Lucy on 18/04/2017.
  */
class RubyPlatform extends Platform{
  println("RubyPlatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing Ruby code.")
}
