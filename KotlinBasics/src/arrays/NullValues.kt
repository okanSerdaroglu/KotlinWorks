package arrays

fun main() {

    var name : String? = null /** String? different from String. it can take null values */

    println(name)
    println(name?.length)  /** ? means name value can be null and safe it with this operator */
    //println(name!!.length)  /** !! means it is not important that, name value could be null */

    var number : Int? // ? means number variable is an int but it can be null
    number = 5
    println(number)

    number = null
    println(number)
    println(number.toString().length)

    var comfirm : Boolean?
    comfirm = null

    println(comfirm.toString().length)

    /** ? operator checks the variable is null. if you use ? operator you dont get null pointer exception.
     * if you are sure your variable is not null you can use !! operator
     */

}