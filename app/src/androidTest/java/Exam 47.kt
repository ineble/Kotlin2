fun main(){
    var i = 1
    while(i <=5){
        println("$i")
        ++i
    }
    var temp = 0
    val limitTemp = 50

    while(true){
        println("온도를 입력해주세요!")
        temp = readLine()!!.toInt()
        if(temp > limitTemp){
            println("경고 발생")
            break
        }
    }
}

