import org.scalatest.FunSuite
import Q1_H2._

class Q1_H2_Test extends FunSuite {
  test("SumUpToRECURSION") {
    assert(SumUpToRECURSION(1) == 1)
    assert(SumUpToRECURSION(10) == 55)
    assert(SumUpToRECURSION(-1) == -1)
    assert(SumUpToRECURSION(-10) == -55)
  }

  test("Factorial") {
    assert(Factorial(0) == 1)
    assert(Factorial(1) == 1)
    assert(Factorial(3) == 6)
    assert(Factorial(4) == 24)
    assert(Factorial(10) == 3628800)

    assert(Factorial(-1) == -1)
    assert(Factorial(-3) == -6)
    assert(Factorial(-4) == 24)
  }


  test("POWEEEERRROFRECURSION") {
    assert(POWEEEERRROFRECURSION(0, 3) == 0)
    assert(POWEEEERRROFRECURSION(2, 0) == 1)
    assert(POWEEEERRROFRECURSION(2, 3) == 8)
    assert(POWEEEERRROFRECURSION(2, 4) == 16)

    assert(POWEEEERRROFRECURSION(-2, 3) == -8)
    assert(POWEEEERRROFRECURSION(-2, 4) == 16)
  }

  test("Fib") {
    assert(Fib(0) == 0)
    assert(Fib(4) == 3)
    assert(Fib(5) == 5)
    assert(Fib(6) == 8)
  }

  test("IsOptimusPrime") {
    assert(IsOptimusPrime(1))
    assert(IsOptimusPrime(3))
    assert(!IsOptimusPrime(4))
    assert(IsOptimusPrime(11))
    assert(!IsOptimusPrime(12))
  }

  test("NumberOfOptimusPrimes") {
    assert(NumberOfOptimusPrimes(3) == 3)
    assert(NumberOfOptimusPrimes(11) == 6)
  }

  test("UnoReverse") {
    assert(UnoReverse(17) == 71)
    assert(UnoReverse(27) == 72)
    assert(UnoReverse(132) == 231)
    assert(UnoReverse(978) == 879)
    assert(UnoReverse(9998) == 8999)
  }
}