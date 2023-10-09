//CONSTRUCTORS
//Two types of construcstor 1-Primary and 2-Secondary
fun main(){
    //Object
    var car= automobiles("Tata",4,5,"Petrol",true)
    var person=person("Amartya",20)
    
    var student=collage_student("Amartya",true)
    
    println(car.name)
    println(car.hasairbag)
    println(person.name)
    println(student.name)
}
    //TYPE-1
    //Primary constructor
    class automobiles(val name:String,val wheels:Int,val maxseats:Int,val enginetype:String, airbag:Boolean){
        var hasairbag=airbag
        init{
            println("Created")
        }
    }
    //Secondary constructor
    class person(namepara:String,agepara:Int){   //here "namepara" and "agepara" are the parameters and
        val name=namepara                        //"name" and "age" with val are the properties...
        val age=agepara
    }
    
    //TYPE-2
    //Primary constructor
    class collage_student(val name:String,val batch:String,val year:Int, adultcheck:Boolean){
        var isadult=adultcheck

    //Secondary constructor
    constructor(std_name:String,std_isadult:Boolean):this(std_name,"K22DR",2,std_isadult)
    }
   
   
   
   
   
