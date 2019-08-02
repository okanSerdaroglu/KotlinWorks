package abstractClassAndInterface

fun main() {


     val test = StudentJava
     test.className = "newClass"
     println(test.className)

     val testTwo = StudentJava
     testTwo.className = "NewClass test2"
     println(testTwo.className)

     println(test.className) /* there are two objects but there is only one object in ram. Because student class is object, this means singleton */


}