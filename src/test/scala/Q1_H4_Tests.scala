import Q1_H4._
import org.scalatest.FunSuite

//noinspection NameBooleanParameters
class Q1_H4_Tests extends FunSuite {
  test("SwapAt"){
    assert(SwapAt("Hello there", ' ') == "there Hello")
  }
}
