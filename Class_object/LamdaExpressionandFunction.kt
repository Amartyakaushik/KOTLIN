fun calculate(a:Int,b:Int,op:(Int,Int)->Int):Int{
    return op(a,b)
}

//Main function
fun main(){
    val lamda1={ x:Int, y:Int -> x+y}
   println(lamda1(2,4))
   
   val lamda2={x:Int,y:Int-> x+y }
   val lamda02:(Int,Int)->Int={x,y->x+y}  // simplification of lamda2
   println(lamda02(42,34))
   
   val lamda3:(Int)->Int={x-> (x+x)}
   val lamda03:(Int)->Int={it + it}    //simplification of lamda3
   println(lamda03(2))
   
   //Higher order
   val CAL1=calculate(1,2,{a,b ->a*b})
   println(CAL1)
   // OR 
   val CAL2=calculate(12,23){a,b-> a*b}
   println(CAL2) //SIMPLIFICATION OF CAL1
}
