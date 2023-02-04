import Q1_H3._

import scala.annotation.tailrec

object Q1_H4 {

  /**
   * Returns the index of a character in a string the first time it appears
   * @param stringy:String
   * @param chary:Char
   * @param index:Int
   * @return
   */
  @tailrec
  def FindFirstOccurrence(stringy: String, chary: Char, index: Int = 0): Int = {
    if (MyHead(stringy) == chary)
      index
    else if (MyTail(stringy) == "")
      throw new NoSuchElementException("CouldNotFindCharError: the char was not found in the string")
    else
      FindFirstOccurrence(MyTail(stringy), chary, index + 1)
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
    def ReturnHalf(stringy: String, charaptos: Char, currentIndex: Int): String = {
      if (currentIndex == 0)
        MyTail(stringy)
      else
        ReturnHalf(MyTail(stringy), charaptos, currentIndex - 1)
    }

    try {
      val foundAt = FindFirstOccurrence(s, c)
      ReturnHalf(s, c, foundAt) + c + StringReverse(ReturnHalf(StringReverse(s), c, MyLength(s) - (foundAt + 1)))
    }
    catch {
      case e: NoSuchElementException => s
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

  def ContainHowOften(s1: String, s2: String): Int = {
    1
  }


  /**
   * Following methods are to convert different types of values to strings
   *
   * @return
   */
  def MyToString(number: Int): String = "" + number

  def MyToString(booly: Boolean): String = "" + booly

  def MyToString(stringy: String): String = stringy

  def MyToString(chary: Char): String = "" + chary

  // End of MyToString

}
