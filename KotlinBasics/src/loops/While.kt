package loops

fun main() {

    fun main() {

        for (i in 1..10) {
            //println(i)
        }

        var i = 1

        while (i <= 10) {
            println(i)
            i++
        }

        /** sum odd numbers between 1 and 100 */

        var sum = 0
        for (number in 1..100) {
            if (number % 2 == 0) {
                sum += number
            }
        }

        println("number of odd numbers : $sum")

        var k = 1
        var numOfOddNumbers = 0
        while (k <= 100) {
            if (k % 2 == 1) {
                numOfOddNumbers += k
            }
            k++
        }

        println("number of even numbers : $numOfOddNumbers")

        var l = 1

        do {
            println("doWhile worked l:$l")
        } while (l < 1)

    }
}