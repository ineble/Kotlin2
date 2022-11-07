package com.example.polymorphism

open class InternalClass {
    internal var i = 1
    internal fun icFunc(): Int{
        i += 1
        return i
    }
    fun access(){
        icFunc()
    }
}
class Other{
    internal val ic = InternalClass()
    fun test(){
        ic.i
        ic.icFunc()
    }
}
fun main(){
    val mic = InternalClass()
    var i = mic.i
    println("i : $i")
    var i1 = mic.icFunc()
    println("i : $i1")
}
