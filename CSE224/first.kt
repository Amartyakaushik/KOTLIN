fun main(args: Array<String>) {
    // print("Hii Friends")
    // println("Hello guys!!")

    // var a = 40.9
    // // static binding
    // // a = 40.5
    // println(a)
    // // var try = 34
    // // println(try)
    // // var `try` = 34
    // // println(`try`)
    

    // ------------- 20 aug---------------
    // val b = 232
    // // println(a + b)
    // var c:Int
    // // var c:Integer  // won't work
    // c = a + b
    // println("-------"+c+"-----------")

    
    // var __num1 = 2
    // var num2 = 3
    // var $num = 32     // not allowed
    // var 2num =23      // not allowed
    // var num  2 = 3    // void space is not allowed in the name of the variable
    // var String=123   // it'll work fine but not recommended
    // var true = 23    // won't work
    // var null = 32    // won't work
    // println((num1>num2)?num1:num2)


    var age:Int = 23
    println(age)

    val person = Person()
    person.displayInfo()


}

fun greet(){
    val message: String = "Hello, KOtlin!"
    println(message)
}

class Person{
    var name:String = "John Doe"
    val age:Int = 30
    val increment = 1;
    fun displayInfo(){
        println("Name: name, Age: $age, after one year the age will be ${age + increment}")  // var imperoblel
    }
}

// this is a single line comment

/*
this is the multi 
line
comment
 */