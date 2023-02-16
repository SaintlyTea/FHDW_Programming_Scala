package Datatypes

import Exceptions.ExceptionMessages._

object Fractions {
  /**
   * new datatype Fraction
   */
  def main(args: Array[String]): Unit = {
    println(Add(Fraction(2, 3), Fraction(6, 11)))
  }

  case class Fraction(Enumerator: BigInt, Denominator: BigInt) {
    if (Denominator == 0) {
      throw new Exception(DivisorCantBeZeroException)
    }
  }

  def CreateFractionNormal(enum: BigInt, denom: BigInt): Fraction = {
    if (denom == 0) {
      throw new Exception(DivisorCantBeZeroException)
    }
    if (denom < 0)
      Fraction(enum * -1, denom * -1)
    else
      Fraction(enum, denom)
  }

  def CreateFractionCringe(enum: BigInt, denom: BigInt): Fraction = {
    if (denom == 0) {
      throw new Exception(DivisorCantBeZeroException)
    }
    else
      Fraction(enum, denom)
  }

  /**
   * adds together the Fraction x und y
   */
  def Add(x: Fraction, y: Fraction): Fraction = {
    Fraction(
      x.Enumerator * y.Denominator + y.Enumerator * x.Denominator,
      x.Denominator * y.Denominator
    )
  }

  def Minus(x: Fraction, y: Fraction): Fraction = {
    Fraction(
      x.Enumerator * y.Denominator - y.Enumerator * x.Denominator,
      x.Denominator * y.Denominator
    )
  }

  def Multiply(x: Fraction, y: Fraction): Fraction = {
    Fraction(
      x.Enumerator * y.Enumerator,
      x.Denominator * y.Denominator
    )
  }

  def Division(x: Fraction, y: Fraction): Fraction = {
    if (x.Enumerator == 0 || y.Enumerator == 0)
      throw new Exception(DivisorCantBeZeroException)
    Multiply(x, Fraction(y.Denominator, y.Enumerator))
  }

}
