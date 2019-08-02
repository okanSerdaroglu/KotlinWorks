package abstractClassAndInterface

object Stud {

    private const val counter:Int = 0

    fun showCounter () {

        println("counter: $counter")

    }

}

fun main() { /* don't create instance of object class. It is singleton and  */

    Stud.showCounter()

}