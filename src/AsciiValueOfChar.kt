import java.util.*

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the ASCII value of char:")
    val c = reader.next()[0]
    val ascii:Int = c.toInt()
    println("ASCII value of char $c is $ascii")
}