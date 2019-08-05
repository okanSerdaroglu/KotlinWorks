package generic

abstract class GeometricShape {

    abstract fun calculateArea(): Int

}

class Square(var edge: Int) : GeometricShape() {

    override fun calculateArea(): Int {
        return edge * edge
    }

}

class Rectangle(var lenght: Int, var width: Int) : GeometricShape() {

    override fun calculateArea(): Int {
        return lenght * width
    }

}

fun main() {

    val squareOne = Square(6)
    val squareTwo = Square(5)
    val biggerSquare = compare(squareOne, squareTwo)
    println(biggerSquare.calculateArea())
    println("*********")
    val rectangleOne = Rectangle(3, 5)
    val rectangleTwo = Rectangle(4, 3)
    val biggerRectangle = compare(rectangleOne, rectangleTwo)
    println(biggerRectangle.calculateArea())
    println("*********")
    val geometricShapeOne = Square(3)
    val geometricShapeTwo = Rectangle(4, 2)
    val biggerGeometricShape = compare(geometricShapeOne, geometricShapeTwo)
    println(biggerGeometricShape.calculateArea())
    println("**********")
    val shapeOne = Square(5)
    val shapeTwo = Rectangle(3, 4)
    val biggerShape = genericCompareArea(shapeOne, shapeTwo)
    println(biggerShape.calculateArea())


}

fun <Common : GeometricShape> genericCompareArea(
    shapeOne: Common,
    shapeTwo: Common
): Common { /* common type extends from geometric shape */

    return if (shapeOne.calculateArea() < shapeTwo.calculateArea()) {
        shapeTwo
    } else {
        shapeOne
    }

}

fun compare(squareOne: Square, squareTwo: Square): Square {


    return if (squareOne.calculateArea() < squareTwo.calculateArea()) {
        squareTwo
    } else {
        squareOne
    }

}

fun compare(rectangleOne: Rectangle, rectangleTwo: Rectangle): Rectangle {

    return if (rectangleOne.calculateArea() < rectangleTwo.calculateArea()) {
        rectangleTwo
    } else {
        rectangleOne
    }

}

fun compare(geometricShapeOne: GeometricShape, geometricShapeTwo: GeometricShape): GeometricShape {


    return if (geometricShapeOne.calculateArea() < geometricShapeTwo.calculateArea()) {
        geometricShapeTwo
    } else {
        geometricShapeOne
    }

}