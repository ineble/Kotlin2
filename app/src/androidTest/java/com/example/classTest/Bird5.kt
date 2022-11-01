package com.example.classTest
class Bird4 constructor(_name:String,_wing:Int,_beak:String,_color:String) {
    var name = _name
    var wing = _wing
    var beak = _beak
    var color = _color

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main(){
    val coco2 = Bird4("Yorbird",2,"long","red")
    println("coco2.name: ${coco2.name},coco2.wing: ${coco2.wing}")
    println("coco2.name: ${coco2.color},coco2.wing: ${coco2.beak}")
    coco2.fly()
    coco2.sing(0)
}
