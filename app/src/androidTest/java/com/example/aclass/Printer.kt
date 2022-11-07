package com.example.aclass

abstract class Printer {
    abstract fun print()
}

val myPrinter = object : Printer(){
    override fun print(){
        println("출력합니다.")
    }
}
fun main(){
    myPrinter.print()
}