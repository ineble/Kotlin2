package com.example.overloding

class Point(var x: Int = 0, var y:Int = 10) {
    operator  fun plus(p:Point) : Point{
        return Point(x+p.x,y+p.y)
    }
}
fun main(){
    val p1 = Point(3,-8)
    val p2 = Point(2,9)
    var point = Point()
    point = p1 + p2
    println("point = (${point.x},${point.y})")
}