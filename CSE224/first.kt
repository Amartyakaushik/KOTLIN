// fun main(args: Array<String>) {
//     // print("Hii Friends")
//     // println("Hello guys!!")

//     // var a = 40.9
//     // // static binding
//     // // a = 40.5
//     // println(a)
//     // // var try = 34
//     // // println(try)
//     // // var `try` = 34
//     // // println(`try`)
    

//     // ------------- 20 aug---------------
//     // val b = 232
//     // // println(a + b)
//     // var c:Int
//     // // var c:Integer  // won't work
//     // c = a + b
//     // println("-------"+c+"-----------")

    
//     // var __num1 = 2
//     // var num2 = 3
//     // var $num = 32     // not allowed
//     // var 2num =23      // not allowed
//     // var num  2 = 3    // void space is not allowed in the name of the variable
//     // var String=123   // it'll work fine but not recommended
//     // var true = 23    // won't work
//     // var null = 32    // won't work
//     // println((num1>num2)?num1:num2)


//     var age:Int = 23
//     println(age)

//     val person = Person()
//     person.displayInfo()


// }

// fun greet(){
//     val message: String = "Hello, KOtlin!"
//     println(message)
// }

// class Person{
//     var name:String = "John Doe"
//     val age:Int = 30
//     val increment = 1;
//     fun displayInfo(){
//         println("Name: name, Age: $age, after one year the age will be ${age + increment}")  // var imperoblel
//     }
// }

// // this is a single line comment

// /*
// this is the multi 
// line
// comment
//  */

// ---------- Array-------------22---------------
fun main(){
    // val name: String = """ Amartya
    //                     Kaushik """
    // println(name)

    // val canVote : Boolean = true
    // println(canVote)

    // val arr1 = arrayOf(2,23,223,2333)
    // val arr2 : Array<Int> = arrayOf(4,45,455,4455)
    // val arr3 = Array(5) {i -> i * 1}

    // for(i in arr3){
    //     println(i)
    // }
    // for(i in arr2){
    //     println(i)
    // }
    // for(i in arr1){
    //     println(i)
    // }

    // // Functions of array
    // val size = arr3.size
    // println("size of array 3 is $size")

    // if(arr2.isEmpty()){
    //     println("Array2 is an empty array")
    // }else{
    //     println("Array2 is not an empty array")
    // }

    // val index = arr2.indexOf(45)
    // println(index)

    // val matrix: Array<A

    //-------------26 AUG---------------
    //------Operators----------
    var x = 5;
    println(x.shr(2));

    var y = 23;
    println(x<y  && y>x);
    var c =  x and y;
    println(c);
    // println(x.and(y));
    // println(shl(x));
    
    //----------------ELVISH OPERATOR---------------
    var str: String ? = null
    var str2: String? = "May be declare nullable stirng"
    var len1: Int = str ?.length ?: -1
    var len2: Int = str2 ?.length ?: -1

    // println("length of str is ${len1}")
    // println("length of str2 is ${len2}")
    // println("-----------While and Do-While------")
    // var n = 5;
    // While(n< 10){
    //     println("----$n-----")
    //     n++
    // }do{
    //     println("------------+++$n+++----------")
    // }

    //-------------use of WHEN-----------
    var choice = 3;
    var result = when(choice){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Default value"
    }

    println(result)

    //-------------Usage of Of----------
    for(i in 6 until 10){
        println(i)
    }
    println(1.to(10))

    for(i in 16 downTo 10 step 2){
        println(i)
    }


    //------use of While---------
    var i = 0
    // While(i < 15){
    //     println(i)
    //     i++;
    // }

    // do{
    //     println(i)
    //     i++
    // }While(i < 5)

    // var optr = "+";
    var optr = readLine()?.toLowerCase()

    var operand1 = 23;
    var operand2 = 32;
    when(optr){
        "+" -> println(operand1 + operand2)
        "-" -> println(operand1 - operand2)
        "*" -> println(operand1 * operand2)
        "/" -> println(operand1 / operand2)
        "%" -> println(operand1 % operand2)
        // "&&" -> println(operand1 && operand2)
        // "||" -> println(operand1 || operand2)
        // "!" -> println(operand1 ! operand2)
        else -> println("Enter a valid operator")
    }

    //---------------Operators---------------------
    println("comparing ")
    var ac = 30
    var ad = 40
    println("ac > ad = "+(ac>ad))
    println("ac < ad = "+(ac < ad))
    // println("ac < ad = "+(ac.acompareTo(ad) < 0))
    println("ac >= ad = "+(ac>=ad))
    println("ac <= ad = "+(ac <= (ad)))
    // println("ac <= ad = "+(ac.acompareTo(ad) <= 0))
    println("ac == ad = "+(ac==ad))
    println("ac != ad = "+(!(ac?.equals(ad) ?: (ad === null))))

    //----assignment operator------------
    
    println("assignment operator ")
    var aa = 10
    var ab = 5
    aa+=ab
    println(aa)
    aa-=ab
    println(aa)
    aa*=ab
    println(aa)
    aa/=ab
    println(aa)
    aa%=ab
    println(aa)

    //---------logical operator------------
    var ax = 100
    var ay = 25
    var az = 10
    var logicalOprResult = false
    if(ax > ay && ax > az)
     println(ax)
    if(ax < ay || ax > az)
     println(ay)
    if( logicalOprResult.not())
     println("Logical operators")

    //---------------Biteise operator ------
    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits:  " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())

    //-------------27--- Function------------
    println("Function")
    // val str = task()
    // println(c)

}

// fun task():String {
   
//     // return "Performing task"
//     val str = "Perfroming task"
//     return str
// }
// // }
//------------------------HOME WORK---------------------------
// check all the functions which are available with arrays in kotlin 
// make calculator with the help of When()
// find factorial using recursion
// find sum of n numbers using recursion
// find out the sum of even num for the given range of 1 to n using recursion and funciton calling 