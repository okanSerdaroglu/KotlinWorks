package controlAndLoopStructures

fun main() {

    /*
    var age = 5
    if (age > 18) {
        println("you are older than 18")
        println("you can get driving license")
    } else if (age > 15 && age < 18) {
        println("you are going to be 18 in a few years")
    } else {
        println("you are too young")
    }
    println("end of code block")*/

    println("Enter your note")
    var note = readLine()!!.toInt()

    var charNote = ""

    var result = if (note in 0..44){
        println("you get 1 point")
        charNote = "E"
        1
    } else if (note in 44..55) {
        println("you get 2 points")
        charNote = "D"
        2
    } else if (note in 55..70) {
        println("you get 3 points")
        charNote = "C"
        3
    } else if (note in 70..85) {
        println("you get 4 points")
        charNote = "B"
        4
    } else if (note in 85..100) {
        println("you get 5 points")
        charNote = "A"
        5
    } else {
        println("error")
        charNote = "Error"
        0
    }

    println("charNote : $charNote")
    println("result : $result")

    /** you can change var values in if blocks */

}