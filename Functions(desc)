import kotlin.math.pow

//Function overloading
fun addition(num1:Int,num2:Int):Int{
    val result=num1+num2
    return result
}
fun addition(num1:Double,num2:Double):Double{
    val result=num1+num2
    return result
}
fun mul(a:Double,b:Double):Double{
    val result=a*b
    return result
}
fun power(i:Double,j:Double):Double{
//     val result=num1.pow(num2)
    return i.pow((j))
}
//Main funtion
fun main(){
    val result=addition(2,3)
    println(result)
    println(addition(2.0,3.0))
    
    val result1=mul(a=3.2,b=6.4)              //Named argument
    println(result1)
    
    val fn=::power      //Funtion stored in variable           //passing function as a parameter
    println(fn(2.0,3.0))
}
