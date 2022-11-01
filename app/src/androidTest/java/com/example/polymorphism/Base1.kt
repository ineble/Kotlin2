package com.example.polymorphism

    open class Base1() {
        protected var i = 1
        protected fun protectedFunc(){
            i += 1
        }
        fun access(){
            protectedFunc()
        }
        protected class Nested
    }
    class Derived : Base1(){
        fun test(base: Base1): Int{
            protectedFunc()
            return i
        }
    }
    fun main(){
        val base = Base1()
        /* base.i*/
        base.protectedFunc()
        base.access()
    }
