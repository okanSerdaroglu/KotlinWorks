package methods

fun main() {

    val name = "okan Serdaroglu"
    val age = "29"

    println(age + 1) // when you write string + other chars converts string

    println(age.toInt() + 1)

    println("Name : $name Age : $age")

    for (character in name){
        println(character)
    }

    val clubName = "Besiktas"
    println(clubName)
    println(clubName.length)

    println(clubName[4])
    println(clubName.substring(4,6))
    println(clubName.indexOf("k"))
    println(clubName.lastIndexOf("a"))
    println(clubName.toUpperCase())
    println(clubName.toLowerCase())

}