package com.example.Object

class LazyTest{
    init {
        println("init block")
    }
    val subject by lazy {
        println("lazy initialized")
        "Kotiln programming"
    }
    fun flow(){
        println("not initialized")
        println("subject one: $subject")
        println("subject two: $subject")
    }
}

fun main(){
    val test = LazyTest()
    test.flow()
}