fun main(){
    //DATA CLASSES
    println("Data Classes")
    val p1=person(3,"Amar")
    val p2=person(2,"Char")
    println(p1)
    println(p2)
    //Hashcode
    println(p1.hashCode())
    println(p1==p2)  // return "TRUE" when we are using data class else "FALSE"
    
    //copy function
    val p3=p1.copy()
    println(p3)
    val p4=p2.copy(23)
    println(p4)
    
    //Destructuring
    val (id,name)=p2
    println(id) //2
    println(name)  // "Char"
    
    //Components
    println(p2.component1())   //2
    println(p3.component2())   // "Amar"
}

// data class used to store data of class 
data class person(val id:Int,val name:String)
