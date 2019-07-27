package classes

class Circle(var radius: Int)

fun calculateArea(circle: Circle): Circle {

    val area = circle.radius * circle.radius * Math.PI

    println(area)

    return circle

}

fun showCircleArray(circleList: Array<Circle>) {

    for (circle: Circle in circleList) {
        calculateArea(circle)
    }


}

fun main() {

    val circleOne = Circle(5)
    calculateArea(circleOne)
    val circleTwo = Circle(7)
    val circleThree = Circle(9)
    val circleFour = Circle(11)
    val circleFive = Circle(13)


    val circleList = Array(5) { Circle(0) }
    circleList[0] = circleOne
    circleList[1] = circleTwo
    circleList[2] = circleThree
    circleList[3] = circleFour
    circleList[4] = circleFive

    showCircleArray(circleList)

}

