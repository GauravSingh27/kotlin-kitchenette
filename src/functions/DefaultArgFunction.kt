package functions


/**
 * Function parameters can have default values, which are used when a corresponding argument is omitted.
 */
fun defaultArgumentFunction(name: String = "Freak") {

    println("Hi $name")
}


fun main(args: Array<String>) {

    defaultArgumentFunction("Gaurav")
//    defaultArgumentFunction()
}