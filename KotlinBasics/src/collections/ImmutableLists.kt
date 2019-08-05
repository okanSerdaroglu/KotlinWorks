package collections

//List
// mutable immutable

// immutable : ListOf or listOfNotNull

fun main() {

    val listOfList = listOf(2,3,4,"okan",true,5.7)
    for (element in listOfList){
        println(element)
    }
    println(listOfList[3]) /* can not change elements */

    val s1 = listOfList[0] as Int
    val s2 = listOfList[3] as String

    println("$s1 + $s2")
    println(listOfList.size)

    val listOfNotNullList = listOfNotNull(2,3,4,"okan",true,5.7,null,null) /* null values don't include in listofNotNull */
    println(listOfNotNullList.size)

}