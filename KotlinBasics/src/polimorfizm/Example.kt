package polimorfizm


open class Person(name: String, age: Int, isMan: Boolean) {
    /** primary constructor*/

    var name: String
    open var age: Int = 0
    /** every variable in constructor initially val. you have to open it with open keyword */
    var isMan: Boolean

    init {

        println("init worked in person class")
        this.name = name
        this.age = age  // TODO research this warning
        this.isMan = isMan

    }

    override fun toString(): String {

        val gender: String = if (isMan) "man" else "women"

        return "name : $name age: $age gender: $gender"

    }

}

class Teacher(name: String, override var age: Int, isMan: Boolean, branch: String) : Person(name, age, isMan) {

    private var branch: String

    init {
        if (age < 0) {
            age = 999
        }
        println("init worked in Teacher class")
        this.branch = branch

    }

    override fun toString(): String {
        return super.toString() + "branch : $branch"
    }


}

fun main() {

    val person = Person("okan", 30, true)
    println(person)
    /** automatically toString method works */

    val teacher = Teacher("büşra", -5, false, "maths")
    println(teacher)

}