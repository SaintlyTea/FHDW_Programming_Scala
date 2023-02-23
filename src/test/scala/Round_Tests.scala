import Datatypes.Fractions.Fraction
import Q1_H5.round
import org.scalatest.FunSuite

class Round_Tests extends FunSuite {

  test("round"){
      // Positive
    assert(round(Fraction(1, 4)) == 0)
    assert(round(Fraction(1, 2)) == 1)
    assert(round(Fraction(3, 4)) == 1)
    assert(round(Fraction(7, 4)) == 2)
    assert(round(Fraction(3, 5)) == 2)

      // Negative
    assert(round(Fraction(-1,4)) == 0)
    assert(round(Fraction(1,-4)) == 0)
    assert(round(Fraction(-3,4)) == -1)
  }
}
