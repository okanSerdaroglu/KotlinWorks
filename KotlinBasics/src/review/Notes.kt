package review

/** write a program which calculates char notes according to entered number.
 *  Do not use range
 *  */

fun main() {

    println("Enter your note : ")
    val note = readLine()!!.toInt()
    val charResult: String = when (note - (note / 10)) {

        90 -> "AA"
        80 -> "BA"
        70 -> "BB"
        60 -> "CB"
        50 -> "CC"
        else -> {
            "FF"
        }
    }

    println(charResult)

    /** write code that prints multiplication table */

    for (i in 1..10){
        for (j in 1..10){

            print("$i * $j = " + (i*j)+ "\t")

        }
        println()
        println()

    }


}