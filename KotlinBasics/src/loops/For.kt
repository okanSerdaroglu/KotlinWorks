package loops

fun main() {

    /** list, range, string, array */

    for (i in 1..10) {
        println(i)
    }

    var name = "okan"
    for (i in name) {
        if (i != name.last()) {
            print("$i,")
        } else {
            println(i)
        }
    }

    var numbers = arrayOf(5, 10, 15, 20)
    var sum = 0
    for (number in numbers) {
        println(number)
        sum += number
    }

    println(sum)


    for (i in 1..3) {

        for (j in 1..3) {

            println("$i * $j = " + i * j)

        }

    }

}