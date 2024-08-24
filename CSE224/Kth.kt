//ARRAY
fun main(){
    var arr=arrayOf("One","Two","Three") //"arrayOf" is the funtion
    for(i in arr){
        println(i)
    }
    println()
    
    for(i in arr.withIndex()){       // to print with index 
        println(i)
    }
    println()
    
    for((i,e) in arr.withIndex()){         // to print with index value also
        println("$i-$e")
    }
    //Particular index value
    println(arr[0])                     // particular index value
    println(arr.get(1))                  // particular index value
    println(arr.set(2,"teen"))          // reassigning any index value
    println(arr[2])
    println(arr.size)                   // size check
//     println(arr[3])//error index value is greater
}
