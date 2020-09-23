import java.util.*

fun main(args: Array<String>){
    val a:Float = 2f
    val b:Float = 4f
    val mul:Float = a * b
    println("multiply $a and $b is: $mul")

    val reader = Scanner(System.`in`)
    println("enter the first number:")
    val num1: Float = reader.nextFloat()
    println("enter the second number:")
    val num2:Float = reader.nextFloat()
    val mul1: Float = num1 * num2
    println("multiply of two number is: $mul1")
}