package arrays

import java.util.*

fun main() {

    //copy Arrays
    val arrayOne = arrayOf(5,1,3,90,4)
    val arrayTwo = Array(5){0}

    /*for (i in 0 until arrayOne.size){
        arrayTwo [i] = arrayOne [i]
    }*/

    println(System.arraycopy(arrayOne,0,arrayTwo,0,arrayTwo.size))

    // sorting arrays

    for (number in arrayTwo){
        println(number)
    }

    println()
    Arrays.sort(arrayTwo)

    for (number in arrayTwo){
        println(number)
    }

    // compare Arrays
    println()
    println(Arrays.equals(arrayOne,arrayTwo))

    val names = arrayListOf("okan","adem","erdinç")

    for (i in 0 until names.size){
        println(names[i])
    }

    names.add("ömer")
    names.add("barış")
    names.add("enes")

    println(names)

    println(names[2])
    println(names.size)
    println(names.remove("okan")) // returns boolean
    names[0] = "osman"

    println(names)






}