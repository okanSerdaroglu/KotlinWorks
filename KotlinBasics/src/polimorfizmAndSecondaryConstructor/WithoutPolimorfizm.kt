package polimorfizmAndSecondaryConstructor

open class Working {

    open var position: String = "Working"

    open fun work() {

        println("$position working")

    }

}

class Coordinator : Working() {

    override var position: String = "Coordinator"

    override fun work() {
        println("$position working")
    }

}

class Programmer : Working() {

    override var position: String = "Programmer"

    override fun work() {
        println("$position working")
    }
}

class Manager : Working() {

    override var position: String = "Manager"

    override fun work() {
        println("$position working")
    }


}

fun main() {

    val workers = Array(4) { Any() }

    workers[0] = Coordinator()
    workers[1] = Programmer()
    workers[2] = Manager()

    startWorking(workers)
}

fun startWorking(workers: Array<Any>) {

    for (workerPerson in workers) {

        when (workerPerson) {
            is Coordinator -> {
                val worker = Working()
                worker.work()
            }
            is Programmer -> {
                val worker = Programmer()
                worker.work()
            }
            else -> {
                val worker = Manager ()
                worker.work()
            }
        }

    }

}
