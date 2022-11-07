package com.example.interface_

interface Pet1 {
    var category: String
    val msgtags: String
    get() = "I'm your lovely pet!"
    fun feeding()
    fun patting(){
        println("Kepp patting!")
    }
}
class Cat1(override var category: String) : Pet1{
    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
}
fun main(){
    val obj = Cat1("small")
    println("Pet Message Tags: ${obj.msgtags}")
    obj.feeding()
    obj.patting()
}