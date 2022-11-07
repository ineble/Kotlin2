package com.example.exam

class InvalidNameException(message: String) : Exception(message)
fun main(){
    var name = "kildong123"

    try {
        validateName(name)
    }catch (e:InvalidNameException){
        println(e.message)
    }catch (e:Exception){
        println(e.message)
    }
}
fun validateName(name : String){
    if(name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameException("your name : $name \ncontains numerals.")
    }
}

