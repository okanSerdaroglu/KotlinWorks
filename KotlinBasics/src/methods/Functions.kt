package methods

fun main() {

    writeName()
    println("enter name")
    writeNameWithParameter("okan",29)

}

fun writeNameWithParameter (name: String, age: Int){

    println("$name $age")

}

fun writeName() {

    println("okan")
    println("30")

}