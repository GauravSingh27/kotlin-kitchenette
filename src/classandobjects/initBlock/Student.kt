package classandobjects.initBlock

class Student(var name: String, var age: Int) {

    init {
        println("Inside init block")
        println("Name: $name  Age: $age")
    }
}