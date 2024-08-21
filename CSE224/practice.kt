fun main(){
    val Raghu = Person("Raghuwar Das", 20)
    println(Raghu.name)
    println(Raghu.age)
    Raghu.age = -1
    println(Raghu.age)
    // println(Raghu.canVote())
}

// class  Person(val name: String, var age: Int) {
//     fun canVote():Boolean{
//         return age >= 18
//     }
// }

class Person(nameParam:String, ageParam:Int){
    var name:String = nameParam
    var age:Int = ageParam

    set(value){
        if(value >= 0){
            field = value
        }else{
            println("Age cann't be negative!")
        }
    }

    // get(){
    //     return field.toUpperCase()
    // }
}