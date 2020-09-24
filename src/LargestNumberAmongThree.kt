import java.util.*

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the first number:")
    val first:Int = reader.nextInt()
    println("Enter the second number:")
    val second:Int = reader.nextInt()
    println("Enter the third number:")
    val third:Int = reader.nextInt()

    if (first >= second && first >= third)
        println("$first number is largest")
        else if (second >= first && second >= third)
        println("$second number is largest")
        else
        println("$third number is largest")
}