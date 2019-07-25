package methods

fun main() {

    val factorialArray = Array(10) { 0 }
    for (i in 0 until factorialArray.size) {
        factorialArray[i] = calculateFactorialInArray(i)
        println(factorialArray[i])
    }

    val numbers = Array(5){0}

    for (index in 0 until numbers.size){
        println("Enter number : ")
        val number = readLine()!!.toInt()
        numbers[index] = number
    }

    for (number in numbers){
        print(number)
    }


}

fun calculateFactorialInArray(number: Int): Int {

    var counter = 1
    var factorial = 1

    if (number == 1) {
        return 1
    }

    while (counter <= number) {
        factorial *= counter
        counter++
    }

    return factorial

}


