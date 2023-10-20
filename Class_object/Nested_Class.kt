//NESTED CLASS
fun main(){
    val obj=Outer()
    obj.i
    
    val obj2=Outer.Nested()
    obj2.run()
    
    val obj3=Outer().Nested2()
    obj3.run2()
}

//Class 
class Outer{
    var i=0;
    
    class Nested{
        fun run(){
            println("This is first Nested class")
//             println("$i") -> no access to the properties of outer class
        }
    }
    
    inner class Nested2{
        fun run2(){
            println("This is second Nested class using (inner) keyword and have the access of $i")
        }
    }
}
