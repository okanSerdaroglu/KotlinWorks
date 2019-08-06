package specialFunctions

class Title (var value:String)

fun main() {

    val name = "Okan"
    val surname = " Serdaroglu"
    val nameSurmane = name + surname
    val surnameTwo = name.plus(surname)
    println(nameSurmane)
    println(surnameTwo)

    val titleOne= Title("TitleOne")
    val titleTwo = Title("TitleTwo")
    val titleThree = titleOne.plus(titleTwo)
    val titleFive = titleOne plus titleOne
    val titleFour = titleOne + titleThree


    println(titleThree.value)
    println(titleFour.value)
    println(titleFive.value)

}

infix operator fun Title.plus(titleTwo:Title) : Title { /* when you use + operator plus method works for this class */

    val title : Title = Title(this.value + " " + titleTwo.value)
    return title

}