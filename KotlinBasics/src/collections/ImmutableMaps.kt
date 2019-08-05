package collections

fun main() {

    val map = mapOf(1 to "okan",2 to "osman",3 to "hasan") /* can not change */
    println("key value 2 :  ${map[2]}")

    for (str in map) {
        println(str)
        println(str.key)
        println(str.value)
    }

    val searching = readLine()!!
    if (map.containsValue(searching)){
        println("map includes value")
    } else {
        println("map does not include value")
    }

}