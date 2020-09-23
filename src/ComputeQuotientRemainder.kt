import java.util.*

fun main(args: Array<String>){
    val a:Int = 4
    val b:Int = 2
    val quotient = a / b
    val remainder = a % b
    println("Quotient is $quotient")
    println("Remainder is $remainder")

    val reader = Scanner(System.`in`)
    println("enter the first number:")
    val q: Float = reader.nextFloat()
    println("enter the second number:")
    val r:Float = reader.nextFloat()
    val qu = q / r
    val re = q % r
    println("quotient is $qu")
    println("remainder is $re")
}