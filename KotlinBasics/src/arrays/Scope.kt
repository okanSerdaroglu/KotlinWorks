package arrays

var number: Int = 10

fun main() {

    run {
        var level1: Int = 1

        run {
            println(level1)
        }
        var level2: Int = 2
        {
            println(level1)
            println(level2)

            var level3: Int = 3
            println(level3)

            run {

            }

        }

    }

}