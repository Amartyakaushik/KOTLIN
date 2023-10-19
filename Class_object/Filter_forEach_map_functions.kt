fun main(){
    val nums = listOf(1,2,3,4,5,6,7,8,9,10)
    val userlist= listOf(user(1,"Amar"),user(2,"Char"),user(3,"Suraj"))
    
    println(isOdd(3))
    //USE of .filter function
    println("Use of filter function")
//     val list= nums.filter(::isOdd)
    //   OR
//     val list=nums.filter(fun(a:Int):Boolean{
//         return a %2 != 0} )
    //   OR
//     val list=nums.filter({a:Int->a%2 != 0})
//     //   OR
//     val list=nums.filter{a:Int->a %2 != 0}
//     //   OR
    val list=nums.filter{it%2 != 0}
    println(list)
    val findusr=userlist.filter{it.Id == 2}
    println(findusr)
 
    
    //USE of map function
    println(" ")
    println("Use of map function")
    val list2=nums.map{it * it}
    println(list2)
    val paiduserlist=userlist.map{paiduser(it.Id,it.name,"Paid")}
    println(paiduserlist)
    
    //USE of forEach function
    println("")
    println("Use of forEach function")
    nums.forEach{println(it)}
    
}

//function
fun isOdd(a:Int):Boolean{
    return a % 2 != 0
}

// Data class
data class user(val Id:Int,val name:String)
data class paiduser(val id:Int,val name:String,val type:String)
