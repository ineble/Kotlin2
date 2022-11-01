package com.example.classTest
class Bird3 {
    var name: String
    var wing: Int
    var beak: String
    var color: String
    //1번째 부생성자
    constructor(name:String,wing:Int,beak:String,color:String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    //2번째 부생성자
    //오버로딩 개념이 같은 이름의 메소드인데 다른 매개변수타입
    constructor(_name:String,_beak:String){
        name = _name
        wing = 2
        beak = _beak
        color = "gery"
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main(){
    val coco1 = Bird3("myBird",2,"short","blue")
    val coco2 = Bird3("mybird2","long")
    println("coco.color: ${coco1.color}")
    println("coco.color: ${coco2.color}")
    coco1.fly()
    coco2.fly()
    coco1.sing(3)
    coco2.sing(0)
}
