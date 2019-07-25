package methods

import kotlin.math.*

fun main() {

    println(Math.E)
    println(Math.PI)

    println(abs(-43))

    println(ceil(3.4))
    println(floor(3.4))

    println(2.0.pow(5.0))

    println(sqrt(81.0))

    println(max(8, 4))

    println((Math.random() * 100).toInt()) // math randrom generates numbers between 1 and 100

    // generate two numbers and write firstly bigger number

    val numberOne = (Math.random() * 50).toInt()
    val numberTwo = (Math.random() * 50).toInt()

    println(max(numberOne, numberTwo))

    for (i in 1..10) {
        println((Math.random() * 1000).toInt())
    }

}