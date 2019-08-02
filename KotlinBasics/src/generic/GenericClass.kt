package generic

class WriteStringArray {

    fun writeArray(array: Array<String>) {

        for (variable in array) {

            println(variable)

        }
    }
}

fun main() {

    val stringArray = arrayOf("okan", "emre", "hasan")
    val writeStringArray = WriteStringArray()
    writeStringArray.writeArray(stringArray)

    val writeGeneralArray = WriteGenericClassArray(stringArray)
    writeGeneralArray.writeArray(stringArray)


}

class WriteGenericClassArray<GeneralArray>(var array:Array<GeneralArray>) {


    fun writeArray (array: Array<GeneralArray>) {

        for (variable in array) {
            println(variable)
        }

    }



}

class GeneralArray {

}
