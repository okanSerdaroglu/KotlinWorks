package arrays

fun main() {

    var numbers = 1..20
    var chars = 'a'..'z'

    var numbers2 = 20..1
    var chars2 = 'z'..'a'

    var numbers3 = 1.rangeTo(20)
    var chars3 = 'z'.downTo('a')
    println(chars3.contains('s'))

    var numbers4 = 0.rangeTo(100).step(5)



    println(numbers4.step)
    var numbers4reverse = 100.rangeTo(0).step(5)

    var isIncludeElemet = 11 in numbers4reverse

    println("is include 11 ${isIncludeElemet}")

    println(numbers4reverse.first)
    println(numbers4reverse.last)
    println(numbers4reverse.step)

}