package specialFunctions

import java.math.BigInteger

fun main() {

    //sayHello()
    //println(calculateFactorial(BigInteger("50")))
    //println(recursiveFactorial(BigInteger("6")))
    println(factorialWithTailrec(BigInteger("70000"),BigInteger("1")))

}

fun sayHello() {

    println("Hello")
    sayHello()

}

fun calculateFactorial(number: BigInteger): BigInteger {

    var result = BigInteger.ONE // BigInteger("1")
    for (value in 1..number.toInt()) {
        result *= BigInteger("$value")
    }

    return result


}

fun recursiveFactorial(number: BigInteger): BigInteger {

    return if (number == BigInteger.ZERO) {
        BigInteger("1")
    } else {
        number * recursiveFactorial(number - BigInteger.ONE)
    }

}

tailrec fun factorialWithTailrec
        (number: BigInteger, result: BigInteger = BigInteger.ONE):BigInteger {
         /* tailrec means don't create a stack use result variable for calculate factorial */

    return if (number == BigInteger.ZERO) {
        result
    } else {
        factorialWithTailrec(number - BigInteger.ONE, result * number)
    }


}

