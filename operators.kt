fun main(){
    //ARITHMETIC OPERATORS
    var i=10
    var j=2
    println(i+j)
    println(i-j)
    println(i*j)
    println(i/j)
    println(i%j)
    
    //RELATIONAL OPERATORS
    println(i>j)
    println(i<j)
    println(i>=j)
    println(i<=j)
    println(i==j)
    
    //Post/Pre increment
    println(i++)
    println(++i)
    println(--i)
    println(i++)
    
    //LOGIC OPERATORS
    val above70=true
    val knowsprog=false
    //&& operator
    var interview= above70 && knowsprog
    println(interview)
    // ||operator
    interview=above70 || knowsprog
    println(interview)
    // !operator
    var result=!interview
    println(result)
}
