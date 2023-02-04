import Q1_H4._
import org.scalatest.FunSuite

//noinspection NameBooleanParameters
class Q1_H4_Tests extends FunSuite {
  test("SwapAt"){
    assert(SwapAt("Hello there", ' ') == "there Hello")
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
