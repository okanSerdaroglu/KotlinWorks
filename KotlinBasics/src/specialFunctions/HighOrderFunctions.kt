package specialFunctions

class AddNumbers {


    fun addTwoNumbers(numberOne: Int, numberTwo: Int) {
        val total = numberOne + numberTwo
        println(total)
    }

    fun addTwoNumbers(numberOne: Int, numberTwo: Int, action: ShowTotal) {
        val total = numberOne + numberTwo
        action.showTotalsOfTwoNumbers(total)
    }

    /* this method has 3 input parameters. First one is an int, second one is an int
       Third one is a method which takes an input int and returns no value (Unit)
     */
    fun addTwoNumbers(numberOne: Int, numberTwo: Int, action: (Int) -> Unit) {

        val total = numberOne + numberTwo
        action(total)
    }


}

fun main() {

    val addNumbers = AddNumbers()
    val total = addNumbers.addTwoNumbers(12, 22)

    /* anonymous Inner Class */
    addNumbers.addTwoNumbers(33, 44, object : ShowTotal {
        override fun showTotalsOfTwoNumbers(total: Int) {

            println(total)

        }

    })

    /* lambda expression, this means a function with no name.number is an input parameter.
       then we use ->. Then we write body of the function  */

    val lambdaExpression = { number: Int -> println(number) }
    addNumbers.addTwoNumbers(13, 33, lambdaExpression)


}

interface ShowTotal {

    fun showTotalsOfTwoNumbers(total: Int)


}