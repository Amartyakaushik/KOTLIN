import kotlin.math.pow
// Higher order function and function types

fun sum(a:Double,b:Double):Double{
    return a+b
    
}

fun powerOf(a:Double,b:Double):Double{
    return a.pow(b)
}

//Higher order function
fun calculate(a:Double,b:Double,gn:(Double,Double)->Double){   // in this any function can be passed as an argument 
    val result=gn(a,b)
    println(result)
}
//Main function
fun main(){
    println("Function type")
    val sm=sum(3.4,45.34)
    println(sm)
    var fn=::sum
    println(fn(23.3,4.34))
    
    println("Higher order function")
    calculate(34.5,234.53,::sum)
}
