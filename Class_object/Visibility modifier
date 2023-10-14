fun main(){
    //VISIBILITY MODIFIER
    
    println(a)
    println(b)
    println(c)
//     println(d)  

    println("obj1 call")
    val obj=myclass()
    println(obj.x)
    println(obj.y)
//     println(obj.z)
//     println(obj.s)
    
    println("obj2 call")
    val Obj2=B()
    println(Obj2.test())
}

public var a=5          // access--> everywhere
internal var b=3       // access--> with in module
private var c=34       // access--> with in same file
// protected var d=24 ---> it will throw an error as it's protected and restricted from high level declaration

open class myclass{
    public var x=23         //class member -->everywhere
    internal var y=5343     // class member --> with in same module
    private var z=34        //class member --> with in same class
    protected var s=13      //class member --> subclasses
}

class B :myclass(){
    fun test(){
    println(x)
    println(y)
    println(s)
//     println(z)  // private
    }
}
