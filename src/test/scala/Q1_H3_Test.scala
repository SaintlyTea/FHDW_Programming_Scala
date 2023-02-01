import Q1_H3._
import org.scalatest.FunSuite

//noinspection NameBooleanParameters
class Q1_H3_Test extends  FunSuite {
  test("Production"){
    assert(Product(0,6) == 120)
    assert(Product(1,6) == 120)
    assert(Product(3,6) == 60)
    assert(Product(10,11) == 10)
    assert(Product(9, 15) == 2162160)
    assert(Product(10, 30) == BigInt("24365525776399090483200000"))
  }

  test("Fibonacci"){
    assert(Fibonacci(4) == 3)
    assert(Fibonacci(5) == 5)
    assert(Fibonacci(6) == 8)
    assert(Fibonacci(50) == 12586269025L)

    // H24 is true
    var test:BigInt = 0
    for (i <- 1 to 8) {
      test += Fibonacci(i)
    }
    assert(test == Fibonacci(8+2)-1)
  }

  test("Not"){
    assert(!Not(true))
    assert(Not(false))
  }

  test("Xor"){
    assert(!Xor(true, true))
    assert(Xor(true, false))
  }

  test("Implies"){
    assert(Implies(true, true))
    assert(Implies(false, false))
    assert(!Implies(true, false))
  }

  test("Equivalent"){
    assert(Equivalent(true, true))
    assert(!Equivalent(true, false))
  }

  test("ToUnicode"){
    assert(ToUnicode('a') == 97)
  }

  test("ToCharacter"){
    assert(ToCharacter(97) == 'a')
  }
}
