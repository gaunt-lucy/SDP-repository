/**
  * Created by Lucy on 02/04/2017.
  */
package films

case class Film (name: String, yearOfRelease: Int, imdbRating: Double, director: Director) {

  def getDirector = director

  def directorsAge = director.yearOfBirth - yearOfRelease

  def isDirectedBy (d: Director) = if (d == director) true else false

  //def copy (n: String = name, y: Int = yearOfRelease, imdb: Double = imdbRating, d: Director = director) = {
    //new Film (n, y, imdb, d)
  }

object Film {
  def apply (n: String, y: Int, imdb: Double, d: Director) = {
    new Film(n, y, imdb, d)
  }

  def highestRating (f1: Film, f2: Film) = {
    if (f1.imdbRating > f2.imdbRating) f1.name+": "+f1.imdbRating else f2.name+": "+f2.imdbRating
  }

  def oldestDirectorAtTheTime (f1: Film, f2: Film) = {

    if (f1.directorsAge > f2.directorsAge) f1.getDirector.name else f2.getDirector.name

  }
}