import Q1_H4._
import org.scalatest.FunSuite

import scala.util.control

//noinspection NameBooleanParameters
class Q1_H4_Tests extends FunSuite {

  test("FindFirstOccurrence"){
    assert(FindFirstOccurrence("Hello there", 't') == 6)
    assert(FindFirstOccurrence("Four is perfect", 'F') == 0)
    assertThrows[Exception] {FindFirstOccurrence("Ok", 'a')}
  }

  test("SwapAt"){
    assert(SwapAt("Hello there", ' ') == "there Hello")
    assert(SwapAt("Test", 'a') == "Test")
    assert(SwapAt("ArtrA", 't') == "rAtAr")
    assert(SwapAt("ratta", 't') == "tatra")
    assert(SwapAt("ratata", 't') == "atatra")
    assert(SwapAt("Ok", 'a') == "Ok")
  }

  test("ContainsHowOften") {
    assert(ContainsHowOften("Hello there", 'e') == 3)
    assert(ContainsHowOften("TeTe", 'T') == 2)
    assert(ContainsHowOften("Atreus", 'o') == 0)
  }

  test("MyToString"){
    assert(MyToString(true) == "true")
    assert(MyToString(false) == "false")

    assert(MyToString('t') == "t")
    assert(MyToString('e') == "e")

    assert(MyToString(4) == "4")
    assert(MyToString(44) == "44")

    assert(MyToString("Hello there") == "Hello there")
    assert(MyToString("2b||Not(2b)") == "2b||Not(2b)")
  }

}
