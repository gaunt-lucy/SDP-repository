package sml

/**
  * Created by Lucy on 10/03/2017.
  */
case class OutInstruction(label: String, opcode: String, register: Int) extends Instruction(label, opcode) {

  override def execute(m: Machine) =
    println(m.regs(register))

//  override def toString(): String = {
//  super.toString + " register " + register + " value is " + value + "\n"
//}
}

  object OutInstruction {
    def apply(label: String, register: Int) =
      new OutInstruction(label, "out", register)
  }
