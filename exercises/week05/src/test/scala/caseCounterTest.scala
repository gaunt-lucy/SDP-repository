/**
  * Created by Lucy on 02/04/2017.
  */
package week05

import org.scalatest.FunSuite

class caseCounterTestSuite extends FunSuite {
  // Basics
  test("Tests new Counter return value") {
    assert(caseCounter(5).count == 5)
  }

  test("increments counter with and without value") {
    assert(caseCounter(4).inc().inc(2).count == 7)
  }

  test("decrements counter with value and without value") {
    assert(caseCounter(20).dec().dec().dec(2).count == 16)
  }

  test("tests combined methods dec and inc on Counter class") {
    assert(caseCounter(20).inc(2).dec().dec(2).inc().inc(2).count == 22)
  }

}
