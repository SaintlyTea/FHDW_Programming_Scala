import org.scalatest.FunSuite
import Q1_H2._
class Q1_H2_Test extends FunSuite {
  test("SumUpToRECURSION"){
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


  test("POWEEEERRROFRECURSION"){
    assert(POWEEEERRROFRECURSION(3, 2) == 9)
    assert(POWEEEERRROFRECURSION(0, 3) == 0)
    assert(POWEEEERRROFRECURSION(2, 0) ==1)
  }
}