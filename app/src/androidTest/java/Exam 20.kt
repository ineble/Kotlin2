fun main(){
    namedParam(x=200,z=100) //500
    namedParam(z=150) //450
}

fun namedParam(x:Int = 100,y:Int = 200,z:Int){
    println(x+y+z)
}


