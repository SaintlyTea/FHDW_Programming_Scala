object Q1_H6 {

  abstract class ConversionMethod {

    case class ProportionalConversion(m:BigInt, b:BigInt) extends ConversionMethod{

    }

    case class LinearConversion(x:BigInt) extends ConversionMethod{

    }
  }

  abstract class AbstractUnit{

    case class BaseUnit(Name:String) extends AbstractUnit{

    }

    case class DerivedUnit(Name:String, baseUnit: BaseUnit, calcMethod:BigInt) extends AbstractUnit{

    }


  }

}
