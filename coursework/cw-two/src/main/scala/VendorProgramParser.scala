package vendor
/**
  * Created by Lucy on 17/04/2017.
  */
class ProgramParser extends ProgramParser {

  /**
    * Parses a file representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param file the file to parse
    * @return an instruction list
    */
  def parse(file: String): InstructionList

  /**
    * Parses a string representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param string the string to parse
    * @return an instruction list
    */
  def parseString(string: String): InstructionList = {

    val splitString = string.split("\n")
    for (i <- splitString) {
      i match {


      }
    }

  }
}
