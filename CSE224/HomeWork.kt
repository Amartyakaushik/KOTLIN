// fun main(){
//     // var arr = arrayOf(1,2,3,4,5,6,7)
//     // var evenSum =0
//     // var oddSum = 0
//     // for(i in arr){
//     //     if(i % 2 ==0){
//     //         evenSum += i
//     //     }else{
//     //         oddSum += i
//     //     }
//     // }
//     // println("Sum of evenSum elements of array is "+evenSum)
//     // println("Sum of oddSum elements of array is "+oddSum)

//     print("Enter the purchasing amount: ")
//     var pAmnt = readLine()?.toInt() ?: 800
//     var hasMembership = true

//     if(pAmnt >= 1000){
//         if(hasMembership){
//             println("eligible for 20% discount")
//         }else{
//             println("eligible for 10% discount")
//         }
//     }else{
//         println("not eligible for any discount")
//     }

// }
// // fun oddSum(var arr)

fun main(){
    val c = task()
    println(c)
    val sum = add(2,3)
    println(sum)
    rec()
}

fun add( a:Int, b:Int):Int{
    val sum = a + b
    return sum
}
fun task():String {
   
    // return "Performing task"
    val str = "Perfroming task"
    return str
}

//--------Recursive function--------
var count = 0
fun rec(){
    count++;  // semicolon works with the statement
    if(count<= 5){
        println("Hello " + count);
        rec();
    }
}

class Car{
    var make: String = ""
    var model: String = ""
    var year:Int = 0
    fun getInfo():String{
        return "$make $model , year $year"
    }
}