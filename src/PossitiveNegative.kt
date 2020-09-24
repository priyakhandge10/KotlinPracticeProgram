import java.util.*

fun main(args: Array<String>){
    println("enter the number:")
    val reader =  Scanner(System.`in`)
    val number = reader.nextFloat()
    when {
        number > 0.0 -> println("$number is positive")
        number < 0.0 -> println("$number is negative")
        else -> println("$number is 0")
    }
}