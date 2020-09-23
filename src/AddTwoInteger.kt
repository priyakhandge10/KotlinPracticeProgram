import java.util.*

fun main(args: Array<String>){
    var num1:Int = 10
    num1 = 45
    var num2:Int = 45
    num2 = 20
    val sum:Int = num1 + num2
    println("Addition of $num1 and $num2 is: $sum")

    val reader = Scanner(System.`in`)
    println("Enter the first number:")
    val a: Int = reader.nextInt()
    println("Enter the second number:")
    val b: Int = reader.nextInt()
    val add: Int = a + b
    println("addition of $a and $b is: $add")
}