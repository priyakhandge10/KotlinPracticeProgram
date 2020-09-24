import java.util.*

fun main(args: Array<String>) {
    println("enter the year:")
    val reader = Scanner(System.`in`)
    val year = reader.nextInt()
    var leap = false
    leap = if (year % 4 == 0) {
        if (year % 100 == 0 ){
            year % 400 == 0
        }else
            true
    }else
        false
    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}