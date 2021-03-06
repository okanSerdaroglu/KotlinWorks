package controlAndLoopStructures

fun main() {

    /** when structure is the same with switch in java
     *  you don't have to use break keyword
     * */

    println("enter your note")

    val result = when (readLine()!!.toInt()) {

        in 0..44 -> {
            println("you get 1")
            'E'
        }

        in 44..55 -> {
            println("you get 2")
            'D'
        }

        in 55..70 -> {
            println("you get 3")
            'C'
        }

        in 70..85 -> {
            println("you get 4")
            'B'
        }

        in 85..100 -> {
            println("you get 5")
            'A'
        }

        else -> {
            println("error")
            'X'
        }

    }

    if (result == 'X') {
        println("you entered wrong value")
    } else {
        println("result : $result")

    }

}