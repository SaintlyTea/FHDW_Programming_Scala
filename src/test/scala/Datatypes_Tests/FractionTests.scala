package Datatypes_Tests

import Datatypes.Fractions._
import org.scalatest.FunSuite

class FractionTests extends FunSuite {

  test("Fraction creation") {

    intercept[Exception] {
      Fraction(1, 0)
    }
  }

  test("Add") {
    assert(Add(Fraction(2, 3), Fraction(1, 2)) == Fraction(7, 6))
    assert(Add(Fraction(2, 3), Fraction(6, 11)) == Fraction(40, 33))
  }

  test("Minus") {
  assert(Minus(Fraction(2, 3), Fraction(1, 2)) == Fraction(1, 6))
  assert(Minus(Fraction(-3, 3), Fraction(1, 2)) == Fraction(-9, 6))
  }

  test("Multiply"){
    assert(Multiply(Fraction(2, 3), Fraction(1, 2)) == Fraction(2, 6))
    assert(Multiply(Fraction(-2, 3), Fraction(1, 2)) == Fraction(-2, 6))
  }

  test("Division"){
    assert(Division(Fraction(1, 2), Fraction(1,4)) == Fraction(4, 2))
    assert(Division(Fraction(-1, 2), Fraction(1,4)) == Fraction(-4, 2))
  }
}
