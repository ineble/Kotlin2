fun main(){
    val score = readLine()!!.toDouble() //콘솔로부터 입력 받음
    var grade: Char = 'F'
    if(score >= 90){
        grade = 'A'
    }else if(score in 80.0..89.9){
        grade = 'B'
    }else if(score in 70.0..79.9){
        grade = 'c'
    }
    println("score : $score, grade : $grade")

}
