package abstractClassAndInterface


interface Animal { /** interface is not a class */

    fun hunt()

    fun interFaceTest() {
        println("interface test metodu")
    }

}

// kedigiller
abstract class Felines : Animal {
    abstract fun follow()
}

open class Cat : Felines() {
    override fun hunt() {
    }

    override fun follow() {
        println("Cat class follow worked")
    }

}

class Tiger : Cat() {

    override fun follow() {
        println("Tiger class follow worked")
    }

    override fun hunt() {
        super.hunt()
    }

}

fun main() {



}
