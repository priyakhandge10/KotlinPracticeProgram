import java.util.*

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("enter the first number:")
    var num1: Int = reader.nextInt()
    println("enter the second number:")
    var num2:Int = reader.nextInt()
    println("--Before swap the number--")
    println("First number is: $num1")
    println("Second number is: $num2")

    val temp = num1
    num1 = num2
    num2 = temp
    println("--After the swap number--")
    println("First number is: $num1")
    println("Second number is: $num2")
}
