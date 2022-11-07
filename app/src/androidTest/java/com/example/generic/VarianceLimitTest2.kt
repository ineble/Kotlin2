//package com.example.generic
//
//import com.example.interface_.Animal
//import com.example.interface_.Cat
//import com.example.overloding.Box
//
//fun main() {
//
//    val c1: Cat = Cat(10)
//    val s1: Spider = Spider(true)
//
//    var a1: Animal = c1
//    a1 = s1 // ④ a1은 Spider의 객체가 됨
//    println("a1.size = ${a1.size}")
//
//    val c2: Box<Animal> = Box<Cat>(Cat(10))
//    println("c2.element.size = ${c2.element.size}")
//
//    val c3: Box<Cat> = Box<Animal>(10) // 오류!
//
//    val c4: Box<Any> = Box<Int>(10) // 오류!
//}
