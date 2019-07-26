package classes

class Person {

    var name: String = "okan"
    var age: Int = 29

    fun printNameAndAge (){
        println("$name $age")
    }

}

fun main() {

    val person = Person()

    println(person.name)
    println(person.age)
    person.printNameAndAge()

    val personTwo = Person()
    personTwo.name = "Ahmet"

}