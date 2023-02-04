import Q1_H3._

import scala.annotation.tailrec

object Q1_H4 {
  def SwapAt(s:String, c:Char): String = {
    @tailrec
    def SwapAtER(stringy:String, Charaptos:Char):String = {
      if (MyHead(stringy) == Charaptos || MyHead(stringy).toString == "")
        MyTail(stringy)
      else
        SwapAtER(MyTail(stringy), c)
    }
     SwapAtER(s, c) + c + StringReverse(SwapAtER(StringReverse(s), c))
  }
}
