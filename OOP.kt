    //OOP
//Class definition
class car(val name:String,val type:String,var kmran:Int){            //Properties
    fun drive(){
        println("$name is driving")
    }
    fun applybrake(){                                               //Methods
        println("Brakes applied")
    }
}
class person(val name:String,var age:Int){
    fun canvote():Boolean{
        return age>18
    }
}

fun main(){
    //Object declaration
    val Mahindra=car("XUV 500","EV",12323)                      
    val Tata=car("Tata Nexon","CNG",98765)
    println(Mahindra.name)
    println(Tata.type)
    println(Tata.applybrake())
    println(Mahindra.drive())
    
    val Charchil=person("Sumangal",20)
    val Amartya=person("Amartya",19)
    println(Charchil.canvote())
    println(Amartya.canvote())
}
