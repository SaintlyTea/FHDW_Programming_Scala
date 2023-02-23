import Datatypes.Fractions._
import Exceptions.ExceptionMessages._
import Q1_H5.ToRational

object Q1_H6 {

  val FahrenheitToCelsius = 32

  /**
   * Creates a ConversionMethod to convert Units
   */
  abstract class ConversionMethod

  case class ProportionalConversion(x: Fraction) extends ConversionMethod

  case class LinearConversion(m: Fraction, b: Fraction) extends ConversionMethod

  /**
   * Creates AbstractUnit representing a Unit
   */
  abstract class AbstractUnit

  case class BaseUnit(Name: String) extends AbstractUnit {

  }

  case class DerivedUnit(Name: String, baseUnit: BaseUnit, calcMethod: ConversionMethod) extends AbstractUnit {

  }

  /**
   * Amount you have of a Unit
   *
   * @param amount:Fraction
   * @param unit:AbstractUnit
   */
  case class Quantity(amount: Fraction, unit: AbstractUnit) {

  }

  /**
   * Converts an amount according to the ConversionMethod Example: 1 Meter into 100 cm
   *
   * @param amount   :Fraction
   * @param convType :ConversionMethod
   * @return
   */
  def ConvertAmount(amount: Fraction, convType: ConversionMethod): Fraction = convType match {
    case p: ProportionalConversion => Multiply(amount, p.x)
    case l: LinearConversion => ToRational(
      Add(
        Multiply(l.m, amount),
        l.b)
    )
  }

  /**
   * Converts the given Unit to the Base
   *
   * @param quantity :Quantity
   * @return
   */
  def ConvertToBase(quantity: Quantity): Quantity = {
    quantity.unit match {
      case d: DerivedUnit => Quantity(ToRational(ConvertAmount(quantity.amount, d.calcMethod)), d.baseUnit)
      case b: BaseUnit => Quantity(ToRational(quantity.amount), BaseUnit(b.Name))
    }
  }

  /**
   * receives a BaseUnit and a DerivedUnit to calc to
   * @param quantity:BaseUnit
   * @param targetUnit:DerivedUnit
   * @return
   */
  def ConvertFromBase(quantity:Quantity, targetUnit:DerivedUnit):Quantity = {
    quantity.unit match {
      case b: BaseUnit =>
        if(b == targetUnit.baseUnit){
          Quantity(ToRational(ConvertAmount(quantity.amount, targetUnit.calcMethod)), DerivedUnit(targetUnit.Name, b, targetUnit.calcMethod))
        }
        else
          throw new Exception(BaseUnitsNotMatchingException)
      case d: DerivedUnit => throw new Exception(CannotUseDerivedUnitHereException)
    }
  }
}
