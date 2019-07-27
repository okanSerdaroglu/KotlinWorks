package classes

class Rectangle(private var width: Int = 0, private var lenght: Int = 0) {

    fun calculateRectangleArea(): Int {

        return this.width * this.lenght

    }

}

fun main() {

    val rectangle = Rectangle(5, 10)

    println(rectangle.calculateRectangleArea())

    val rectangleTwo = Rectangle(6, 12)

    println(rectangleTwo.calculateRectangleArea())

    val rectangleThree = Rectangle(lenght = 10, width = 4)

    println(rectangleThree.calculateRectangleArea())

    val rectangleFour = Rectangle() // default values are 0

    println(rectangleFour.calculateRectangleArea())

}