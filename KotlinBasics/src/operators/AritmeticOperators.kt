package operators

fun main() {

    var number1 : Int = 15
    var number2 = 2

    println("sum of numbers = " + (number1 + number2))
    println("difference of numbers = $number1 - $number2")
    println("difference of numbers =  ${number1 - number2}")

    println("product of numbers = " + (number1 * number2))
    println("divide of numbers = " + (number1 / number2))

    println("product of numbers using $ char =  ${number1 * number2}")
    println("divide of numbers using $ char =  ${number1 / number2}")

    println("mod = ${number1 % number2}")


}