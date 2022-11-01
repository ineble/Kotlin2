package com.example.classTest
class Bird6 constructor(var name:String,var wing:Int,var beak:String,var color:String) {
    init {
        println("------------초기화 블록 시작------------")
        println("이름은 $name,부리는 $beak")
        this.sing(3)
        println("------------초기화 블록 끝------------")
    }
    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}
fun main(){
    val coco4 = Bird6("Yorbird",11,"long","orange")
    println("coco3.name: ${coco4.name},coco2.wing: ${coco4.wing}")
    println("coco3.name: ${coco4.color},coco2.wing: ${coco4.beak}")
    coco4.fly()
    coco4.sing(0)
}
