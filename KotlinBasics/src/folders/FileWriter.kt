package folders

import java.io.FileWriter

fun main() {

    val folder = FileWriter("firstFolder.txt", true) /* append means merge new data in folder, don't override it */
    println("Enter your name ")
    val name = readLine()!!
    folder.write(name+ "\n")
    folder.write("30")
    println("name wrote in folder")
    folder.close()


}