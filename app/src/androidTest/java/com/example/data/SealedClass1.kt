/*
package com.example.data

sealed class Result1 {
    open class Success1(val message: String) : Result1()
    class Error1(val code: Int, val message: String) : Result1()
    class Status1 : Result1()
    class Inside1 : Success1("Status")
}

fun main(){
    val result = Result.Success("Good!")
    val msg = eval1(result1)
    println(msg)
}
fun eval1(result1: Result1.Success1):String = when(result1){
    is Result1.Status1 -> "in progress"
    is Result1.Success1 -> result1.message
    is Result1.Error1 -> result1.message
}*/
