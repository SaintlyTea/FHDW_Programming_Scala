import Q1_H3._
import org.scalatest.FunSuite

class Q1_H3_Test extends  FunSuite {
  test("Production"){
    assert(Product(0,6) == 0)
    assert(Product(3,6) == 60)
    assert(Product(9, 15) == 2162160)
    assert(Product(10, 30) == BigInt("24365525776399090483200000"))
  }

  test("Fibonacci"){
    assert(Fibonacci(4) == 3)
    assert(Fibonacci(6) == 8)
    assert(Fibonacci(50) == 12586269025L)
  }


}
