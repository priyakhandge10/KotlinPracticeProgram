fun main(args: Array<String>){
    println("Enter the charater:")
    val ch = readLine()
    when(ch!!.toCharArray()[0]){
        'a', 'e','i','o','u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }

}