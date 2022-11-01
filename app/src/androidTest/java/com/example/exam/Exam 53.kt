fun main(){
    labelBreak()
    labelBreak_c()
}
fun labelBreak(){
    println("labelBreak")
    for(i in 1..5){
        for (j in 1..5){
            if(j ==3) break
            println("i: $i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}
fun labelBreak_c(){
    println("labelBreak")
    for(i in 1..5){
        for (j in 1..5){
            if(j ==3) continue
            println("i: $i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

