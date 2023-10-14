//COMPANION AND JVM STATIC
fun main(){
    //without companion
    myclass.myobj.f()
    myclass.myobj2.run()
    
    //use companion to neglect the "myobj3" refrence
    myclass.display()
}

//class
class myclass{
    
    object myobj{
        fun f(){
            println("this is object 1")
        }
    }
    
    object myobj2{
        fun run(){
            println("object2 is running")
        }
        var ab=234
    }
    
    //companion is used to redirect the method of obj3 to call in main function without any refrence
    companion object myobj3{
        @JvmStatic   // "@JvmStatic" is used to link this method from java file with the help of "myclass" class
        fun display(){
            println("Object3 is running")
        }
    }
    
}


//with the help of jvmstatic

/* public class filename{
         public static void main(String args[]){
                myclass.display()
         }      
   }
 * */
