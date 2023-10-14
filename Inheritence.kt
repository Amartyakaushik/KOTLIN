//INHERITENCE
fun main(){
    //object
    var mi=smartphone()
    println(mi.type)
}

// Parent class
open class mobile{
    //Properties
    var name:String="Xiaomi"
    var type:String="Note 12"
    var volume:Int=10
    
    //Methods
    fun makecall()
    fun display()
    fun poweroff()
}

//Child class
class smartphone:mobile(){
    //additionla property
    var size_in_cms:Int=6
    
    //additional method
    var displayinfo()
}
