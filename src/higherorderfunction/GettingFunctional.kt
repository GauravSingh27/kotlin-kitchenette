package higherorderfunction

fun operation(x: Int, y: Int, op:(Int, Int) -> Int) {

    println("Sum: ${op(x,y)}")
}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    operation(4,5 ,::sum)
}
