package review



fun main() {

    /** find each elements squares sum of array 1 to 100 */

    var sum = 0
    for (i in 1..100) {
        sum += i * i
    }
    println("totol = $sum")

    /** write numbers 1 to 100 with step 7 */


    var range = 1..100
    var reverseRange = 100.downTo(1).step(7)


    for (i in range.step(7)) {
        println("$i")
    }

    println("**************")

    for (j in reverseRange) {
        println("$j")
    }

    /** find factorial of entered number */

    println("enter a number : ")
    var number : Int = readLine()!!.toInt()
    var count = 1
    var factorial = 1

    while (count <= number){
        factorial *= count
        count ++
    }

    println("$number factorial : $factorial")



}