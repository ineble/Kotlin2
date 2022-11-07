package com.example.classTest

class Bird {
    //프로퍼티
    //메서드
    var name = "myBird"
    var wing = 2
    var beak = "short"
    var color = "blue"

    fun fly() = println("fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}
fun main(){
    val coco = Bird()
    coco.color = "red"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}
