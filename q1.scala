object interest{
    def main(args: Array[String]) = {
        val input:Double = args(0).toInt
        input match{
            case input if input <0 => println(0)
            case input if input <20000 => println(0.02*input)
            case input if input <200000 => println(0.035*input)
            case input if input <2000000 => println(0.04*input)
            case input if input >=2000000 => println(0.065*input)
        }
    }
}
