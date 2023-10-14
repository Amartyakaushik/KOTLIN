fun main() {
    //CONDITIONAL STATEMENTS
    //if else
    var num=23
    var result=if(num%2==0){
        println("even number")
    } else{
        println("odd number")
    }
    println(result)
    
    var num1=45
    result=if(num>num1){
        println("num is greater")
    } else if(num<num1){
        println("num1 is greater")
    }else{
        println("both are equal")
    }
    println(result)
    
    //Range
    var num2=6
    var result1=num2 in 1..6  //1,2,3,4,5,6
    var result_1=num2 in 1 until 6 // 1,2,3,4,5
    println(result1)
    println(result_1)
    
    //When statement
    var animal="cat"
    when(animal){
        "cat" -> println("animal is cat")
        "dog" -> println("animal is dog")
        "horse" -> println("animal is horse")
        else -> println("animal not found")
    }

    val num3=4
    val res=when(num3){
        1->"One"
        2->"Two"
        3->"Three"
        4->"Four"
        else->"error"
    }
    println(res)
    
    
}
