fun main(){
    val a = 5
    val b = 0
    val c : Int

    try{
        c = a/b
    }catch(e:Exception){
        println("Exception is hadled.")
    }finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}

