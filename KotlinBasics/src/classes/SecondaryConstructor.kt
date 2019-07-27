package classes

class Square {

    private var edge: Int = 0

    constructor() {
        this.edge = 0
    }

    constructor(edge: Int) {
        this.edge = edge
    }

    fun calculateArea(): Int {

        return edge * edge
    }

}

fun main() {

    val squareOne = Square()
    println(squareOne.calculateArea())

    val squareTwo = Square(5)
    println(squareTwo.calculateArea())

}