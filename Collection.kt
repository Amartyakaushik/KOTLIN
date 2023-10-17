//COLLECTION
fun main(){
    println("LIST")
    var list1=listOf(1,2,3)
    var list2=mutableListOf(23,4,2)
 // imutable list
//     list1.add(32)
    println(list1.indexOf(2))
    println(list1.contains(3))
    
    //mutable list
    list2.add(264)
    list2.remove(2)
    println(list2)
    
    list2.addAll(list1)
    println(list2)
    
//     //MAPS
       println("MAPS")
       var map1=mapOf(1 to "Amar",2 to "ALvis")
       var map2=mutableMapOf<Int,String>()
       
       //imutable map
       println(map1)
       
       //mutabel map
       map2.put(51,"Supreme")
       map2.put(45,"Raja")
       map2.put(23,"K R")
       map2.get(45)
       
       map2[23]="KvR"
       println(map2[23])
       println(map2)
    
}
