import Q1_H4._
import org.scalatest.FunSuite

//noinspection NameBooleanParameters
class Q1_H4_Tests extends FunSuite {

  test("FindFirstOccurrence"){
    assert(MyIndexOf("Hello there", 't') == 6)
    assert(MyIndexOf("Four is perfect", 'F') == 0)
    assertThrows[NoSuchElementException] {MyIndexOf("Ok", 'a')}
  }

  test("SwapAt"){
    assert(SwapAt("Hello there", ' ') == "there Hello")
    assert(SwapAt("ArtrA", 't') == "rAtAr")
    assert(SwapAt("ratta", 't') == "tatra")
    assert(SwapAt("ratata", 't') == "atatra")
    assert(SwapAt("Ok", 'a') == "Ok")
  }

  test("ContainsHowOften") {

    // With char
    assert(ContainsHowOften("Hello there", 'e') == 3)
    assert(ContainsHowOften("TeTe", 'T') == 2)
    assert(ContainsHowOften("Atreus", 'o') == 0)

    // With string
    assert(ContainsHowOften("Hahahahahaha", "0") == 0)
    assert(ContainsHowOften("1230", "0") == 1)
    assert(ContainsHowOften("Banana", "ana") == 2)
    assert(ContainsHowOften("Bannana", "ana") == 1)
    assert(ContainsHowOften("aya aya", "a") == 4)
    assert(ContainsHowOften("Ayayayaya", "aya") == 3)
    assert(ContainsHowOften("Ayayayaya", "Aya") == 1)
  }

  test("MyShifty"){
    assert(MyShifty("Hello there") == "eHello ther")
    assert(MyShifty("Ok") == "kO")
    assert(MyShifty("4") == "4")
    assert(MyShifty(MyShifty("Ok")) == "Ok")
  }

  test("MyLess"){
    assert(MyLess("Ajajajajaja", "ababaababa"))
    assert(!MyLess("bjajajajaja", "ababaababa"))
    assert(!MyLess("bjajajajaja", "bbabaababa"))
    assert(!MyLess("aaaa", "aaa"))
    assert(MyLess("aa", "aaa"))
  }



  test("MyToString"){
    assert(MyToString(true) == "true")
    assert(MyToString(false) == "false")

    assert(MyToString(4) == "4")
    assert(MyToString(44) == "44")

    assert(MyToString("Hello there") == "Hello there")
    assert(MyToString("2b||Not(2b)") == "2b||Not(2b)")
  }

}
