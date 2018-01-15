package loop

/**
 * FOR in kotlin is equivalent to FOREACH loop in Java
 */
private fun printFruits(fruits: List<String>) {

    for (fruit in fruits) {
        println(fruit)
    }
}

/**
 * Iteration through a list using INDEX
 */
private fun printFruitsUsingIndex(fruits: List<String>) {

    println("Using Index")

    for (i in fruits.indices) {
        println("$i : ${fruits[i]}")
    }
}

/**
 * Using withIndex library function
 */
private fun printFruitsUsingLibFunction(fruits: List<String>) {

    println("Using Library Function")

    for ((index, value) in fruits.withIndex()) {

        println("$index : $value")
    }
}

fun main(args: Array<String>) {

    val fruits = listOf("Apple", "Orange", "Kiwi", "Mango")

    printFruits(fruits)
//    printFruitsUsingIndex(fruits)
//    printFruitsUsingLibFunction(fruits)
}