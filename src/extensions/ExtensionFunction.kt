packages extensions

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    
    println("Before Swap")
    println("${this}")
    
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
    
    println("After Swap")
    println("${this}")
}

fun main(args: Array<String>) {
    
        println("this is a sample string to title case it".toTitleCase())

    
    //	val list = mutableListOf(1, 2, 3)
    //	list.swap(0, 1) // 'this' inside 'swap()' will hold the value of 'l'
}
