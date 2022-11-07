package com.example.classTest
class Bird7 constructor(var name:String = "NONAME",var wing:Int = 2,var beak:String,var color:String) {

    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}
fun main(){
    val coco5 = Bird7(beak="long",color="red")
    println("coco3.name: ${coco5.name},coco2.wing: ${coco5.wing}")
    println("coco3.name: ${coco5.color},coco2.wing: ${coco5.beak}")
    coco5.fly()
    coco5.sing(0)
}
