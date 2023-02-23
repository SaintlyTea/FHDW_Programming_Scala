import Datatypes.Fractions._
import Q1_H4._
import Q1_H6._
import org.scalatest.FunSuite

class Q1_H6_Tests extends FunSuite {

  test("MyToString") {
    assert(MyToString(BaseUnit("Meter")) == "Unit: Meter")

    assert(MyToString(DerivedUnit("Kilometer", BaseUnit("Meter"), ProportionalConversion(ToFraction(1000)))) ==
      "Unit: Kilometer\nDerived from: Meter\nCalculation-Method: ProportionalConversion: 1000*x")

    assert(MyToString(DerivedUnit("C", BaseUnit("F"), LinearConversion(ToFraction(10), ToFraction(32)))) ==
      "Unit: C\nDerived from: F\nCalculation-Method: LinearConversion: 10*x+32")
  }

  test("ConvertAmount"){
    assert(ConvertAmount(Fraction(5, 1), ProportionalConversion(ToFraction(100))) == Fraction(500, 1))
  }

  test("ConvertToBase"){
    assert(ConvertToBase(Quantity(ToFraction(100), DerivedUnit("Centimeter", BaseUnit("Meter"), ProportionalConversion(Fraction(1, 100))))) ==
      Quantity(ToFraction(1), BaseUnit("Meter")))

    assert(ConvertToBase(Quantity(ToFraction(-100), DerivedUnit("Centimeter", BaseUnit("Meter"), ProportionalConversion(Fraction(1, 100))))) ==
      Quantity(ToFraction(-1), BaseUnit("Meter")))

    assert(ConvertToBase(Quantity(ToFraction(1), DerivedUnit("Kilometer", BaseUnit("Meter"), ProportionalConversion(ToFraction(1000))))) ==
      Quantity(ToFraction(1000), BaseUnit("Meter")))

    assert(ConvertToBase(Quantity(Fraction(4, 2), BaseUnit("Meter"))) ==
      Quantity(Fraction(2, 1), BaseUnit("Meter")))

    assert(ConvertToBase(Quantity(ToFraction(68), DerivedUnit("Fahrenheit", BaseUnit("Celsius"), LinearConversion(Fraction(5,9),Fraction(-160,9))))) ==
      Quantity(ToFraction(20), BaseUnit("Celsius")))
  }

  test("ConvertFromBase"){
    assert(ConvertFromBase(Quantity(ToFraction(1), BaseUnit("Meter")),
      DerivedUnit("Centimeter", BaseUnit("Meter"), ProportionalConversion(Fraction(100, 1)))) ==
    Quantity(ToFraction(100), DerivedUnit("Centimeter", BaseUnit("Meter"), ProportionalConversion(Fraction(100, 1)))))

    assert(ConvertFromBase(Quantity(ToFraction(-1), BaseUnit("Meter")),
      DerivedUnit("Centimeter", BaseUnit("Meter"), ProportionalConversion(Fraction(100, 1)))) ==
    Quantity(ToFraction(-100), DerivedUnit("Centimeter", BaseUnit("Meter"), ProportionalConversion(Fraction(100, 1)))))
  }
}
