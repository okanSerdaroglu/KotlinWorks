package specialFunctions

fun main() {

    println(findFactorial(5))
    println("extension : " + 6.findFactorialExt())
    val article = "okan      serdaroglu \t   Java"
    println(article)
    println(article.editSpaces())

}

fun findFactorial(number: Int): Int {

    var result = 1

    for (i in 1..number) {
        result *= i
    }

    return result
}

fun Int.findFactorialExt(): Int {

    var result = 1

    for (i in 1..this) {
        result *= i
    }

    return result
}

fun String.editSpaces(): String {

    val regex = Regex("\\s+") /* this means spaces greater than 1 */
    return regex.replace(this, " ")

}