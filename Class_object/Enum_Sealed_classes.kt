fun main(){
    println("Enum and sealed classes")
    //Enum
    println("Enum class")
    val day=Day.Sunday
    println(day.num)
    
    day.printformatted_day()
    
    for(i in Day.values()){
        println(i)
    }
    println()
    
    //SEALED
    println("Sealed class")
    val tile1=Red("Mushroom",24)
    val tile2=Red("Room",34)
    
    println(tile1.value)
    println("$tile1.value - $tile2.value")
    
    val tile3:Tile=Red("House",234)
    val points=when(tile3){
        is Red -> tile3.value *2
        is Blue ->tile3.value *5
    }
    println(points)
    
}

//ENUM
enum class Day(val num:Int){
    Sunday(1),Monday(2),Tuesday(3),Wednesday(4),Thursday(5),Friday(6),Saturday(7);
    fun printformatted_day(){
        println("day is $this")
    }
}

//SEALED
sealed class Tile
class Red(val type:String,val value:Int):Tile()
class Blue(val value:Int):Tile()







