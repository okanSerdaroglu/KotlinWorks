package polimorfizmAndSecondaryConstructor

open class Working {

    open var position: String = "Working"

    open fun work() {

        println("$position working")

    }

}

open class Coordinator : Working() {

    override var position: String = "Coordinator"

    override fun work() {
        println("$position working")
    }

}

class SystemProgrammer : Coordinator() {

    override var position: String = "System Programmer"
    override fun work() {

        println("$position worked")

    }

    fun examineSystem() {

        println("$position is examining system")
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

    val workerArray = Array(3) { Working() }

    workers[0] = Coordinator()
    workers[1] = Programmer()
    workers[2] = Manager()
    workerArray[0] = SystemProgrammer()
    workerArray[1] = Programmer()
    workerArray[2] = Coordinator()

    startWorking(workers)
    println()
    startWorkingWithPolymorphism(workerArray)
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
                val worker = Manager()
                worker.work()
            }
        }

    }

}

fun startWorkingWithPolymorphism(workers: Array<Working>) {

    for (worker in workers) {

        worker.work()

        if (worker is SystemProgrammer) {
            worker.examineSystem()
        }

    }

}
