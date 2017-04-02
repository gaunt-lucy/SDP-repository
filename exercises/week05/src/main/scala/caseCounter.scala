/**
  * Created by Lucy on 02/04/2017.
  */
package week05

case class caseCounter (count: Int = 0) {

    def inc(n: Int = 1): caseCounter = {
      caseCounter(count+n)
    }

    def dec(n: Int = 1): caseCounter = {
      caseCounter(count-n)
    }
}
