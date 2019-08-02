package abstractClassAndInterface

object StudentJava { /* singleton */

    var className = "JavaStatic"

    @JvmStatic /* when you convert this code from kotlin to java @jvmStatic annotation reports java it is static method */
    fun main(args: Array<String>) {

        val student = Student(1, "osman")
        student.writeInfo()

        val studentTwo = Student(2, "okan")
        studentTwo.writeInfo()

        val studentThree = Student(3, "hasan")
        studentThree.writeInfo()


    }

}

internal class Student(private val id: Int, private val name: String) {

    init {
        totalStudent++
    }


    fun writeInfo() {

        println("No : $id Name $name Toplam :$totalStudent")

    }

    companion object { /* companion object means static variable */
        private var totalStudent: Int = 0
    }

}
