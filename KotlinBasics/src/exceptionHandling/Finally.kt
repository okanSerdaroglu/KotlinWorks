package exceptionHandling

import java.lang.IllegalArgumentException

class Person {

    var age: Int = 0
        set(value) {
            if (value < 0) {
                val exception = IllegalArgumentException("age can not be smaller than 0")
                throw exception
            } else {
                field = value
            }
        }

}

fun main() {

    val person = Person()
    println(person.age)
    println("******")
    person.age = 9
    println(person.age)
    println("*******")
    try {
        person.age = -9
        println(person.age)
    } catch (exception: Exception) {
        println(exception.message.toString())
        println(exception.toString())
    }finally { /* finally block always works */
        println("program ends")
    }

}