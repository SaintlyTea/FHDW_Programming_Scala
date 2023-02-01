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

  // Start of task 26 and 27

  /**
   * returns opposite of x
   * @param x:Boolean
   * @return
   */
  def Not(x:Boolean):Boolean = !x

  /**
   * return true if only one is true
   * @param x:Boolean
   * @param y:Boolean
   * @return
   */
  def Xor(x:Boolean, y:Boolean):Boolean = if(x == y) false else true

  /**
   * x implies y
   * @param x:Boolean
   * @param y:Boolean
   * @return
   */
  def Implies(x:Boolean, y:Boolean):Boolean = if (x && !y) false else true

  /**
   * are equal
   * @param x:Boolean
   * @param y:Boolean
   * @return
   */
  def Equivalent(x:Boolean, y:Boolean):Boolean = if (x == y) true else false

  /**
   * makes character into the Unicide number
   * @param c:Char
   * @return
   */
  def ToUnicode(c:Char):Int = c

  /**
   * makes number of unicode to the character
   * @param x:Int
   * @return
   */
  def ToCharacter(x:Int):Char = x.toChar

  // End of task 26 and 27


}