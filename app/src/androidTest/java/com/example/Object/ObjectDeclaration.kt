package com.example.Object

object OCunstomer{
    var name = "kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init{
        println("Init!")
    }
}

class Hobby(val name:String)

fun main(){
    OCunstomer.greeting()
    OCunstomer.name = "Dooly"
    println("name = ${OCunstomer.name}")
    println(OCunstomer.HOBBY.name)
}
