package methods

fun main() {

    val numbersArray = Array(3){0} // default values of elements is 0

    //var wordsArray = Array(5){""} // default values of array elements is ""

    for (i in 0 until numbersArray.size) {

        numbersArray [i] = i+10
        println(numbersArray[i])

    }

    val variables = arrayOf("okan",5,true,5.5)

    for (i in variables) {
       println(i)
    }

    variables [0] = "osman"
    variables [1] =  15

    println(variables[0])


}