import Datatypes.Fractions._
import Q1_H1._
import Q1_H2.{GreaterCommonDivisor, LeastCommonMultiplier}

object Q1_H5 {

  /**
   * Returns whether the number is Bigger, Even or Smaller than 0
   *
   * @param number :Int
   * @return
   */
  def Sign(number: Int): String = {
    if (number > 0)
      "Bigger"
    else if (number < 0)
      "Smaller"
    else
      "Even"
  }

  /**
   * Returns whether the Fraction is Bigger, Even or Smaller than 0
   *
   * @param fract :Fraction
   * @return
   */
  def Sign(fract: Fraction): String = {
    if (fract.Enumerator > 0)
      "Bigger"
    else if (fract.Enumerator < 0)
      "Smaller"
    else
      "Even"
  }

  /**
   * Returns the shortest fraction
   *
   * @param fract :Fraction
   * @return
   */
  def ToRational(fract: Fraction): Fraction = {
    val divisor:BigInt = GreaterCommonDivisor(Abs(fract.Enumerator), Abs(fract.Denominator))
    Fraction(fract.Enumerator / divisor, fract.Denominator / divisor)
  }

  def SameValue(fract1: Fraction, fract2: Fraction): Boolean = {
    if (ToRational(fract1) == ToRational(fract2))
      true
    else
      false
  }

  /**
   * Checks if the first Fraction is smaller than the second
   *
   * @param fract1 :Fraction
   * @param fract2 :Fraction
   * @return
   */
  def MyLess(fract1: Fraction, fract2: Fraction): Boolean = {
    val leveledDenominator = LeastCommonMultiplier(fract1.Denominator, fract2.Denominator)
    val fraction1 = Fraction(fract1.Enumerator * (leveledDenominator / fract1.Denominator), leveledDenominator)
    val fraction2 = Fraction(fract2.Enumerator * (leveledDenominator / fract2.Denominator), leveledDenominator)

    if (fraction1.Enumerator < fraction2.Enumerator)
      true
    else
      false
  }
}