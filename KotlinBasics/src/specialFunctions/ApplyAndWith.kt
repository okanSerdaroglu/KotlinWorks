package specialFunctions

class Person {

    var name: String = ""
    var age: Int = -1

    fun describeYourSelf() {

        println("Hello $name $age")

    }

}

fun main() {

    val person = Person()
    /*person.name = "okan"
    person.age = 30
    person.describeYourSelf()*/

    with(person){
        name = "osman"
        age = 21
    }
    person.describeYourSelf()

    person.apply {
        name = "Volkan"
        age = 40
    }.describeYourSelf()


}