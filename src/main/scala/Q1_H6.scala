import Datatypes.Fractions._
import Q1_H5.ToRational

object Q1_H6 {

  abstract class ConversionMethod

    case class ProportionalConversion(x:BigInt) extends ConversionMethod{

    }

    case class LinearConversion(m:BigInt, b:BigInt) extends ConversionMethod{

    }


  abstract class AbstractUnit

    case class BaseUnit(Name:String) extends AbstractUnit{

    }

    case class DerivedUnit(Name:String, baseUnit: BaseUnit, calcMethod:ConversionMethod) extends AbstractUnit{

    }


  case class Quantity(amount:Int, baseUnit: AbstractUnit){

  }

  /**
   * Converts an amount according to the ConversionMethod Example: 1 Meter into 100 cm
   * @param amount:Fraction
   * @param convType:ConversionMethod
   * @return
   */
  def ConvertAmount(amount: Fraction, convType:ConversionMethod): Fraction = convType match {
    case p: ProportionalConversion => Multiply(amount, Fraction(p.x, 1))
    case l: LinearConversion => ToRational(
      Add(
        Multiply(Fraction(l.m, 1), amount),
        Fraction(l.b, 1))
    )
  }
}
