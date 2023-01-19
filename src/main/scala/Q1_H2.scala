import scala.annotation.tailrec

object Q1_H2 {

  /**
   * add each number until n
   * @param n:Int
   * @return
   */
  def SumUpToRECURSION(n: Int): Int = {
    if (n == 0)
      0
    else if (n < 0)
      n + SumUpToRECURSION(n + 1)
    else
      n + SumUpToRECURSION(n - 1)
  }

  /**
   * multiply all the numbers until n
   *
   * @param n :Int
   * @return Int
   */
  def Factorial(n: BigInt): BigInt = {
    if (n == 0)
      1
    else if (n < 0)
      n * Factorial(n + 1)
    else
      n * Factorial(n - 1)
  }

  /**
   * num times itself as often as exponent says
   *
   * @param num      :Int
   * @param exponent :Int
   * @return Int
   */
  def POWEEEERRROFRECURSION(num: Int, exponent: Int): Int = {
    if (exponent == 0)
      1
    else
      num * POWEEEERRROFRECURSION(num, exponent - 1)
  }

  /**
   *
   * @param n:Int
   * @return
   */
  def fib(n: BigInt): BigInt = {
    if (n == 0)
      0
    else
      n + fib(n - 1)
  }
}
