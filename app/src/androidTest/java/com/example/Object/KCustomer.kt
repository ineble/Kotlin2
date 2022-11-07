package com.example.Object

class KCustomer {
    companion object{
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun login() = println("Login...")
    }
}
fun main(){
    println(KCustomer.LEVEL)
    KCustomer.login()
}