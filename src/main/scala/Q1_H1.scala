import Exceptions.ExceptionMessages._

// test haha
object Q1_H1 {
  val constant = 42
  val divisorIsZeroError = "The divisor cannot be 0"
  def main(args: Array[String]): Unit = {

  }

  /**
   * add 1 to number x
   */
  def Increment(x: Int): Int = x + 1

    /**
   * if bigger than constant: true
   */
  def BiggerThanConstant(input: Int): Boolean =
    input > constant

  /**
   * Gets square of x
   */
  def Square(x: Int): Int =
    x * x

  /**
   * Returns the bigger number
   */
  def Max(x: Int, y: Int): Int = {
    if (x > y)
      return x
    y
  }

  def Max(x: BigInt, y: BigInt): BigInt = {
    if (x > y)
      return x
    y
  }

  /**
   * get absolute of x
   */
  def Abs(x: Int): Int = {
    if (x < 0)
      return x * -1
    x
  }

  def Abs(x: BigInt): BigInt = {
    if (x < 0)
      return x * -1
    x
  }

  /**
   * Rest of Division for x divided by y
   */
  def Modulo(x: Int, y: Int): Int = try {
    if (y == 0)
      throw new Exception(DivisorCantBeZeroException)
    else
      x - ((x / y) * y)
  }
  catch{
    case e: Exception =>
      println(e.getMessage)
      0
  }

  def Modulo(x: BigInt, y: BigInt): BigInt = {
    try {
      if (y == 0)
        throw new Exception(DivisorCantBeZeroException)
      else
        x - ((x / y) * y)
    }
    catch {
      case e: Exception =>
        println(e.getMessage)
        0
    }
  }

  /**
   * Return result of exponent
   */
  def POWEEEERRR(num: Int, exponent: Int): Int = {
    var result = 0

    if (exponent == 0)
      result = 1
    else if (num != 0) {
      result = num
      for (_ <- 1 until exponent)
        result *= num
    }
    result
  }

  /**
   * Divide the number into digits and add each square value together
   */
  def SumOfEachSquaredDigitInNumber(n: Int): Int = {
    var result = 0

    var numberAsString = n.toString
    numberAsString = numberAsString.replace("-", "")

    numberAsString.foreach(num =>
      result += Square(num.asDigit))
    result
  }

  /**
   * TODO: finish this def
   */
  def SumOfEachSquaredDigitInNumberWithModulo(n: Int): Int = {
    var result = 0
    var number = n
    while (number > 10) {
      result += Square(Modulo(number, 10))
      number /= 10
    }
    0
  }


  /**
   * If x*i divided by m returns 1 from Modulo return i
   * REQUIRES: m>x
   */
  def Inverse(x: Int, m: Int): Int = {
    var result = 0

    if (m <= x)
      throw new Exception("x needs to be lower than m")

    var i = 1
    while (!(result == i)) {
      if (Modulo(x * i, m) == 1)
        result = i
      else
        i += 1
      if (i >= 1000000)
        throw new Exception("Counted until 1000000 and no match found")
    }
    result
  }

  /**
   * Returns true if input is an even number
   */
  def IsEven(input: Int): Boolean =
    Modulo(input, 2) == 0

  /**
   * Returns true if input is an odd number
   */
  def IsOdd(input: Int): Boolean =
    !IsEven(input)
}