package classes

class Student constructor(name: String, age: Int) {

    var name : String = ""
    var age : Int = 0

    init { // init method works when class generate
        this.name = name
        this.age = age
        println("init worked")
        println("$name $age")
    }

    fun printInfo() {
        println("Name : $name Age: $age")
    }

}

fun main() {

    val student = Student("osman", 20)
    println(student.name)
    println(student.age)
    student.printInfo()

}