package functions


/**
 * With named arguments we can make the code much more readable
 */
fun namedArgumentFunction(firstName: String, lastName: String, age: Int) {

    println("Hi $firstName $lastName")
}

fun main(args: Array<String>) {

    namedArgumentFunction(firstName = "Gaurav", lastName = "Singh")
}
