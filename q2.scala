object patternMatch{
    def main(args: Array[String]) = {
        val input:Int = args(0).toInt
        input match{
            case input if input == 0 => println("Zero is input")
            case input if input < 0 => println("Negative input")
            case input if input %2 == 0 => println("input is even")
            case input  if input %2 ==1 => println("input is odd")
        }
    }
}