package conditionalexpression

/**
 * Traditional If-Else usage
 */
fun findMaxTraditional(first: Int, second: Int): Int {

    val max: Int
    if (first > second) {
        max = first
    } else {
        max = second
    }

    return max
}

/**
 * In Kotlin, If-ELSE is an EXPRESSION, i.e. it returns a value. Therefore, there is NO TERNARY OPERATOR.
 */
fun findMaxExpression(first: Int, second: Int): Int {

val max = if (first > second) {
        println("$first is larger than $second.")
        first
    } else {
        println("$second is larger than $first.")
        second
    }  
    return max
}

fun main(args: Array<String>) {

//    println("Traditional: ${findMaxTraditional(5, 8)}")
    println("Max value using IF-ELSE as expression: ${findMaxExpression(4,9)}")
}
