package arrays

fun main() {

    println("enter your name : ")
    val name : String? = readLine() /** this means i am waiting for a value from user.But it can be null, therefore i used ? operator */
    println("enter your surname : ")
    val surname : String = readLine() !!

    println("enter your age : ")
    var age : Int = readLine()!!.toInt()

    println("lenght of name : ${name?.length}  surname : $surname age : $age") /** when you want to print null value it is not a problem and dont cause a problem.
    but when you want to use it like name.lenght it will be crash. So you have to use safety operator*/
    println("name $name surname : $surname age : $age")
    age = 4
    println(age)

}