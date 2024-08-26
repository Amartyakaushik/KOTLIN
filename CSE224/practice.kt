// fun main(){
//     val Raghu = Person("Raghuwar Das", 20)
//     println(Raghu.name)
//     println(Raghu.age)
//     Raghu.age = -1
//     println(Raghu.age)
//     // println(Raghu.canVote())
// }

// class  Person(val name: String, var age: Int) {
//     fun canVote():Boolean{
//         return age >= 18
//     }
// }


//------------------------LECTURE17--GETTER--SETTER--LATEINIT---------------------
// class Person(nameParam:String, ageParam:Int){
//     var name:String = nameParam
//     get(){
//         return field.toUpperCase()
//     }
//     var age:Int = ageParam

//     set(value){
//         if(value >= 0){
//             field = value
//         }else{
//             println("Age cann't be negative!")
//         }
//     }
// 
// }

// //------------------------LECTURE18--INHERITANCE----------------------
// open class Phone{
//     // to override this property, it must be open to...
//     open var name:String = "General Phone"
//     fun call(){
//         println("Calling...")
//     }
// }

// class SmartPhone : Phone(){
//     // var name:String = "Smart Phone"   // can't override like this 

//     //-----------------------LECTURE-19--OVERRIDING PROPERTIES------------------
//     override var name:String = "Smart Phone"
// }

// fun main(){
//     val phone = SmartPhone()
//     phone.call()
//     val phone2 = Phone()

//     println(phone.name)
//     println(phone2.name)
// }


// //------------------------------LECTURE-20--POLYMORPHISM--------------------------
// open class Shape{
//     open fun calArea():Double = 0.0
// }
// class Square(var side:Double):Shape(){
//     override fun calArea():Double{
//         return (side * side)
//     }
// }
// class Rect(var length:Double, var width:Double):Shape(){
//     override fun calArea():Double{
//         return (length * width)
//     }
// }
// class Triangle(var base:Double, var height:Double):Shape(){
//     override fun calArea():Double{
//         return (0.5 * base * height)
//     }
// }

// fun printArea(shapes : Array<Shape>){
//     for(shape in shapes){
//         println(shape.calArea())
//     }
// }

// fun main(){
//     val square : Square = Square(9.0)
//     val square2 : Shape = Square(3.2)
//     val rectangle : Shape = Rect(2.3,1.1)
//     println(square.calArea())
//     println(square2.calArea())
//     println(rectangle.calArea())

//     var shapes = arrayOf(Square(2.3),Triangle(2.0,9.0))
//     printArea(shapes)
// }


//---------------------------LECTURE-23--INTERFACES-----------------------------
abstract class Shape:Draggable{
    abstract fun calArea():Double
}
class Square(var side:Double):Shape(){
    override fun calArea():Double{
        return (side * side)
    }
    override fun drag(){
        println("Square is dragging")
    }
}
class Rect(var length:Double, var width:Double):Shape(){
    override fun calArea():Double{
        return (length * width)
    }
        override fun drag(){
            println("Rectangle is dragging")
        }
}
class Triangle(var base:Double, var height:Double):Shape(){
    override fun calArea():Double{
        return (0.5 * base * height)
    }
        override fun drag(){
            println("Triangle is dragging")
        }
}

class Person(val name: String):Draggable{
    override fun drag(){
        println("$name is dragging")
    }
}
interface Draggable{
    fun drag()
}
fun dragObjects(shapes:Array<Draggable>){
    for(shape in shapes){
        shape.drag();
    }
}

fun main(){
    // dragObjects(arrayOf(Square(3.0),Triangle(3.2,2.3), Person("Amartya")))


    //--------------24-Type-Checking------------------------------
    var rectangle = Rect(23.0, 2.0)
    var square = Square(22.0)
    var person = Person("Charchil")

    // //-------------Type Checking---------------
    // if(rectangle is Rect){
    //     println("this is an object of Rect class")
    // }else{
    //     println("this is not an object of Rect class")
    // }

    //-----------Smart Casting-------------------
    var arr = arrayOf(rectangle,square)
    for(obj in arr){
        println(obj.calArea())
    }

    var arr2 = arrayOf(rectangle,square,person)
    for(obj in arr){
        // println(obj.calArea())    // this will return error as person is not a type of shape so, it won't implement the method calArea() as here obj will only be able to implement "drag()" function because of smart typeCasting...

        println(obj.drag())
    }

    //--------------Object Declaration-----------------------
    A.makeSound()

    //--------------Object Expression--------------------
    // var mohit = object:People() {
    //     override fun getAge(){
    //         age++;
    //         println("My age is $age")
    //     }
    // }
    // mohit.getAge()

    var obj2 = object:makeSound{
        override fun makeSound(){
            println("Hahahah")
        }
    }
    //------------------27--Companion Object------------------

    // var pizza = Pizza.Factory.order("Corn")    // without the use of companion
    var pizza = Pizza.order("Corn")     // with the use of companion
    println(pizza.pizzaType)
    println(pizza.popping)
//-----------------------28--Data Classes and Equals-------------
var human = Species("Human",75)
println(human.component1())  // this will return the 1st component (type)
println(human.component2())  // this will return the 2nd component (avgAge)

//-----------------------29--Enum--Sealed Classes-----------------------
var day = Day.MONDAY
println(day.num)
day.formattedDay()
for(i in Day.values()){
    println(i)
}

// -------------------------Sealed classes--------------
var tile = Red("Mushroom",20)
val points = when(tile){
    is Red -> tile.point * 5
    is Blue -> tile.point * 10
}
println(points)


//------------------------33 -  Higher Order Function and function Types--------------
var fn = ::sum
println(fn(23,32))

calculator(23.23,12.32,::mul)

//------------------------34 -  Lambda Expression ----------------

var lambda = {a:Int, b:Int -> a*b }
var lambda2:(Int,Int) -> Int = {a,b -> a*b }
var multiLineLambda = {
    println("Hello Lambda")
    val a = 23.2
    "Print hii"
}
var singleParamLambda = {x:Int -> x * x}
var simplifySingleParam:(Int) -> Int = {it + it}

println(lambda(12,12))
println(lambda2(22,11))
multiLineLambda()
println(singleParamLambda(13))
println(simplifySingleParam(100))
calculator(1.2,3.4) {a,b -> a * b}

//----------------35 -- Map, Filter, Foreach Loop--------------
val num = listOf(1,2,3,44,5)
var list1 = num.filter(::isOdd)
var list2 = num.filter(fun(a:Int):Boolean {
    return a % 2 != 0
})
var list3 = num.filter{it % 2 != 0}
println(list1)
println(list2)
println(list3)
var userList = listOf(User(1,"abba"),User(2,"bubba"))
var list4 = userList.filter{it.id == 2}
println(list4)
var list5 = num.map{it * it}
var list6 = userList.map{
    PaidUser(it.id, it.name, "Paid")
}

println(list5)
println(list6)
num.forEach(println(it))
}

object A{
    var name = "Mohitba"
    fun makeSound(){
        println("$name Aaaaahhhhh!")
    }
}

interface makeSound{
    fun makeSound(){
        println("SOundaaaaa!")
    }
}
class People{
    var age = 23
    open fun getAge(){
        println(age)
    }
}
//------------------27--Companion Object------------------

class Pizza(var pizzaType:String, var popping:String) {
    companion object Factory{
        @JvmStatic
        fun order(type:String):Pizza {
            return when(type){
                "Corn" -> Pizza("SweetCorn","With cheese")
                "Tomato" -> Pizza("Tomato", "Without cheese")
                else -> Pizza("General Pizza","With myonees")
            }
        }
    }
}

//-----------------------28--Data Classes and Equals-------------
data class Species(val type:String, var avgAge:Int)

//-----------------------29--Enum--Sealed Classes-----------------------
enum class Day(val num:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FIRDAY(6),
    SATURDAY(7);

    fun formattedDay(){
        println("Day is $this")
    }
}


// -------------------------Sealed classes--------------
sealed class Tile
class Red(val type:String, val point:Int):Tile()
class Blue(val point:Int):Tile()

//------------------------33 -  Higher Order Function and function Types--------------
fun sum(a:Int, b:Int) : Int {
    return a + b
}
fun mul(a:Double, b:Double):Double{
    return a * b
}

fun calculator(a: Double, b:Double, gn:(Double, Double) -> Double){
    var result = gn(a,b)
    println(result)
}

//----------------35 -- Map, Filter, Foreach Loop--------------
fun isOdd(a:Int):Boolean{
    return a % 2 != 0
}

data class User(val id:Int, val name:String)
data class PaidUser(val id:Int, val name:String, val type:String)