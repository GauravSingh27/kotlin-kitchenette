package conditionalexpression

/**
 * WHEN is replacement of SWITCH-CASE
 */
fun printDay(day: Int) {

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Incorrect input")
    }
}

/**
 * If many cases to be handled, combine conditions with a comma.
 */
fun determineWeekend(day: String) {

    when (day) {
        "Saturday", "Sunday" -> println("It/'s weekend")
        else -> println("Working day")
    }
}

fun main(args: Array<String>) {

    printDay(4)
//    printDay(9)

//    determineWeekend("Monday")
}
