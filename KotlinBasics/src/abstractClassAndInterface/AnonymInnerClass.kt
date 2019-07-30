package abstractClassAndInterface

interface CanRead {
    fun read()
}

interface CanWrite {
    fun write ()
}

class Browser : CanRead,CanWrite {

    override fun write() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun read() {
        println("read")
    }

}

fun main() {

    val browser = Browser()
    browser.read()

    val unNamedClass = object : CanRead {

        override fun read() {
            println("read from unnamed class")
        }

    }

    unNamedClass.read()

}