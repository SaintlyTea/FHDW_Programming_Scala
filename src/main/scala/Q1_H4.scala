import Q1_H3._

import scala.annotation.tailrec

object Q1_H4 {

  /**
   * swapt a string from where the character says
   * @param s:String
   * @param c:Char
   * @return
   */
  def SwapAt(s:String, c:Char): String = {
    @tailrec
    def SwapAtER(stringy:String, Charaptos:Char):String = {
      if (MyHead(stringy) == Charaptos || MyToString(MyHead(stringy)) == "")
        MyTail(stringy)
      else
        SwapAtER(MyTail(stringy), c)
    }
     SwapAtER(s, c) + c + StringReverse(SwapAtER(StringReverse(s), c))
  }

  /**
   * Following methods are to convert different types of values to strings
   * @return
   */
    def MyToString(number:Int):String = "" + number
    def MyToString(booly:Boolean):String = "" + booly
    def MyToString(stringy:String):String = stringy
    def MyToString(chary:Char):String = "" + chary

  // End of MyToString

}
