fun main(){
    println("Null safety")
    //nullable or non nullable
//     var GENDER="Women"    Not Nullable
    var gender:String?=null   //Nullable
    println(gender)
    
    //safe call operator
    println("Safe call operator")
    println(gender?.uppercase())
    
    //to print multiple statement with the use of ( ?.let{} )
    gender?.let{
        println("Line 1")
        println("Line2 $gender")
        println("Line3 $it")
    }
    // GENDER?.let{}
    
    //ELVIS OPERATOR ( ?: ) -> use to give a default value to a null value
    println("Elvis operator")
    var selectedvar=gender?:"NA"
    println(selectedvar)
                
    //Not null asserted  operator ( !! ) -> if variable is not null then use function else won't
//     var value =gender!!uppercase()
    var value=gender!!.toUpperCase()
    println(value)
}
