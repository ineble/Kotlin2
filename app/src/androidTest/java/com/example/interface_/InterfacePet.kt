package com.example

interface Pet {
    var category: String
    fun fedding()
    fun patting(){
        println("Kepp patting!")
    }
}
class Cat(override var category: String) : Pet{
    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
}
fun main(){
    val obj = Cat("small")
}