package com.example.data

interface Switcher {
    fun on(): String
}
class Smartphone1(val model:String){
    fun powerOn(): String {
        class led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }

        val powerStatus = led("Red")
        val powerSwitch = object : Switcher {
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}
fun main(){
    var ON = Smartphone1("Samsung").powerOn()
    println(ON)

}