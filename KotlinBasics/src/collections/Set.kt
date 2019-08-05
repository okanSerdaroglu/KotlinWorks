package collections

// setOf, mutableSetOf

fun main() {

    val immutableSet = setOf("okan","osman","ali","okan") // don't list repeated values

    for (element in immutableSet) {
        println(element)
    }

    println("********")

    val mutableSet = mutableSetOf<Int>()

    mutableSet.add(9)
    mutableSet.add(6)
    mutableSet.add(1)
    mutableSet.add(6) /* sets don't add repeated values */
    mutableSet.add(9)

    println(mutableSet.size)


}