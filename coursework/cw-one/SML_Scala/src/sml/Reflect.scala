//// ******* REFLECTION *******
//// Construct class name and get class of instruction
//val instrType = fields(1)
//val className = "sml." + instrType.capitalize + "Instruction"
//try {
//  val newInstr = Class.forName(className)
//  // Get class's default constructor
//  val cons = newInstr.getConstructors()(0)
//  // Get arguments for constructor
//  var args = new Array[Object](fields.length)
//  for (i <- 0 until fields.length) {
//    Try(fields(i).toInt) match {
//      case Success(x) => args(i) = new Integer(x)
//      case Failure(e) => args(i) = fields(i)
//    }
//  }
//  // Invoke constructor and add instruction to program
//  val instruction = cons.newInstance(args: _*).asInstanceOf[Instruction]
//  program = program :+ instruction
//} catch {
//  case ex: ClassNotFoundException => println(s"Unknown instruction $instrType")
//}
//}
//}