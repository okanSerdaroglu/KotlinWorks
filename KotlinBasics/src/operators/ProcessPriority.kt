package operators

fun main() {

    var number1 = 15
    var number2 = 2

    var result:Int

    result = (number1 + number2 * 2 - number2) + number2 -number1 * 5 + number2

    println(result)

    result =  (number1 * number2 + 4 / 2) + number1++ * number2
    /** ilk önce çarpma işlemi yapılır. ++ operatörü değişkenden önce olsaydı önce arttırıp sonra çarpma yapılacaktı */

    print(result)


}