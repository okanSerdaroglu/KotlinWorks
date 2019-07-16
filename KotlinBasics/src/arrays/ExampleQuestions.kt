package arrays

fun main() {

    /** get two numbers from user then calculate them */

    println("Enter First Number : ")
    val number1 : Int = readLine()!!.toInt()
    println("Enter Second Number : ")
    val number2 : Int = readLine()!!.toInt()

    println("$number1 ve $number2 toplamı : " + (number1 + number2))
    println("$number1 ve $number2 farkı : " + (number1 - number2))
    println("$number1 ve $number2 çarpımı : " + (number1 * number2))
    println("$number1 ve $number2 bölümü : " + (number1.toDouble() / number2.toDouble()))

}