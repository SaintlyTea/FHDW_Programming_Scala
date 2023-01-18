import org.scalatest.FunSuite
import Integers._
class IntegersTest extends FunSuite {
    test( "Increment"){
      assert(Increment(9) == 10)
    }

  test("Abs"){
    assert(Abs(-10) == 10)
    assert(Abs(10) == 10)
  }

    test("Test für die ReturnRest-function"){
      assert(ReturnRest(13, 3) == 1)
      assert(ReturnRest(25, 7) == 4)
      assert(ReturnRest(0, 1) == 0)
      assert(ReturnRest(1, 1) == 0)
      assert(ReturnRest(1, 2) == 1)

      assert(ReturnRest(1, -2) == 1)
      assert(ReturnRest(-1, 2) == -1)
      assert(ReturnRest(-1, -2) == -1)
    }

  test("Test of function BiggerThanConstant"){
    // true
    assert(BiggerThanConstant(50))

    // false
    assert(!BiggerThanConstant(constant))
    assert(!BiggerThanConstant(1))
  }

  test("SumUpTo"){
    // success
    assert(Factional(0) == 1)
    assert(Factional(1) == 1)
    assert(Factional(4) == 10)
    assert(Factional(10) == 55)
  }

  test("POWEEEERRR"){
    assert(POWEEEERRR(0, 4) == 0)
    assert(POWEEEERRR(2, 0) == 1)
    assert(POWEEEERRR(3, 2) == 9)
    assert(POWEEEERRR(2, 4) == 16)
  }

  test("SumOfEachSquaredDigitInNumber"){
    assert(SumOfEachSquaredDigitInNumber(0) == 0)
    assert(SumOfEachSquaredDigitInNumber(1) == 1)
    assert(SumOfEachSquaredDigitInNumber(2) == 4)
    assert(SumOfEachSquaredDigitInNumber(139) == 91)

    assert(SumOfEachSquaredDigitInNumber(-3) == 9)
    assert(SumOfEachSquaredDigitInNumber(-139) == 91)
  }

  test("inverse"){
    assert(Inverse(1, 3) == 1)
    assert(Inverse(1, 3) == 1)
  }

  test("IsEven"){
    assert(IsEven(0))
    assert(!IsEven(1))
    assert(IsEven(2))
    assert(!IsEven(3))
  }

  test("IsOdd"){
    assert(!IsOdd(0))
    assert(IsOdd(1))
    assert(!IsOdd(2))
    assert(IsOdd(3))
  }
}
