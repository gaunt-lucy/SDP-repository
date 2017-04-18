/**
  * Created by Lucy on 02/04/2017.
  */

package films

case class Director (firstName: String, lastName: String, yearOfBirth: Int) {

  def name = firstName+" "+lastName

}

object Director {

  def apply (firstName: String, lastName: String, yearOfBirth: Int) = {
    new Director(firstName, lastName, yearOfBirth)
  }

  def older (d1: Director, d2: Director) = {
    if (d1.yearOfBirth > d2.yearOfBirth) d1.name else d2.name
  }
}
