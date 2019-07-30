package polimorfizmAndSecondaryConstructor

open class Soldier {

    open fun sayHello() {
        println("hello")
    }

}

class Er : Soldier() {

    override fun sayHello() {

        println("Er said hello")

    }

}

class YuzBasi : Soldier() {

    override fun sayHello() {
        println("Yuzbasi said hello")
    }

}

fun main() {
    val soldier = Soldier()
    val er = Er()
    val yuzBasi = YuzBasi()

    /* var soldierTwo = Soldier()
     soldierTwo = Er()
     soldierTwo = YuzBasi ()*/

    hazirOl(soldier)
    hazirOl(er)
    hazirOl(yuzBasi)
}

fun hazirOl(soldier: Soldier) {
    soldier.sayHello()
}
