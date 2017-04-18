/**
  * Created by Lucy on 13/04/2017.
  */
case class casePerson (fName: String, sName: String)

object casePerson {

  def apply (name: String) = {
    try {
      val names = name.split(" ")
      new Person(names(0), names(1))
    }
    catch {
      case e: Exception => "name is in wrong format"
    }
  }
}

