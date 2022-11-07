package com.example.data

fun main(){
val cus1 = Customer("Sean","sean@mail.com")
val cus2 = Customer("Sean","sean@mail.com")
val cus3 = cus1.copy(name = "Alice")
println(cus1 == cus2)
println(cus1.equals(cus2))
println("${cus1.hashCode()},${cus2.hashCode()}")
println(cus1.toString())
println(cus3.toString())
}

data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String,email: String, _job: String):this(name,email){
        job=_job
    }
    init{
        println("init")
    }

}