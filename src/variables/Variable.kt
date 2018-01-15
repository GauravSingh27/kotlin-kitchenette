package variables

/**
 * Assign-once (read-only) variable:
 */
fun immutableVariables() {

    val a: Int = 1  // immediate assignment

    val b = 2       // `Int` type is inferred

    val c: Int      // Type required when no initializer is provided
    c = 3           // deferred assignment

    // c = c + 1    // Try reassigning immutable, compile time error

    println("Immutable a = $a, b = $b, c = $c")
}

fun mutableVariables() {

    var x = 5       // `Int` type is inferred

    x += 1

    println("Mutable : x = $x")
}

fun main(args: Array<String>) {

    immutableVariables()
//    mutableVariables()
}