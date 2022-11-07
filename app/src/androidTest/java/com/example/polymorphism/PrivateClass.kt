package com.example.polymorphism

private class PrivateClass() {
    private var i = 1

    private fun privateFunc(){
        println("i: $i")
        i += 1
        println("i: $i")
    }
    fun access(){
        privateFunc()
    }
}
class OtherClass{
    private val opc = PrivateClass()
    fun test(){
        val pc = PrivateClass()
    }
}
fun main(){
    val pc = PrivateClass()
    pc.access()
}
fun TopFunction(){
    val tpc = PrivateClass()
}
