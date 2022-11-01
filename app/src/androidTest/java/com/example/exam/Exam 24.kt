fun main(){
   var mutablelist = mutableListOf<Int>(10,20,30)
    mutablelist.add(3,40)
    mutablelist.set(0,50)
    println(
        """
           list size : ${mutablelist.size} 
           list data : ${mutablelist[0]},${mutablelist.get(1)},${mutablelist.get(2)},${mutablelist.get(3)} 
        """
    )

}
