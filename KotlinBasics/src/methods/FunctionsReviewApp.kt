package methods

/** take inputs from user as a menu 1,2,3,4
 *  if user clicks 1 sum two numbers , if click 2 take difference of numbers
 *  if user clicks 3 multiply numbers, if clicks 4 divide numbers
 */

fun main() {

    println("enter first number")
    val numberOne = readLine()!!.toInt()
    println("enter second number")
    val numberTwo = readLine()!!.toInt()

    println("enter your selection")
    val selection = readLine()!!.toInt()

    println(calculateNumbers(numberOne, numberTwo, selection))

}

fun calculateNumbers(numberOne: Int, numberTwo: Int, selection: Int): Int {

    return when (selection) {
        1 -> {
            numberOne + numberTwo
        }

        2 -> {
            numberOne - numberTwo
        }

        3 -> {
            numberOne * numberTwo
        }

        4 -> {
            numberOne / numberTwo
        }

        else -> {
            return 0
        }
    }

}