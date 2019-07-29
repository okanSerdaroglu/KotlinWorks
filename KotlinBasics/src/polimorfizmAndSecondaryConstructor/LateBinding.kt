package polimorfizmAndSecondaryConstructor

/** late binding means bind in runtime */

open class Animal {
    open fun catch() {
        println("animal catch")
    }
}

class Crocodile : Animal() {
    override fun catch() {
        println("crocodile catch")
    }
}

class Eagle : Animal() {
    override fun catch() {
        println("Eagle catch")
    }
}

fun main() {

    val animals = Array(3) { Animal() }

    for (i in 0 until animals.size) {
        animals[i] = randomAnimal()
    }

    for (animal in animals) {
        animal.catch()
    }

}

fun randomAnimal(): Animal {

    val randomNumber = (Math.random() * 3).toInt()

    var animal = Animal()

    when (randomNumber) {

        0 -> animal = Animal()
        1 -> animal = Eagle()
        2 -> animal = Crocodile()

    }

    return animal

}