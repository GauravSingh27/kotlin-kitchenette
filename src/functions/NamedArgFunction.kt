package functions


/**
 * With named arguments we can make the code much more readable
 */
fun namedArgumentFunction(name: String = "John", company: String, country: String = "India") {

    println("$name works at $company in $country")
}

fun main(args: Array<String>) {

   namedArgumentFunction(name = "Trump", company = "TCS", country = "US")
   namedArgumentFunction(company = "TCS", name = "Mike")
   namedArgumentFunction(company = "TCS")
}
