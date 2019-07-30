package polimorfizmAndSecondaryConstructor

open class PersonTwo {

    private var name: String
    private var age: Int
    private var isMan: Boolean = true

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, isMan: Boolean) : this(name, age) { /** isMan could not be initialized */
        this.isMan = isMan
    }

    override fun toString(): String {

        val gender:String = if (isMan)"man" else "woman"
        return "name : $name age : $age isMan : $gender"

    }

}

class TeacherTwo:PersonTwo {

    private var branch : String

    constructor(name:String,age:Int,gender:Boolean,branch:String):super(name,age,gender){
        this.branch = branch
    }

    override fun toString(): String {
        return super.toString() + "branch : $branch"
    }

}

fun main() {
    val person = PersonTwo("okan",30,true)
    println(person.toString())

    val teacherTwo = TeacherTwo("mahmut",65,true,"History")
    println(teacherTwo.toString())

}