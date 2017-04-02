/**
  * Created by Lucy on 02/04/2017.
  */

package week05

import org.scalatest.FunSuite

class CounterTestSuite extends FunSuite {
  // Basics
  test("Tests new Counter return value") {
    assert(new Counter(5).count == 5)
  }

  test("increments counter with and without value") {
    assert(new Counter(4).inc().inc(2).count == 7)
  }

  test("decrements counter with value and without value") {
    assert(new Counter(20).dec().dec().dec(2).count == 16)
  }

  test("tests combined methods dec and inc on Counter class") {
    assert(new Counter(20).inc(2).dec().dec(2).inc().inc(2).count == 22)
  }

  test("tests that method adjust returns an updated count") {
    val m = new Adder(5)
    assert(new Counter(4).adjust(m).count == 9)
  }

}
