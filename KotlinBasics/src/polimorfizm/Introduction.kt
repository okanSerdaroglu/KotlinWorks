package polimorfizm

open class Shape { /**Every class is public and final initially in kotlin.
                       *If you want to use it as a superClass you have to Open it with this keyword
                       */

   var width : Int = 0
   var length : Int = 0

    open fun calculateArea (){
        println("""Geometric shape area = $width * $length = ${this.width * this.length}""")
    }

}

class Square : Shape() { /** This means Square class extends Shape and overrides calculateArea method*/

    override fun calculateArea() {
        println("""Square area : $width * $length = ${this.width * this.length}""")
        /**super.calculateArea() */ /** super means go to super class and work as super class method */
    }

}

class Rectangle : Shape (){  /** This means Rectangle class extends Shape and overrides calculateArea method*/

    override fun calculateArea() {
        println("""Rectangle area : $width * $length = ${this.width * this.length}""")
        //super.calculateArea()
    }
}

fun main() {
    val shapeOne = Shape()
    shapeOne.length = 5
    shapeOne.width = 3
    shapeOne.calculateArea()

    val square = Square()
    square.length = 2
    square.width = 2
    square.calculateArea()

    val rectangle = Rectangle()
    rectangle.length = 4
    rectangle.width = 5
    rectangle.calculateArea()

}