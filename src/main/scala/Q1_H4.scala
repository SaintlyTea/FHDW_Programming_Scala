import Datatypes.Fractions.Fraction
import Q1_H1._
import Q1_H3._

import scala.annotation.tailrec

object Q1_H4 {

  /**
   * Returns the index of a character in a string the first time it appears
   *
   * @param stringy :String
   * @param chary   :Char
   * @param index   :Int
   * @return
   */
  @tailrec
  def MyIndexOf(stringy: String, chary: Char, index: Int = 0): Int = {
    if (MyHead(stringy) == chary)
      index
    else if (MyTail(stringy) == "")
      throw new NoSuchElementException("NoSuchElementException: the char was not found in the string")
    else
      MyIndexOf(MyTail(stringy), chary, index + 1)
  }

  /**
   * swap a string from where the character says
   *
   * @param s :String
   * @param c :Char
   * @return
   */
  def SwapAt(s: String, c: Char): String = {
    @tailrec
    def ReturnHalf(stringy: String, charaptor: Char, currentIndex: Int): String = {
      if (currentIndex == 0)
        MyTail(stringy)
      else
        ReturnHalf(MyTail(stringy), charaptor, currentIndex - 1)
    }

    try {
      val index = MyIndexOf(s, c)
      ReturnHalf(s, c, index) + c + StringReverse(ReturnHalf(StringReverse(s), c, MyLength(s) - (index + 1)))
    }
    catch {
      case _: NoSuchElementException => s
    }
  }

  /**
   * Following 2 functions count how many times the char/string is in the string
   *
   * @param s :String
   * @param c :Char
   * @return
   */
  def ContainsHowOften(s: String, c: Char): Int = {
    @tailrec
    def HowManyTimes(stringy: String, chary: Char, counter: Int = 0): Int = {
      if (MyLength(stringy) == 0)
        counter
      else if (MyHead(stringy) == chary)
        HowManyTimes(MyTail(stringy), chary, counter + 1)
      else
        HowManyTimes(MyTail(stringy), chary, counter)
    }

    HowManyTimes(s, c)
  }

  def ContainsHowOften(baseString: String, toCompare: String): Int = {
    @tailrec
    def countHowOften(baseString: String, toCompare: String, counter: Int = 0, chain: String = toCompare, remember:String = ""): Int = {
      if (baseString == "")
        counter
      else if (MyHead(baseString) == MyHead(chain)) {
        if (MyTail(chain) == "") {
          if (MyLength(toCompare) == 1)
            countHowOften(MyTail(baseString), toCompare, counter + 1)
          else
            countHowOften(MyTail(remember) + baseString, toCompare, counter + 1)
        }
        else
          countHowOften(MyTail(baseString), toCompare, counter, MyTail(chain), remember + MyHead(chain))
      }
      else
        countHowOften(MyTail(baseString), toCompare, counter)
    }
    if(baseString == "" || toCompare == "")
      return 0
    countHowOften(baseString, toCompare)
  }

  /**
   * Shift the last letter to the front
   * @param s:String
   * @return
   */
  def MyShifty(s: String): String = MyHead(StringReverse(s)) + StringReverse(MyTail(StringReverse(s)))


  /**
   * checks if s1 is lower in alphabetic order than s2
   * @param s1:String
   * @param s2:String
   * @return
   */
  @tailrec
  def MyLess(s1: String, s2: String): Boolean = {
    if ((s2 == "" && s1 != "") || (s1 == "" && s2 == ""))
      false
    else if(s1 == "" && s2 != "")
      true
    else if(MyHead(s1) > MyHead(s2))
      false
    else if (MyHead(s1) == MyHead(s2))
      MyLess(MyTail(s1), MyTail(s2))
    else
      true
  }

  /**
   * Following methods are to convert different types of values to strings
   *
   * @note this needs to be done "correctly"
   * @return
   */
  def MyToString(number: Int, stringy: String = ""): String = {
    if (number == 0)
      ""
    else
      MyConCat(MyToString(number / 10, stringy),
        MyConCat(stringy, ToCharacter(ToUnicode('0') + Modulo(number, 10))))
  }

  def MyToString(number: BigInt, stringy: String = ""): String = {
    if (number == 0)
      ""
    else
      MyConCat(MyToString(number / 10, stringy),
        MyConCat(stringy, ToCharacter(ToUnicode('0') + Modulo(number, 10:BigInt))))
  }


  def MyToString(booly: Boolean): String = if (booly) "true" else "false"

  def MyToString(stringy: String): String = stringy

  def MyToString(fraction:Fraction):String = MyConCat(MyConCat(MyToString(fraction.Enumerator), "/"), MyToString(fraction.Denominator))

  // End of MyToString

  

}
