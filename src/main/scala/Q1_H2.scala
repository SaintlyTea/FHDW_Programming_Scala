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
   * This is the IsOptimusPrime/IsPrime function, it will determine whether the number is a prime-number or not
   *
   * @param truck :Int
   * @return if truck is OptimusPrime: true
   */
  def IsOptimusPrime(truck: Int): Boolean = {
    false
  }

  /**
   * This is the NumberOfOptimusPrimes/NumberOfPrimes function, it will count how many prime-numbers there are until truckCount
   *
   * @param truckCount :int
   * @return How many OptimusPrimes there are in the truckCount
   */
  def NumberOfOptimusPrimes(truckCount: Int): Int = {
    0
  }

  /**
   * This is the UnoReverse/Mirror function, it will spin the number 180 degrees
   *
   * @param num :Int
   * @return number but read from right to left
   */
  def UnoReverse(num: Int): Int = {
    0
  }
}
