fun main(){
    //Scoped functions
    println("Scoped functions")
    
    val emp=Employee()
    emp.age=23
    emp.name="Amar"
    println(emp.age)
    println(emp.name)
    
    
    // applied function -> this:Employee used
    println("apply functions")
    emp.apply{
        this.age=19
        this.name="Amartya"
    }      // return type same as class(here Employee)
    println(emp.age)
    println(emp.name)
    
    
    // let function    -> it:Employee used
    println("let functions")  
    emp.let{
        it.age=20
        it.name="Amar"
    }      // return type same as last statement data type (here unit)
    println(emp.age)
    println(emp.name)
    
    
    // with function
    println("with functions")
    with(emp){
        age=18
        name="Charchil"
    }      // return type same as last statement data type (here unit)
    println(emp.age)
    println(emp.name)
    
    
    //run function
    println("run functions")
    emp.run{
        age=20
        name="Amartya"
    }     // return type same as last statement data type (here unit)
    println(emp.age)
    println(emp.name)
    
    
}

//Data class
data class Employee(var age:Int=20,var name:String="")

//
