package controlFlows

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

    val max = if (first > second) first else second

    return max
}

fun main(args: Array<String>) {

    println("Traditional: ${findMaxTraditional(5, 8)}")
//    println("Expression: ${findMaxExpression(4,9)}")
}