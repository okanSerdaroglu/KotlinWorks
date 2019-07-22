package methods

fun main() {

    writeName()
    println("enter name")
    writeNameWithParameter("okan", 29)
    val sum = calculateSum(5, 9)
    println(sum)
    val yourName = writeYourName("okanSerdaroglu")
    println(yourName)

    val factorialNumber = readLine()!!.toInt()
    println(calculateFactorial(factorialNumber))

}

fun writeNameWithParameter(name: String, age: Int) {

    println("$name $age")

}

fun writeName() {

    println("okan")
    println("30")

}

fun calculateSum(numberOne: Int, numberTwo: Int): Int { // return type

    return numberOne + numberTwo

}

fun writeYourName(name: String): String {

    return "hello$name"

}


/** write a function takes a number and calculates it's factorial*/

fun calculateFactorial(number: Int): Int {

    var counter = 1
    var factorial = 1

    while (counter <= number){
        factorial *= counter
        counter ++
    }

    return factorial

}

