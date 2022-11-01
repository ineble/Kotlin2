fun main(){
    retFunc2()
}
fun inlineLambda2(a: Int,b: Int,out: (Int,Int) -> Unit){
    out(a,b)
}
fun retFunc2(){
    println("start of retFunc")
    inlineLambda2(13,3) { a,b ->
        val result = a+b
        if(result>5) return@inlineLambda2
        println("result: $result")
    }
    println("end of retFunc")
}

