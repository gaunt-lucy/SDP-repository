/**
  * Created by Lucy on 02/04/2017.
  */
class Person (val fName: String, val sName: String)

object Person {

  def apply (name: String) = {
    try {
      val names = name.split(" ")
      new Person(names(0), names(1))
    }
    catch {
      case e: Exception => ("name is in wrong format")
    }
  }
}