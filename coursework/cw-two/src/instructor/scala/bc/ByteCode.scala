package bc

import vm.VirtualMachine

/**
  * big Change
  */
/**
  * An exception representing an invalid bytecode. This can be used
  * in any circumstance where a bytecode might be invalid.
  *
  * @param msg the exception message
  */
class InvalidBytecodeException(msg: String) extends Exception(msg)

/**
  * [[ByteCodeValues]] is a trait containing a couple of useful definitions.
  * You should extend this trait in other classes that might find the
  * definitions below useful.
  */
trait ByteCodeValues {
  /**
    * A vector of the allowable bytecode names.
    * Not particularly flexible but that isn't the point of this assessment.
    */
  val names = Vector("iconst", "iadd", "isub", "imul", "idiv", "irem",
    "ineg", "iinc", "idec", "idup", "iswap", "print")

  /**
    * A map from bytecode names to a unique byte that represents them.
    */
  val bytecode = names.zip(1.to(names.length).map(_.toByte)).toMap
  val codebyte = swap(bytecode)

  def swap(map: Map[String, Byte]): Map[Byte, String] = {
    map map {_.swap}
  }

}

/**
  * [[ByteCode]] is a trait that represents a bytecode operation that can
  * be executed by a virtual machine. We use the *command* pattern here
  * to execute the bytecode operation. A bytecode must have a code (a
  * unique byte representing the bytecode - see [[ByteCodeValues.bytecode]])
  * and a method that executes the bytecode operation on the given
  * virtual machine.
  *
  * This trait extends the [[ByteCodeValues]] trait to give an
  * implementation access to the definitions provided by the
  * that trait.
  */
trait ByteCode extends ByteCodeValues {
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[ByteCodeValues]]
    */
  val code: Byte
  val value: Int

  /**
    * Returns a new [[VirtualMachine]] after executing this bytecode operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  def execute(vm: VirtualMachine): VirtualMachine
}

class ByteCodeOp(bt: Byte, v: Int = 0) extends ByteCode {

  val code: Byte = bt
  val value: Int = v

  override def execute(vm: VirtualMachine) = {
    val op = codebyte(code)
    op match {
      case "iconst" => {
            vm.push(value)
        }
      case "iadd" => {
            val (x, _) = vm.pop()
            val (y, _) = vm.pop()
            vm.push(x + y)
        }
      }
    }
  }
}
