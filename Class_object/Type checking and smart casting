//TYPE CHECKING AND SMART CASTING
fun main(){
    val amar=person("Amartya")
    amar.saymyname()   
    
    dragobject(arrayOf(Circle(3.0),Triangle(6.0,4.0),person("Amartya")))
    
    //Type checking
    val circle=Circle(3.9)
    val square=Square(3.5)
    val arr:Array <Draggable> = arrayOf(circle, square, amar)
    for(obj in arr){
        if(obj is Circle){                         //TYPE CHECKING
            obj.drag()
        }else if(obj is Square){                   //TYPE CHECKING
            obj.drag()
        }else{
            (obj as person).saymyname()            //SMART CASTING
        }
    }
    
    
}

interface Draggable{
    fun drag()
}

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
