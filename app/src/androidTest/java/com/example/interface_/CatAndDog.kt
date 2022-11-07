package com.example.interface_

interface Pet2 {
    var category: String
    val msgtags: String
        get() = "I'm your lovely pet!"
    fun feeding()
    fun patting(){
        println("Kepp patting!")
    }
}

open class Animal(val name: String)

class Dog(name:String, override var category: String) : Animal(name), Pet{
    override fun feeding(){
        println("Feed the dog a bone")
    }
}
class Cat2(name:String, override var category: String) : Animal(name), Pet{
    override fun feeding(){
        println("Feed the dog a tuna can!")
    }
}
class Master{
    fun playWithPet(dog : Dog){
        println("Enjoy with my dog.")
    }
    fun playWithDog(dog : Dog){
        println("Enjoy with my ${dog.name}")
    }
    fun playWithPet(cat : Cat2){
        println("Enjoy with my cat.")
    }
    fun playWithCat(cat : Cat2){
        println("Enjoy with my ${cat.name}")
    }
}
fun main(){
    val master = Master()
    val dog = Dog("Toto","Small")
    val cat = Cat2("Coco","BigFat")
    master.playWithPet(dog)
    master.playWithDog(dog)
    master.playWithPet(cat)
    master.playWithCat(cat)

}