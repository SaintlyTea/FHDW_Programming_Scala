import Datatypes.Fractions._
import Q1_H1._
import Q1_H2.{GreaterCommonDivisor, LeastCommonMultiplier}

object Q1_H5 {

  /**
   * Returns whether the Fraction is Bigger, Even or Smaller than 0
   *
   * @param fract :Fraction
   * @return
   */
  def Sign(fract: Fraction): Int = {
    if (fract.Enumerator > 0 && fract.Denominator > 0 || fract.Enumerator < 0 && fract.Denominator < 0)
      1
    else if (fract.Enumerator < 0 || fract.Denominator < 0)
      -1
    else
      0
  }

  /**
   * Returns the most shortened fraction
   *
   * @param fract :Fraction
   * @return
   */
  def ToRational(fract: Fraction): Fraction = {
    val divisor: BigInt = GreaterCommonDivisor(fract.Enumerator, fract.Denominator)

    if (Sign(fract) == 1)
      Fraction(Abs(fract.Enumerator / divisor), Abs(fract.Denominator / divisor))
    else
      Fraction(fract.Enumerator / divisor, fract.Denominator/divisor)
  }

  /**
   * Checks if two rational number are the same
   *
   * @param fract1 :Fraction
   * @param fract2 :Fraction
   * @return
   */
  def SameValue(fract1: Fraction, fract2: Fraction): Boolean = ToRational(fract1) == ToRational(fract2)

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
