package polimorfizmAndSecondaryConstructor

class TestClass {

    fun testing() {
        val nationality = Nationality()
        //println(nationality.a)
        //println(nationality.b)
        println(nationality.c)
        println(nationality.d)
    }
}

open class Nationality {

    private var a = 1
    /** visible in class */
    protected var b = 2
    /** visible in classes which extends this class */
    internal var c = 3
    /** it is visible in modulue */
    public var d = 4

    open fun test() {

        println(a)
        println(b)
        println(c)
        println(d)

    }

}

class Turk : Nationality() {

    override fun test() {
        // println(a)
        println(b)
        println(c)
        println(d)
    }

}