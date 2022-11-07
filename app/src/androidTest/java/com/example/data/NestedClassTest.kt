package com.example.data

class Outer {
    val ov = 5
    class Nested{
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv"

        fun accessOuter(){
            println(country)
            getSomething()
        }
    }
    companion object{
        const val country = "Korea"
        fun getSomething() = println("Get Something...")
    }
    fun outside(){
        val msg = Nested().greeting()
        println("[Outer] : $msg ${Nested().nv}")
    }
}
fun main(){
    val output = Outer.Nested().greeting()
    println(output)
    val output1 = Outer.Nested().accessOuter()
    println(output1)

    val outer = Outer()
    outer.outside()


}