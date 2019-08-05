package collections

fun main() {

    var changeList = ArrayList<Any>(50) /* initial capacity is not necessary */
    val arrayListOfList = mutableListOf<Any?>("emre","hasan","osman",2,null,false)

    arrayListOfList.add(22)
    arrayListOfList.add(3.3)

    for (element in arrayListOfList){
        println(element)
    }

    arrayListOfList[2] = "okan"
    arrayListOfList.removeAt(arrayListOfList.size-1)

    for (element in arrayListOfList) {
        println(element)
    }

}