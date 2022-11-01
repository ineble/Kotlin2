package com.example.classTest
class Bird5 constructor(var name:String,var wing:Int,var beak:String,var color:String) {

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main(){
    val coco3 = Bird5("Yorbird",11,"long","orange")
    println("coco3.name: ${coco3.name},coco2.wing: ${coco3.wing}")
    println("coco3.name: ${coco3.color},coco2.wing: ${coco3.beak}")
    coco3.fly()
    coco3.sing(0)
}
