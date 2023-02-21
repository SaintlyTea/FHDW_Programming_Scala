import Datatypes.Fractions._
import Q1_H5._
import org.scalatest.FunSuite


class Q1_H5_Tests extends FunSuite {
  test("sign"){
    assert(Sign(Fraction(1, 2)) == 1)
    assert(Sign(Fraction(-1, -2)) == 1)
    assert(Sign(Fraction(0, 2)) == 0)
    assert(Sign(Fraction(-1, 2)) == -1)
    assert(Sign(Fraction(1, -2)) == -1)
  }

  test("ToRational"){
    assert(ToRational(Fraction(3, 333)) == Fraction(1, 111))
    assert(ToRational(Fraction(10, 100)) == Fraction(1, 10))
    assert(ToRational(Fraction(100, 10)) == Fraction(10, 1))

    assert(ToRational(Fraction(-3, -333)) == Fraction(1, 111))
    assert(ToRational(Fraction(-10, -100)) == Fraction(1, 10))

    assert(ToRational(Fraction(-10, 100)) == Fraction(-1, 10))
    assert(ToRational(Fraction(10, -100)) == Fraction(-1, 10))
    assert(ToRational(Fraction(0, 100)) == Fraction(0, 1))
  }

  test("SameValue"){
    // True
    assert(SameValue(Fraction(1, 2), Fraction(3,6)))
    assert(SameValue(Fraction(1, 4), Fraction(25, 100)))
    assert(SameValue(Fraction(0, 4), Fraction(0, 100)))

    assert(SameValue(Fraction(-1, 2), Fraction(-3, 6)))
    assert(SameValue(Fraction(-1, 4), Fraction(-25, 100)))

    // False
    assert(!SameValue(Fraction(1, 2), Fraction(3, 9)))
    assert(!SameValue(Fraction(1, 4), Fraction(25, 200)))

    assert(!SameValue(Fraction(-1, 2), Fraction(-3, 9)))
    assert(!SameValue(Fraction(-1, 4), Fraction(-25, 200)))
    assert(!SameValue(Fraction(-1, 4), Fraction(2, 8)))
  }

  test("MyLess"){
    // true
    assert(MyLess(Fraction(1, 10), Fraction(1, 5)))
    assert(MyLess(Fraction(1, 3), Fraction(1, 2)))
    assert(MyLess(Fraction(1, 3), Fraction(1, -2)))
    assert(MyLess(Fraction(-1, 2), Fraction(1, 2)))
    assert(MyLess(Fraction(0, 2), Fraction(1, 2)))

    // False
    assert(!MyLess(Fraction(2, 10), Fraction(1, 5)))
    assert(!MyLess(Fraction(1, 2), Fraction(-1, 2)))
  }
}
