package Datatypes

import Exceptions.ExceptionMessages._

import java.lang.module.ModuleDescriptor.Requires

object Fractions {
  /**
   * new datatype Fraction
   */
  def main(args: Array[String]): Unit = {
    println(Add(Fraction(2, 3), Fraction(6, 11)))
  }

  case class Fraction(Enumerator: BigInt, Denominator: BigInt){
    if (Denominator == 0) {
      throw new Exception(DivisorCantBeZero)
    }
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

  def Minus(x: Fraction, y:Fraction):Fraction = {
    Fraction(
      x.Enumerator * y.Denominator - y.Enumerator * x.Denominator,
      x.Denominator * y.Denominator
    )
  }

  def Multiply(x: Fraction, y:Fraction):Fraction = {
    Fraction(
      x.Enumerator * y.Enumerator,
      x.Denominator * y.Denominator
    )
  }
  def Division(x:Fraction, y:Fraction):Fraction = {
    Multiply(x, Fraction(y.Denominator, y.Enumerator))
  }

}
