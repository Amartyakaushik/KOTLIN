// //DEFAULT CONSTRUCTOR
// fun main(){
//     //Object
//     val ob=calculator()
//     println(ob.add(3,4))
//     println(ob.multiplicationof(2,8))
// }

// //Class
//// as there is no constructor defined, so the kotlin will itself create a default constructor(parameter less constructor).
// class calculator{                  
//     lateinit var name:String // "lateinit" is defined to create a property with late initialisation concept (only var type and string)
//     fun add(a:Int,b:Int):Int{
//         return a+b 
//     }
//     fun multiplicationof(a:Int,b:Int):Int{
//         return a*b
//     }
// }


////GETTER AND SETTER
fun main(){
    val p1=person("Amartya",20)
    //getter with the help of dot operator
    println(p1.name)
    //setter with the help of dot operator
    p1.age=-23
    
}

//Class
class person(namepara:String,agepara:Int){
    val name=namepara
    get(){
        println("Name getter is called: ")
        return field.toUpperCase()
    }
    
    var age=agepara
    set(value){
        if(value>0){
            field=value
        }else{
            println("Age cannot be negative")
        }
    }
    
}
