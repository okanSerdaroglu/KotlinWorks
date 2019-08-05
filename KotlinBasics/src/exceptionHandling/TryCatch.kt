package exceptionHandling

import java.lang.Exception

fun main() {

    val array = Array(3) { 0 }

    array[0] = 0
    array[1] = 1
    array[2] = 2

    exceptionalOne(array)

    try {
        for (i in 0..3) {
            println(array[i])
        }
    } catch (exception: Exception) {
        println("error occured : + $exception")
    }

    println("programme end")

}

fun exceptionalOne(array: Array<Int>) {

    println("exceptionalOne started")

    exceptionalTwo(array)

    println("exceptionalOne end")

}

fun exceptionalTwo(array: Array<Int>) {

    println("exceptionalTwo started")

    try {
        for (i in 0..3) {
            println(array[i])
        }
    }catch (exception:Exception) {

    }


    println("exceptionalTwo end")

}
