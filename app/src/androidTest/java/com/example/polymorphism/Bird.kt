package com.example.polymorphism

open class Bird(var name:String,var wing:Int,var beak:String, var color:String) {
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol:$vol")

}
//open -> 상속 기능을 나타내며, 재정의(즉 오버라이딩)이 가능해지게된다.
//final -> 상속은 가능하네 재정의는 금지하겠다
class Parrot(name: String, wing: Int = 2, beak: String, color: String, var language: String = "natural") : Bird(name,wing,beak,color){
    fun speak() = println("Speak!$language")
    override fun sing(vol:Int){
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}
fun main(){
    val parrot = Parrot(name = "parrot",beak="short",color="multiple")
    parrot.language="English"
    println("Parrot:${parrot.name},${parrot.wing},${parrot.beak},${parrot.color},${parrot.language}")
    parrot.sing(5)
}