import org.scalatest.FunSuite
import Q1_H2._

class Q1_H2_Tests extends FunSuite {
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
    assert(NumberOfOptimusPrimesUnder(3) == 3)
    assert(NumberOfOptimusPrimesUnder(11) == 6)
  }

  test("UnoReverse") {
    assert(UnoReverse(100) == 1)
    assert(UnoReverse(17) == 71)
    assert(UnoReverse(27) == 72)
    assert(UnoReverse(101) == 101)
    assert(UnoReverse(132) == 231)
    assert(UnoReverse(978) == 879)
    assert(UnoReverse(9998) == 8999)
  }

  test("GetLengthOfNumber"){
    assert(GetLengthOfNumber(1) == 1)
    assert(GetLengthOfNumber(10) == 2)
    assert(GetLengthOfNumber(100) == 3)
  }

  test("ToOctal"){
    assert(ToOctal(1) == "1")
    assert(ToOctal(10) == "12")
    assert(ToOctal(256) == "400")
  }

  test("DecodeDecimal"){
    assert(DecodeDecimal(20, 16) == "14")
    assert(DecodeDecimal(20, 2) == "10100")
  }
}