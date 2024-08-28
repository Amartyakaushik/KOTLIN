// // fun main(){
// //     // var arr = arrayOf(1,2,3,4,5,6,7)
// //     // var evenSum =0
// //     // var oddSum = 0
// //     // for(i in arr){
// //     //     if(i % 2 ==0){
// //     //         evenSum += i
// //     //     }else{
// //     //         oddSum += i
// //     //     }
// //     // }
// //     // println("Sum of evenSum elements of array is "+evenSum)
// //     // println("Sum of oddSum elements of array is "+oddSum)

// //     print("Enter the purchasing amount: ")
// //     var pAmnt = readLine()?.toInt() ?: 800
// //     var hasMembership = true

// //     if(pAmnt >= 1000){
// //         if(hasMembership){
// //             println("eligible for 20% discount")
// //         }else{
// //             println("eligible for 10% discount")
// //         }
// //     }else{
// //         println("not eligible for any discount")
// //     }

// // }
// // // fun oddSum(var arr)

// fun main(){
//     val factorial = fact(5)
//     println(factorial)

//     val sumOfNnambars = sumOfN(21)
//     println(sumOfNnambars)

//     val sumOfEven = sumEven(10)
//     println(sumOfEven)

//     var ford = Car("Ford","Mustang",2021)
//     var bmw = Car("BMW","BMW xm",2023)
//     ford.displayDetails()
//     bmw.displayDetails()
// }



// //--------------27------------
// // find factorial using recursion
// fun fact(a:Int):Int{
//     if(a==0 || a==1){
//         return 1
//     }
//     return a * fact(a-1)
// }
// // find sum of n numbers using recursion
// fun sumOfN(num:Int):Int{
//     if(num==0){
//         return 0
//     }

//     return num + sumOfN(num - 1)
// }
// // find out the sum of even num for the given range of 1 to n using recursion and funciton calling 
// fun sumEven(num:Int):Int{
//     var sum = 0
//     if(num==0){
//         return 0
//     }
//     for(i in 1..num){
//         if(i % 2 == 0){
//             sum += i
//         }
//     }
//     return sum
// }

// // create a class and it's two objects with different parameters
// class Car(var brand: String, var model: String, var year: Int){
//     fun displayDetails(){
//         println("Brand: $brand, Model: $model, Year: $year");
//     }
// }

// // fun main(){
// //     var farenheit = {cels : Double -> ((cels * 9) / 5) + 32 }
// //     println(farenheit(30.0))
// // }

fun main(){
    // var car1 = Car()
    var car1 = Car("23","sdfsd",2323)
    car1.getInfo()
}
class Car{
    var make: String = ""
    var model: String = ""
    var year:Int = 0

    // Car(){
    //     println("THis is the constructor")
    // }
    constructor(make:String, model:String, year:Int){
        this.make = "Ambassdor"
        this.model = "Mittior"
        this.year = 1973
    }

    constructor():this("amabas","adf",2342)
    fun getInfo():String{
        return "$make $model , year $year"
    }
}