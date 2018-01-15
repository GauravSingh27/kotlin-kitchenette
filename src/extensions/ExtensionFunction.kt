packages extensions

fun String.isSafeUrl() : Boolean {
    return this.startsWith("https")
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
    
    val url = "Gaurav"
    println("${url.isSafeUrl()}")
    
	val list = mutableListOf(1, 2, 3)
    list.swap(0, 1) // 'this' inside 'swap()' will hold the value of 'l'
}
