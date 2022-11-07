package com.example.polymorphism

open class AngleBracket {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}
//인터페스는 기본적으로 open
interface B{
    fun f() = println("B InterFace f()")
    fun b() = println("B InterFace b()")
}
class C : AngleBracket(),B{
    override fun f() = println("C class f()")
    fun test(){
        f()
        b()
        super<AngleBracket>.f()
        super<B>.f()
    }
}
fun main(){
    val c = C()
    c.test()
}