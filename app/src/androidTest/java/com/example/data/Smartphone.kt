package com.example.data

class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int){
        fun getInfo() = "${model}: Instaled on $cpu with ${size}Gb"
    }
}
fun main(){
    val mySdcard = Smartphone("s7").ExternalStorage(32)
    println(mySdcard.getInfo())
}