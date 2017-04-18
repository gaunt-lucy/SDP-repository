import bc.ByteCode
import vm.VirtualMachine

/**
  * Created by Lucy on 17/04/2017.
  */

package bc {

  class ByteCodeVal(bt: Byte, v: Int = 0) extends ByteCode {

    val code: Byte = bt
    val value: Int = v

    override def execute(vm: VirtualMachine) = ???
  }
}

//
//
//  override def execute(vm: VirtualMachine) = {
//    val op = codebyte(code)
//    op match {
//      case "iconst" => {
//        vm.push(value)
//      }
//      case "iadd" => {
//        val (x, _) = vm.pop()
//        val (y, _) = vm.pop()
//        vm.push(x + y)
//      }
//
//    }
//  }
//}
