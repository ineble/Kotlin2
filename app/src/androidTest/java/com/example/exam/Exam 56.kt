fun main(){
    val a = 6
    val b = 0
    var c : Int

    try{
        c = a/b
    }catch(e:Exception){
        println("Exception is hadled.")
    }finally {
        println("finally 블록은 반드시 항상 실행됨")
    }

    try{
        c = a/b
    }catch(e:ArithmeticException){
        println("Exception is hadled. ${e.message}")
    }finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}

