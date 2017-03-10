package sml

/**
  * Created by Lucy on 10/03/2017.
  */
class BnzInstruction (label: String, opcode: String, register: Int, nextLine: String)
  extends Instruction(label, opcode) {

  override def execute(m: Machine) =
    m.regs(register) = value

  override def toString(): String = {
    super.toString + " register " + register + " value is " + nextLine + "\n"
  }
}

object BnzInstruction {
  def apply(label: String, register: Int, value: Int) =
    new BnzInstruction(label, "bnz", register, value)
}
}
