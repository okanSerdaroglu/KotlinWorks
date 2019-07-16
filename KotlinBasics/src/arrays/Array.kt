package arrays

fun main() {


    var numbers : Array<Int> = arrayOf(1,2,4,5,6)

    println(numbers)
    println(numbers [0])
    println(numbers.get(2))
    println("size of numbers : ${numbers.size}")

    var names : Array<String> = arrayOf("okan","büşra","bakdağ")

    println(names[0])

    var variables : Array<Any> = arrayOf("okan",1,false) /** you can put any type of variables in an array Kotlin */

    println(variables[1])

    var days = arrayOf("monday","friday","tuesday","wednesday")

    for( day in days){
        println("Today is $day")
    }
}