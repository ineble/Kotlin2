package com.example.Object

class UserPrac(_id: Int, _name:String,_age:Int) {
    val id:Int = _id
        get() = field

    var name:String = _name
        get() = field
        set(value){
            field = value
        }
    var age:Int = _age
        get() = field
        set(value){
            field = value
        }
}
fun main(){
    val user1 = UserPrac(1,"kildong",30)
    println("user1.age = ${user1.age}")
    user1.age = 35 //세터동작
    println("user1.age = ${user1.age}")

}


