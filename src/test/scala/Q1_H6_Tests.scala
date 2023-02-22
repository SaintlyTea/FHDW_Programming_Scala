import Q1_H4._
import Q1_H6._

import org.scalatest.FunSuite

class Q1_H6_Tests extends FunSuite {

  test("MyToString") {
    assert(MyToString(BaseUnit("Meter")) == "Unit: Meter")

    assert(MyToString(DerivedUnit("Kilometer", BaseUnit("Meter"), ProportionalConversion(1000))) ==
      "Unit: Kilometer\nDerived from: Meter\nCalculation-Method: ProportionalConversion: 1000*x")

    assert(MyToString(DerivedUnit("C", BaseUnit("F"), LinearConversion(10, 10))) ==
      "Unit: C\nDerived from: F\nCalculation-Method: LinearConversion: 10*x+10")
  }
}
