fun main(){
    var x = 4
    var y = 0b0000_1010 // 10
    var z = 0x0f //15
    println("x shl 2 -> ${x shl 2}") //4 * 2 * 2 = 16
    println("x inv -> ${x.inv()}") //비트 반전 -> 0100 -> 1011 -> -3????

    println("y shr -> ${y shr 2}") // 10 / 2 / 2 = 2.5 = 2
    println("x shl 4 -> ${x*16}, ${x shl 4}") // 4 * 2 * 2 *2 *2 = 64
    println("z shl 4 -> ${z*16}, ${z shl 4}") // 15 * 2* 2* 2* 2 = 240

    x = 64
    println("x shr 2 -> ${x/4},${x shr 2}") // 64 / 2 / 2/ 2 = 16


}



