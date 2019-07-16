package review

/** find average note with midterm and final exams */

fun main() {

    println("midterm note : ")
    var midterm : Double = readLine()!!.toDouble()
    println("final note : ")
    var final : Double = readLine()!!.toDouble()

    var sum = (midterm*0.4) + (final*0.6)

    if (sum >= 50) {
        println("passed")
    } else {
        println("failed")
    }

}