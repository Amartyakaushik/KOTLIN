//Overriding 
fun main(){
    var oneplus=oneplus()
    var Nokia=mobile()
    
    println(oneplus.display())
    println(Nokia.display())
    println(oneplus.makecall())
    println(Nokia.makecall())
}


//parent class
open class mobile{    //    open class mobile(type:String) -then we need to parameter in child class also
    val name="Genral phone"
    val type="Smart phone"
    
    open fun makecall(){
        println("Making call")
    }
    open fun display(){                     //we use "open" to let the child class override this method
        println("General phone display")
    }
}
    
//child class    
class oneplus:mobile(){              //class oneplus:mobile("anyargument")   -because of lineno.12
    override fun display(){                //"override" is used to override the method from the inherited parent class
        println("Oneplus display")
    }
    
    override fun makecall(){
        super.makecall()                 //super is used to call the method from parent also
        println("calling with the Oneplus")
    }
}


