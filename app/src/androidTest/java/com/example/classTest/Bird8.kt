package com.example.classTest
// 상속 가능한 클래스를 위해 open 사용
open class Bird8 (var name:String = "NONAME",var wing:Int = 2,var beak:String,var color:String) {
    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}
// 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String,color: String) : Bird8(name,wing,beak,color) {
    fun signHitone() = println("Happy Song!") //새로 추가된 매서드

}
// 부 생성자를 사용하는 상속
class Parrot : Bird8 {
    val language: String

    constructor(name: String, wing: Int, beak: String,color : String,language: String) : super(name,wing,beak,color){
        this.language = language
    }
    fun speak() = println("Speak! $language")
}
fun main(){
    val coco6 = Bird8("mybird",2,"short","blue")
    val lark = Lark("mylark",2,"long","brown")
    val parrot = Parrot("myparrot",2,"short","multiple","korean")
    println("coco6.name: ${coco6.name} ${coco6.wing} ${coco6.beak} ${coco6.color}")
    println("Lark.name: ${lark.name} ${lark.wing} ${lark.beak} ${lark.color}")
    println("Parrot: ${parrot.name} ${parrot.wing} ${parrot.beak} ${parrot.color} ${parrot.language}")
    lark.signHitone()
    parrot.speak()
    lark.fly()
}
