package com.example.Object

class UserPrac1(_id: Int,_name:String,_age:Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }
    var age: Int = _age
}

fun main(){
    val user1 = UserPrac1(1,"kildong",35)
    println("user3.name = ${user1.name}")
    user1.name = "cocobol"
    println("user3.name = ${user1.name}")
}