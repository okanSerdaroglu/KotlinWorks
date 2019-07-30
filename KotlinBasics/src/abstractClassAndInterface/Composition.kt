package abstractClassAndInterface

class CarEngine() {

    fun work() {}
    fun stop() {}

}

class Window() {

    fun up() {}
    fun down() {}

}

class Door() {

    var window: Window = Window()
    fun open() {}
    fun close() {}

}

class Wheel() {

    fun airPomp (quantity:Int) {

    }

}

class Car (){


    var carEngine : CarEngine = CarEngine()
    var leftDoor : Door = Door()
    var rightDoor : Door = Door()
    var wheels : Array<Wheel> = Array<Wheel>(4){ Wheel() }

}

fun main() {
    var myCar : Car = Car()
    myCar.rightDoor.open()
    myCar.wheels[2].airPomp(50)
}