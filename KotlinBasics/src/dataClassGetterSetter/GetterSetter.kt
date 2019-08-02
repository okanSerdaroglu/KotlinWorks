package dataClassGetterSetter

fun main() {


    val book = Book(-9,"Sefiller")
    println(book.name)
    println(book.getId())

    println("********")
    book.setId(-9)
    println(book.getId())

    println("*********")
    val bookKotlin = BookKotlin(-5,"Vadideki Zambak",Color.RED)
    println(bookKotlin.id)
    println(bookKotlin.color)


}

enum class Color {
    RED,
    BLUE,
    GREEN
}
