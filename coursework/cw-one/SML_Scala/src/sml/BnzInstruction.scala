package sml

/**
  * Created by Lucy on 10/03/2017.
  */
case class BnzInstruction (label: String, opcode: String, register: Int, nextLine: String)
  extends Instruction(label, opcode) {

  override def execute(m: Machine) = {
    if (m.regs(register) != 0) {
      m.pc = m.labels.labels.indexOf(nextLine)
    }
  }

  override def toString(): String = {
    super.toString + " register " + register + " "+ nextLine + "\n"
  }
}
object BnzInstruction {
  def apply(label: String, register: Int, nextLine: String) =
    new BnzInstruction(label, "bnz", register, nextLine)
}

