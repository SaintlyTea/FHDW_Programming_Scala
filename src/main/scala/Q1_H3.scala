import scala.annotation.tailrec

object Q1_H3 {

  /**
   * Multiplies all number between x and y, needs to be divide and conquer
   *
   * @note this does not work
   * @param x :Int
   * @param y :Int
   * @return
   */
  def Product(x: BigInt, y: BigInt): BigInt = {
    def Production(x: BigInt, y: BigInt): BigInt = {
      if (x == y)
        y
      else if (x > y)
        1
      else if (x == 0)
        Production(x + 1, (x + y) / 2) * Production((x + y) / 2 + 1, y)
      else
        x * Production(x + 1, (x + y) / 2) * Production((x + y) / 2 + 1, y)
    }

    Production(x, y - 1)
  }

  /**
   *
   * @note Make this into recursive
   * @param n : Int
   * @return
   */
  def Fibonacci(n: BigInt): BigInt = {
    @tailrec
    def Fibo(n: BigInt, x: BigInt, y: BigInt): BigInt = {
      if (n == 1)
        return y
      Fibo(n - 1, y, x + y)
    }

    Fibo(n, 0, 1)
  }

  def PressF(): Int = {
    0
  }
}