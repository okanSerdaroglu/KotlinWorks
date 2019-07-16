package review

/**
 *  write type of entered triangle
 */

fun main() {

    println("Enter first edge : ")
    var firtsEdge : Int = readLine()!!.toInt()

    println("Enter second edge : ")
    var secondEdge : Int = readLine()!!.toInt()

    println("Enter thirt edge : ")
    var thirtEdge : Int = readLine()!!.toInt()


    if ( (firtsEdge == secondEdge)
        && (firtsEdge == thirtEdge)) {
        println("equilateral triangle")
    } else if ( (firtsEdge != secondEdge)
        && (firtsEdge != thirtEdge)
        && (secondEdge != thirtEdge)) {
        println("triangular")
    } else {
        println("isosceles triangle")
    }


}