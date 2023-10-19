fun main(){
    println("Extension function")
    println("This is me".formattedString())
    
    //Inline function
    println("Inline function")
    calculateTimeandRun{loop(200000)}
}

fun String.formattedString():String{
    return "-------\n$this\n-------"
}

fun calculateTimeandRun(fn:()->Unit){
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("Time taken is ${end - start}ms")
}

fun loop(n:Long){
    for(i in 1..n){}
}
