package operators

fun main() {

    var isRandom1 = true
    var isRandom2 = false
    println( isRandom1
            && isRandom2)

    println(isRandom1
            || isRandom2)

    println(!(isRandom1
            || isRandom2))

    var number = 16

    println(number++) // firstly print number then increase number
    println(number)

    println(--number)
    println(number)


}