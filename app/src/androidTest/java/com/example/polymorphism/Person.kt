package com.example.polymorphism

open class Person {
    constructor(firstName: String){
        println("[Person] firstName: $firstName")
    }
    constructor(firstName: String, age:Int){
        println("[Person] firstName: $firstName, $age")
        println("3")
    }
}
class Developer : Person {
    constructor(firstName: String): this(firstName,10){
        println("[Developer] firstName")
        println("1")
    }
    constructor(firstName: String, age:Int): super(firstName, age){
        println("[Developer] firstName: $firstName, $age")
        println("2")
    }

}
fun main(){
    val sean = Developer("Sean")
}