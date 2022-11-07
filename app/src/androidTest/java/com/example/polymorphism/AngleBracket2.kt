package com.example.polymorphism

open class AngleBracket2 {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}
//인터페스는 기본적으로 open
interface B2{
    fun f() = println("B InterFace f()")
    fun b() = println("B InterFace b()")
}
class C2 : AngleBracket2(),B2{
    override fun f() = println("C class f()")
    fun test(){
        f()
        b()
        super<AngleBracket2>.f()
        super<B2>.f()
    }
}
fun main(){
    val c = C2()
    c.test()
}