/**
  * Created by Lucy on 02/04/2017.
  */
  package week05

  class Counter (var count: Int) {

    def inc(n: Int = 1): Counter = {
      new Counter(count+n)
    }

    def dec(n: Int = 1): Counter = {
      new Counter(count-n)
    }

    def adjust (a: Adder): Counter = {
      new Counter(a.add(count))
    }

  }

