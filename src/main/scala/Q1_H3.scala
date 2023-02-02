import scala.annotation.tailrec
import scala.language.postfixOps

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
        1 * Production(x + 1, (x + y) / 2) * Production((x + y) / 2 + 1, y)
      else
        x * Production(x + 1, (x + y) / 2) * Production((x + y) / 2 + 1, y)
    }

    Production(x, y - 1)
  }

  /**
   * this is the Fibonacci but end-recursive
   *
   * @param n : Int
   * @return
   */
  def Fibonacci(n: BigInt): BigInt = {
    @tailrec
    def Fibo(n: BigInt, x: BigInt = 0, y: BigInt = 1): BigInt = {
      if (n == 1)
        return y
      Fibo(n - 1, y, x + y)
    }

    if (n < 1)
      return 0
    Fibo(n)
  }

  /**
   * idk why we have this so i will comment this out.
   *
   * @return
   */
  /*def PressF(): Int = {
    0
  }*/

  // Start of task 26 - 28

  /**
   * returns opposite of x
   *
   * @param x :Boolean
   * @return
   */
  def Not(x: Boolean): Boolean = !x

  /**
   * return true if only one is true
   *
   * @param x :Boolean
   * @param y :Boolean
   * @return
   */
  def Xor(x: Boolean, y: Boolean): Boolean = if (x == y) false else true

  /**
   * x implies y
   *
   * @param x :Boolean
   * @param y :Boolean
   * @return
   */
  def Implies(x: Boolean, y: Boolean): Boolean = if (x && !y) false else true

  /**
   * are equal
   *
   * @param x :Boolean
   * @param y :Boolean
   * @return
   */
  def Equivalent(x: Boolean, y: Boolean): Boolean = if (x == y) true else false

  /**
   * makes character into the Unicide number
   *
   * @param c :Char
   * @return
   */
  def ToUnicode(c: Char): Int = c

  /**
   * makes number of unicode to the character
   *
   * @param x :Int
   * @return
   */
  def ToCharacter(x: Int): Char = x.toChar

  /**
   * connects 2 string
   *
   * @param x :String
   * @param y :String
   * @return
   */
  def MyConCat(x: String, y: String): String = x + y

  def MyConCatStringyChar(x: String, y: Char): String = x + y

  def MyConCatChar(x:Char, y:Char):String = x + "" + y

  /**
   * returns the first letter of a string
   *
   * @param x :String
   * @return
   */
  def MyHead(x: String): String = x.head.toString

  /**
   * returns everything except the first letter
   *
   * @param x :String
   * @return
   */
  def MyTail(x: String): String = x.tail

  // end of Task 26 - 28

  /**
   * returns length of string
   *
   * @param x :String
   * @return
   */
  def MyLength(x: String): Int = {
    @tailrec
    def getLength(x: String, i: Int = 0): Int = {
      if (x == "")
        i
      else
        getLength(MyTail(x), i + 1)
    }

    getLength(x)
  }

  /**
   * turns string around
   *
   * @param x :String
   * @return
   */
  def StringReverse(x: String): String = {
    def Reverse(stringy: String, result: String = ""): String = {
      if (stringy != "") {
        return Reverse(MyTail(stringy), MyHead(stringy) + result)
      }
      result
    }

    Reverse(x)
  }
}