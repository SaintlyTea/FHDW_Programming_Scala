import org.scalatest.FunSuite
import Q1_H1._
class Q1_H1_Tests extends FunSuite {
    test( "Increment"){
      assert(Increment(9) == 10)
    }

  test("Square"){
    assert(Square(2) == 4)
    assert(Square(3) == 9)
    assert(Square(5) == 25)
  }

  test("Max"){
    assert(Max(2, 5) == 5)
    assert(Max(6, 5) == 6)
    assert(Max(1, 1) == 1)
  }

  test("Abs"){
    assert(Abs(-10) == 10)
    assert(Abs(10) == 10)
  }

    test("ReturnRest"){
      assert(Modulo(13, 3) == 1)
      assert(Modulo(25, 7) == 4)
      assert(Modulo(0, 1) == 0)
      assert(Modulo(1, 1) == 0)
      assert(Modulo(1, 2) == 1)
      assert(Modulo(1, 0) == 0)

      assert(Modulo(1, -2) == 1)
      assert(Modulo(-1, 2) == -1)
      assert(Modulo(-1, -2) == -1)
    }

  test("SumUpTo"){

  }

  test("BiggerThanConstant"){
    // true
    assert(BiggerThanConstant(50))

    // false
    assert(!BiggerThanConstant(constant))
    assert(!BiggerThanConstant(1))
  }

  test("POWEEEERRR"){
    assert(POWEEEERRR(0, 4) == 0)
    assert(POWEEEERRR(2, 0) == 1)
    assert(POWEEEERRR(3, 1) == 3)
    assert(POWEEEERRR(3, 2) == 9)
    assert(POWEEEERRR(2, 4) == 16)

    assert(POWEEEERRR(-2, 3) == -8)
    assert(POWEEEERRR(-2, 4) == 16)
  }

  test("SumOfEachSquaredDigitInNumber"){
    assert(SumOfEachSquaredDigitInNumber(0) == 0)
    assert(SumOfEachSquaredDigitInNumber(1) == 1)
    assert(SumOfEachSquaredDigitInNumber(2) == 4)
    assert(SumOfEachSquaredDigitInNumber(139) == 91)

    assert(SumOfEachSquaredDigitInNumber(-3) == 9)
    assert(SumOfEachSquaredDigitInNumber(-139) == 91)
  }

  test("Inverse"){
    assert(Inverse(1, 3) == 1)
    assert(Inverse(1, 3) == 1)
    assert(Inverse(3, 10) == 7)
  }

  test("IsEven"){
    assert(IsEven(0))
    assert(!IsEven(1))
    assert(IsEven(2))
    assert(!IsEven(3))

    assert(IsEven(-2))
    assert(!IsEven(-3))
  }

  test("IsOdd"){
    assert(!IsOdd(0))
    assert(IsOdd(1))
    assert(!IsOdd(2))
    assert(IsOdd(3))

    assert(!IsOdd(-2))
    assert(IsOdd(-3))
  }
}
