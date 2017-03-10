package week02

import scala.reflect.runtime.{universe => ru}

object reflectByName {

  def getObj

  def getTypeTag [T: ru.TypeTag] (obj: T) = ru.typeTag[T]

  def getType(name: String): Type = {
  val c = (Class.forName(name))
  getTypeTag(c)
  }

  def getInterface (name: String): Array = {
    val c = (Class.forName(name))
    Class.getInterfaces(c)
  }
}


//def main (s: String) = {
//val m = getClass(s)
//println(getType(m))
//println (getInterface(m))


//class Person (name: String)

//main