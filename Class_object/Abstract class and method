//Abstract class and method
fun main(){
    val circle:Shape=Circle(3.0)
    val square:Shape=Square(4.0)
    
    println(circle.area())
    println(square.area())
   
    val shape:Array<Shape> =arrayOf(Circle(4.2),Triangle(4.0,3.0))
    calculateArea(shape)
    

}

//function
fun printArea(shapes:Shape){          //here parent class is passed as explicit data type
    println(shapes.area())
}

//array of function
fun calculateArea(shapes: Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}


//Parent class
abstract class Shape{     //"abstract" abstract class (to define that some of it's method are not fixed) the class is not complete yet
    abstract fun area():Double
}

//Child class
class Circle(var radi:Double):Shape(){
    override fun area():Double{
        return Math.PI*radi*radi
    }
}

class Square(var side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
}

class Triangle(var base:Double,var height:Double):Shape(){
    override fun area():Double{
        return 0.5*base*height
    }
}
