import scala.util.control.Exception
// test haha
object Integers {
    val constant = 42

    def main(args:Array[String]):Unit = {
        Factional(1)
    }

    /**
     * add 1 to number x
     */
    def Increment(x:Int): Int =
        x + 1

    /**
     * if bigger than constant: true
     */
    def BiggerThanConstant(input:Int):Boolean =
        input > constant

    /**
     * Gets square of x
     */
    def Square(x:Int):Int =
        x*x

    /**
     * x plus y
     */
    def Max(x:Int, y:Int):Int = {
        if (x > y)
            return x
        y
    }

    /**
     * get absolute of x
     */
    def Abs(x:Int):Int = {
        if (x < 0)
            return x * -1
        x
    }

    /**
     * Rest of Division for x divided by y
     */
    def ReturnRest(x:Int, y:Int):Int =
        x-((x/y)*y)

    /**
     * sum of all numbers until n
     * REQUIRES: n>=0
     */
    def Factional(n:Int):Int = {
        if (n > 0) {
            var sum = 0
            for (i <- 0  to n )
                sum += i
            return sum
        }
        // if Factional(0) return 1
        1
    }

    /**
     * Return result of exponent
     */
    def POWEEEERRR(num:Int, exponent:Int):Int = {
        var result = 0

        if (exponent == 0)
            result = 1
        else if (num != 0) {
            result = num
            for (i <- 1 until exponent)
                result *= num
        }
        result
    }

    /**
     * Divide the number into digits and add each square value together
     */
    def SumOfEachSquaredDigitInNumber(n:Int):Int = {
        var result = 0

        var numberAsString = n.toString
        numberAsString = numberAsString.replace("-", "")

        numberAsString.foreach(num =>
            result += num.asDigit * num.asDigit)
         result
    }

    /**
     * If x*i divided by m returns 1 from ReturnRest return i
     * REQUIRES: m>x
     */
    def Inverse(x:Int, m:Int):Int = {
        var result = 0

        if (m<=x)
            return 0

        var i = 1
        while (!(result == i)){
            if (ReturnRest(x*i, m) == 1)
                result = i
            else
                i += 1
            if (i >= 1000000)
                throw new Exception("Counted until 1000000 and no match found")
        }
        result
    }

    /**
     * Returns bool for if input is an even number
     */
    def IsEven(input:Int):Boolean =
        ReturnRest(input, 2) == 0

    /**
     * Returns bool if input is an off number
     */
    def IsOdd(input:Int):Boolean =
        ReturnRest(input, 2) == 1
}