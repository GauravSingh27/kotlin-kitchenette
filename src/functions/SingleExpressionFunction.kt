package functions

/**
 * Single Expression Function With Explicit Return Type
 */
fun singleExpressionFun(name: String): String = "Hi $name, This is Single Expression Function"



/**
 * Single Expression Function Without Explicit Return Type
 */
fun singleExpFunWithoutReturnType(name: String) = "Hi $name, This is Single Expression Function Without Return Type"

fun main(args: Array<String>) {

    println(singleExpressionFun("Gaurav"))
//    println(singleExpFunWithoutReturnType("Gaurav"))
}