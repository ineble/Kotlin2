package com.example.Object

import kotlin.properties.Delegates


class UserP {
    var name: String by Delegates.observable("NONAME"){
    prop,old,new->println("$old -> $new")
    }
}
fun main(){
    val user = UserP()
    user.name = "kildong"
    user.name = "Dooly"
}