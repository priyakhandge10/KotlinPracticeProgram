import java.util.*

fun main(args: Array<String>){
    println("Enter the number:")
    val reader = Scanner(System.`in`)
    val num = reader.nextInt()
    if (num % 2 == 0)
        println("number is even")
        else
        println("number is odd")
}
