package sml

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConverters._
import scala.reflect.ClassTag
import scala.util.{Failure, Success, Try}

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
class Translator(fileName: String) {
  private final val ADD = "add"
  private final val LIN = "lin"
  private final val BNZ = "bnz"
  private final val MUL = "mul"
  private final val DIV = "div"
  private final val SUB = "sub"
  private final val OUT = "out"

  /**
    *
    * @param field
    * @return result of Try(field.toInt)
    */
  def checkInt(field: String): Try[Any] = {
    Try(field.toInt)
  }

  /**
    *
    * @param fields
    * @return class for named Instruction
    */
  def getInstructionCls (fields: Array[String]): Class[_] = {
    val insName: String = fields(1)
    val instruction = "sml." + insName.capitalize + "Instruction"
    Class.forName(instruction)
  }

  /**
    * translates the small program in the file into lab (the labels) and prog (the program)
    *
    * @param m
    * @return a new Machine with program of instructions
    *
    */
  def readAndTranslate(m: Machine): Machine = {
    val labels = m.labels
    var program = m.prog
    import scala.io.Source
    val lines = Source.fromFile(fileName).getLines
    for (line <- lines) {
      val fields = line.split(" ")
      if (fields.length > 0) {
        labels.add(fields(0))
        val cls = getInstructionCls(fields)
        var parameters = ArrayBuffer[Any]()
        var conParams = ArrayBuffer[Class[_]]()

        for (field <- fields) {
          val f = checkInt(field)
          f match {
            case Success(s) => {
              conParams += classOf[Int]
              parameters += s
            }
            case Failure(p) => {
              conParams += classOf[java.lang.String]
              parameters += field
            }
            case _ => println(throw new IllegalArgumentException("That isn't a valid argument."))
          }
        }

        val params = new Array[Any](parameters.size)
        val consParams = new Array[Class[_]](conParams.size)

        for (i <- 0 until params.length){
          params(i) = parameters(i)
          consParams(i) = conParams(i)
        }

        val theInstruction = cls.getConstructor(consParams:_*).newInstance(params.asInstanceOf[Array[AnyRef]]:_*).asInstanceOf[Instruction]
        program = program :+ theInstruction

      }


      // Match statement replaced by reflection above.

//      fields(1) match {
//        case ADD =>
//          program = program :+ AddInstruction(fields(0), fields(2).toInt, fields(3).toInt, fields(4).toInt)
//        case LIN =>
//          program = program :+ LinInstruction(fields(0), fields(2).toInt, fields(3).toInt)
//        case SUB =>
//          program = program :+ SubInstruction(fields(0), fields(2).toInt, fields(3).toInt, fields(4).toInt)
//        case MUL =>
//          program = program :+ MulInstruction(fields(0), fields(2).toInt, fields(3).toInt, fields(4).toInt)
//        case DIV =>
//          program = program :+ DivInstruction(fields(0), fields(2).toInt, fields(3).toInt, fields(4).toInt)
//        case OUT =>
//          program = program :+ OutInstruction(fields(0), fields(2).toInt)
//        case BNZ =>
//          program = program :+ BnzInstruction(fields(0), fields(2).toInt, fields(3))
//        case x =>
//          println(s"Unknown instruction $x")
//      }
    }
    new Machine(labels, program)
  }

}

object Translator {
  def apply(file: String) = new Translator(file)
}
