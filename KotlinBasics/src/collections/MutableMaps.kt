package collections

fun main() {

    val immutableMap = hashMapOf("1" to "okan","2" to "osman") /* hash map of can be MutableMapOf. Both are the same */
    immutableMap.put("3","Ali")

    println(immutableMap["2"])

    immutableMap["4"] = "melek" /* set */
    immutableMap["1"] = "volkan" /* put */

    println("*******")

    for (element in immutableMap){
        println(element.value)
    }

    immutableMap.remove("2")
    println("******")
    for (element in immutableMap){
        println(element.value)
    }

}