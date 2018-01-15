package controlFlows.loop

private fun printFruitsUsingWhile(fruits: List<String>) {

    var index = 0

    while (index < fruits.size) {

        println(fruits.get(index))

        index++
    }
}

private fun printFruitsUsingDoWhile(fruits: List<String>) {

    var index = 0

    do  {

        println(fruits.get(index))

        index++
    } while (index < fruits.size)
}

fun main(args: Array<String>) {

    val fruits = listOf("Apple", "Orange", "Kiwi", "Mango")

    printFruitsUsingWhile(fruits)
//    printFruitsUsingDoWhile(fruits)
}