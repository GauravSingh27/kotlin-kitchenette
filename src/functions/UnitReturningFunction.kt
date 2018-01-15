package functions

/**
 * If a function does not return any useful value, its return type is Unit.
 */
fun unitReturningFunction(name: String): Unit {

    println("Hi $name, This function return/'s nothing")
}

fun unitReturningFunctionWithoutReturnType(name: String) {

    println("Hi $name, There is no need to mention return type")
}

fun main(args: Array<String>) {
    unitReturningFunction("Gaurav")
//     unitReturningFunctionWithoutReturnType("Gaurav")
}