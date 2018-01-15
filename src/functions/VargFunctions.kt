package functions

fun sumOfNumbers(vararg numbers: Double): Double {
    var sum: Double = 0.0
    for(number in numbers) {
        sum += number
    }
    return sum
}

fun main(args: Array<String>) {

println(sumOfNumbers(1.5, 2.0))  

println(sumOfNumbers(1.5, 2.0, 3.5, 4.0, 5.8, 6.2))  

println(sumOfNumbers(1.5, 2.0, 3.5, 4.0, 5.8, 6.2, 8.1, 12.4, 16.5))
}
