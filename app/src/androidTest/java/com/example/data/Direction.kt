package com.example.data

enum class Direction {
    NOTRH,SOUTH,WEST,EAST
}

enum class DayOfWeek(val num:Int){
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),
    FRIDAY(5),SATURDAY(6),SUNDAY(7)
}
fun main(){
val day = DayOfWeek.MONDAY
    println(day.num)
when(day.num){
    1,2,3,4,5 -> println("Weekday")
    6,7 -> println("WeekEnd!")
}
}
