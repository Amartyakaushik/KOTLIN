//Generics and Vararg
fun main(){
    val obj1=IntContainer(3)
    val obj2=StringContainer("Amartya")
    
    //generic class
    val obj3=iContainer<Int>(23)
    val obj4=iContainer<String>("Charchil")
    val obj5=iContainer<Double>(23.23)
    
    obj1.getdata()
    obj2.getdata()
    obj3.getdata()
    obj4.getdata()
    obj5.getdata()
    
    //vararg defined 
    println("Vararg var")
    add(2,3,45,34)
    add(324,234,23,423,432,4,234,34,323,4324,32,4,23)
    
}

//varag function
fun add(vararg values:Int){
    var sum=0
    for(i in values){
        sum+=i
    }
    println(sum)
}
//class
class IntContainer(var Data:Int){
    fun setvalue(values:Int){
        Data=values
    }
    
    fun getdata(){
        println(Data)
    }
}


class StringContainer(var Data:String){
    fun setvalue(values:String){
        Data=values
    }
    
    fun getdata(){
        println(Data)
    }
}


//GENERICS -> has no restriction over it's argument data type nor on return data type
class iContainer<T>(var Data:T){
    fun setvalue(values:T){
        Data=values
    }
    
    fun getdata(){
        println(Data)
    }
}
