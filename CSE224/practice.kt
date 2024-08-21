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
    dragObjects(arrayOf(Square(3.0),Triangle(3.2,2.3), Person("Amartya")))
}