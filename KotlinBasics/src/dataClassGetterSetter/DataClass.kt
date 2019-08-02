package dataClassGetterSetter

class Person (private val id:Int, val name:String) {

    override fun toString(): String {
        return "id : $id name: $name"
    }

}

data class PersonData (val id:Int, val name:String)

fun main() {

    val okan = Person(1,"okan")
    val osman = Person(2,"osman")
    val copyOfOkan = okan
    val test = Person (1,"okan")

    println(okan.toString())
    println(okan.hashCode())
    println(osman.toString())
    println(okan == osman)
    println(okan == copyOfOkan)
    println(okan == test) // when you use normal class these are in different adresses and this function compares if adresses equal. So this is false

    println("*********")

    val okanPersonData = PersonData(1,"okan")
    val osmanPersonData = PersonData(2,"osman")
    val copyOfOkanPersonData = okanPersonData
    val testOkanPersonData = PersonData(1,"okan")
    println(okanPersonData.toString())
    println(okanPersonData.hashCode())
    println(osmanPersonData.toString())
    println(okanPersonData == osmanPersonData)
    println(okanPersonData == copyOfOkanPersonData)
    println(testOkanPersonData == okanPersonData) // DataClass compares values, so this is true

    val copyOkanPersonData = okanPersonData.copy()
    println("Copy of okanPersonData $copyOkanPersonData")
    println("Copy of okanPersonData with different id ${copyOkanPersonData.copy(id=90)}") /* this changes only id */

}