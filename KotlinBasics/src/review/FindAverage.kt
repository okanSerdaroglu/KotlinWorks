package review

/** find average of entered 3 numbers */

fun main() {

    println("Enter first number ")
    val number1: Int = readLine()!!.toInt() // readLine can be null

    println("Enter second number ")
    val number2: Int = readLine()!!.toInt()

    println("Enter thirt number ")
    val number3: Int = readLine()!!.toInt()

    val average: Double = (((number1 + number2 + number3)).toDouble()) / 3
    println(average)

}