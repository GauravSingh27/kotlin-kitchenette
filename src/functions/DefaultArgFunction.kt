package functions


/**
 * Function parameters can have default values, which are used when a corresponding argument is omitted.
 */
fun defaultArgumentFunction(language: String, platform: String = "Android") {

    println("Programming language for $platform is $language")
}


fun main(args: Array<String>) {

    defaultArgumentFunction("Java", "Android")
    
//    defaultArgumentFunction("Kotlin")
}
