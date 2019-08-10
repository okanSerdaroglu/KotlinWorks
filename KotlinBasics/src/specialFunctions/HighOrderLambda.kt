package specialFunctions

class TestLambda {

    fun calculateTotal(numberOne: Int, numberTwo: Int, action: (Int, Int) -> Int) {

        val sum = action(numberOne, numberTwo)
        println(sum)

    }

    fun writeReverse(article: String, myFunc: (String) -> String) {

        println(myFunc(article))

    }

}

fun main() {

    val testLambda = TestLambda()

    testLambda.calculateTotal(9, 12) { a: Int, b: Int -> a + b }

    val lambdaForString = { article: String -> article.reversed() }

    testLambda.writeReverse("Hello", lambdaForString)
    testLambda.writeReverse("Hello") { char: String -> char.reversed() }
    testLambda.writeReverse("Hello") { it.reversed() } // there is only one parameter here so we can use it keyword


}