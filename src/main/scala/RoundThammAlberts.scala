import Datatypes.Fractions.Fraction
import Exceptions.ExceptionMessages.DivisorCantBeZeroException
import Q1_H1.Abs
import Q1_H5.ToRational


object RoundThammAlberts {


  /**
   * Die Funktion "round" rundet einen Bruch vom Datentyp Fraction auf die naechste logische ganze Zahl
   */
  def round(n: Fraction): BigInt = {
    var result: BigInt = 0

    val x = ToRational(n)

    if (x.Denominator == 0)
      throw new Exception(DivisorCantBeZeroException)

    if (x.Enumerator >= (x.Denominator / 2))
      result = (Abs(x.Enumerator) + Abs(x.Denominator)) / Abs(x.Denominator)
    else
      result = x.Enumerator / x.Denominator

    if (x.Enumerator < 0 || x.Denominator < 0)
      result = result * -1

    result
  }
}
