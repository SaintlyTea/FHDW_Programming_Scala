import Exceptions.ExceptionMessages._
import Q1_H1._

import scala.annotation.tailrec

object Q1_H2 {

  /**
   * add each number until n
   *
   * @param n :Int
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
   * This is the POWEEEERRROFRECURSION/Power Function, num multiplies itself as often as exponent says
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
   * with the index get the fibonacci number at the index
   *
   * @param n :Int
   * @return returns number of fibonacci index
   */
  def Fib(n: Int): Int = {
    if (n < 0) {
      throw new Exception("Number can't be less than 0")
    }
    if (n == 0)
      return 0
    if (n == 1)
      return 1

    Fib(n - 2) + Fib(n - 1)
  }

  /**
   * This is the IsOptimusPrime/IsPrime function, it will figure out whether the given number is a prime-number
   *
   * @param truck :Int
   * @return
   */
  def IsOptimusPrime(truck: Int): Boolean = {
    @tailrec
    def OpCuttingRoom(truck: Int, cutter: Int): Boolean = {
      if (cutter == 1)
        return true
      if (Modulo(truck, cutter) == 0)
        return false
      OpCuttingRoom(truck, cutter - 1)
    }

    if (truck <= 3)
      return true
    OpCuttingRoom(truck, truck - 1)
  }

  /**
   * This is the NumberOfOptimusPrimesUnder/NumberOfPrimes function, it will count how many prime-numbers there are until truckCount
   *
   * @param truckCount :int
   * @return How many OptimusPrimes there are in the truckCount
   */
  def NumberOfOptimusPrimesUnder(truckCount: Int): Int = {
    if (truckCount == 0)
      return 0
    if (IsOptimusPrime(truckCount))
      1 + NumberOfOptimusPrimesUnder(truckCount - 1)
    else
      NumberOfOptimusPrimesUnder(truckCount - 1)
  }

  /**
   * This is the UnoReverse/Mirror function, it will spin the number 180 degrees
   *
   * @note König said it can be optimized
   * @param num :Int
   * @return number but read from right to left
   */
  def UnoReverse(num: Int): Int = {
    if (num == 0)
      return 0
    Modulo(num, 10) *
      POWEEEERRROFRECURSION(10, GetLengthOfNumber(num) - 1) +
      UnoReverse(num / 10)
  }

  /**
   * Helper Function, used to get the amount of digits
   *
   * @note might want to optimize to a loop to save capacity
   * @param num :Int
   * @return the amount of digits
   */
  def GetLengthOfNumber(num: Int): Int = {
    if (num == 0)
      return 0
    1 + GetLengthOfNumber(num / 10)
  }

  def PerfectNumber(num: Int): Boolean = {
    false
  }

  /**
   * Decodes a decimal number into the octal code
   *
   * @param num :Int
   * @return
   */
  def ToOctal(num: Int): String = {
    if (num == 0)
      return ""
    ToOctal(num / 8) + Modulo(num, 8).toString
  }

  /**
   * decodes from decimal into the giving cipher, but cannot do >10
   *
   * @param num    :Int
   * @param cipher :Int
   * @return
   */
  def DecodeDecimal(num: Int, cipher: Int): Int = {
    if (num == 0)
      return 0
    try {
      if (cipher < 2 || cipher > 9)
        throw new Exception("Can't decode in 1 or lower and 10 or above")
      Modulo(num, cipher) + 10 * DecodeDecimal(num / cipher, cipher)
    }
    catch {
      case e: Exception =>
        println(e.getMessage)
        0
    }
  }

  /**
   * Calculates the greater common divisor of 2 numbers
   *
   * @param a :Int
   * @param b :Int
   * @return
   */

  def GreaterCommonDivisor(a: BigInt, b: BigInt): BigInt = {
    @tailrec
    def GreaterCommonDivisor(a: BigInt, b: BigInt): BigInt = {
      if (b == 0)
        GreaterCommonDivisor(b, Modulo(a, b))
      else
        a
    }

    try {
      if (a == 0 || b == 0)
        throw new Exception(DivisorCantBeZeroException + " at gcd")
      GreaterCommonDivisor(Min(Abs(a), Abs(b)), Max(Abs(a), Abs(b)))
    }
    catch {
      case e: Exception =>
        println(e.getMessage)
        Max(Abs(a), Abs(b))
    }
  }

  def LeastCommonMultiplier(a: BigInt, b: BigInt): BigInt = {
    @tailrec
    def LeastHelper(a: BigInt, b: BigInt, greater: BigInt = Max(a, b)): BigInt = {
      if (Modulo(greater, a) == 0 && Modulo(greater, b) == 0)
        greater
      else
        LeastHelper(a, b, greater + 1)
    }

    try {
      if (a == 0 || b == 0)
        throw new Exception(DivisorCantBeZeroException + " (at lcm)")
      LeastHelper(Abs(a), Abs(b))
    }
    catch {
      case e: Exception =>
        println(e.getMessage)
        Max(Abs(a), Abs(b))
    }
  }
}

