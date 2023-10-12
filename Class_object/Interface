//INTERFACE
fun main(){
    val amar=person("Amartya")
    amar.saymyname()   
    
    dragobject(arrayOf(Circle(3.0),Triangle(6.0,4.0),person("Amartya")))
    
}

//Interface   ---> used  to inherit methods or properties in classes with similar behaviour not only with same inheritance
interface Draggable{
    fun drag()
}

//Function to call the interface method
fun dragobject(objects :Array<Draggable>){
    for(obj in objects){
        obj.drag()
    }
}

//Parent class
abstract class Shape:Draggable{    
    abstract fun area():Double
 
}

//Child class
class Circle(var radi:Double):Shape(){
    override fun area():Double{
        return Math.PI*radi*radi
    }
    override fun drag(){
        println("Circle is dragging")
    }
}

class Square(var side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
    override fun drag(){
        println("Square is dragging")
    }
}

class Triangle(var base:Double,var height:Double):Shape(){
    override fun area():Double{
        return 0.5*base*height
    }
    override fun drag(){
        println("Triangle is dragging")
    }
}

class person(val name:String):Draggable{
    override fun drag(){
        println("Person is dragging")
    }
    fun saymyname(){
        println("Hey $name")
    }
}
