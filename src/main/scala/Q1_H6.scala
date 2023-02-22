
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
}
