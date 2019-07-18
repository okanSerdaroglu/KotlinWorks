package review

fun main() {

    println("Enter X")
    var x = readLine()!!.toInt()

    println("Enter Y")
    var y = readLine()!!.toInt()
    var result = 0

    if (x>0 && y<0){
        result = 4*x + 2*y + 4
    }else if (x>0 && y==0){
        result = 2*x - y + 3
    }else if (x<0 && y>0){
        result = 3*x + 4*y + 3
    }else {
        println("no result")
    }

    println(result)



}