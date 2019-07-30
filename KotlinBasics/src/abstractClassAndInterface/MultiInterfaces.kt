package abstractClassAndInterface

/*abstract class Athlete {

    abstract fun doSport ()

}

class IceSkating : Athlete() {

    override fun doSport() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class Basketball : Athlete() {
    override fun doSport() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class sportmenPeople : */

interface CanIceSkate {

    fun iceSkate()

}

interface MakeBasket {

    fun basket()

}

class sportmenPeople : CanIceSkate,MakeBasket {
    override fun basket() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iceSkate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
