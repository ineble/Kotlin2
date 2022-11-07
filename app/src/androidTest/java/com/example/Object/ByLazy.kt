package com.example.Object

class Person1(val name: String, val age: Int)

fun main(){
    var isPersonInstantiated: Boolean = false
    val person : Person1 by lazy {
        isPersonInstantiated = true
        Person1("kim",23)
    }
    val personDelegeate = lazy{Person1("Hong",40)}
    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegeate.isInitialized()}")

    println("person Init: ${person.name}")
    println("personDelegate.value.name = ${personDelegeate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("person Init: ${personDelegeate.isInitialized()}")
}