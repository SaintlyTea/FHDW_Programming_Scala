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

    def CreateFractionNormal(): Fraction = {
      if (this.Denominator == 0) {
        throw new Exception(DivisorCantBeZeroException)
      }

      if (this.Denominator < 0)
        Fraction(this.Enumerator * -1, this.Denominator * -1)
      else
        Fraction(this.Enumerator, this.Denominator)
    }
  }

  /**
   * Creates a Fraction leaving the entered data as is
   * @param enum:Fraction
   * @param denom:Fraction
   * @return
   */
  def CreateFractionCringe(enum: BigInt, denom: BigInt): Fraction = {
    if (denom == 0) {
      throw new Exception(DivisorCantBeZeroException)
    }
    else
      Fraction(enum, denom)
  }

  def FractionInverse(Fract:Fraction):Fraction = Fraction(Fract.Denominator, Fract.Enumerator).CreateFractionNormal()

  def ToFraction(number:Int):Fraction = Fraction(number, 1).CreateFractionNormal()

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
