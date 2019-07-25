package methods


fun main() {

    calculateSumOfNumbers(5, 7)
    calculateSumOfNumbers(5, 7, 9)
    calculateSumOfNumbers(1,2,3,4,5,6)

    val numbers = arrayOf(1,2,3,4,5,6,6,6,7,7,78)
    findDifference(5,3)
    calculateNumbers(numbers)

}

fun calculateSumOfNumbers(numberOne: Int, numberTwo: Int) {

    println(numberOne + numberTwo)

}

fun calculateSumOfNumbers(numberOne: Int, numberTwo: Int, numberThree: Int) {

    println(numberOne + numberTwo + numberThree)

}

fun calculateSumOfNumbers(vararg number: Int) { // this means there is an int array here which name number

    var sum = 0

    for (i in number) {
        sum += i
    }

    println(sum)

}

fun calculateNumbers (numbers : Array<Int>) {

    var sum = 0
    for (i in numbers){
        sum += i
    }

    println(sum)
}

fun findDifference (numberOne : Int, numberTwo : Int) : Int {

    println(numberOne - numberTwo)
    return numberOne - numberTwo

}

// overloading can not make with return type
