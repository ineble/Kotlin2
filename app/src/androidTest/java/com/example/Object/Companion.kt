package com.example.Object

class Person5{
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object{
        var language: String = "Korean"
        fun work(){
            println("working...")
        }
    }
}
fun main(){
    println(Person5.language)
    Person5.language="English"
    println(Person5.language)
    Person5.work()
}