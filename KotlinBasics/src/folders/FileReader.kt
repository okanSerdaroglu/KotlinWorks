package folders

import java.io.FileReader

fun main() {

    var folder: FileReader? = null
    try {
        folder = FileReader("firstFolder.txt")
        var readValues: Int = 0
        /*do {
            readValues = folder.read()
            //print(readValues)
            //println()
            print(readValues.toChar())
        }*/while (readValues != -1) {

            print(readValues.toChar())
            readValues = folder.read()

        } /* last value is -1 in folders. You can check this value for ending*/

    } catch (exception: Exception) {
        println(exception.toString())
    } finally {
        folder?.close()
    }

    val folderTwo = FileReader("firstFolder.txt")
    folderTwo.forEachLine {
        println(it)
    } /* each row reads from forEachLine method and assign it string */

}