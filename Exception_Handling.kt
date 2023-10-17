import java.lang.NullPointerException
import java.lang.Exception
import java.lang.IllegalArgumentException

fun main(){
    //Exception handling
    println(" try catch finally")
    var arr=arrayOf(1,4,5)
    try{
        arr[5]
    }
    catch(ex:NullPointerException){
        println("error")
    }
    catch(e:Exception){
        println("pls check the array index ")
    }
    finally{
        println("I'll execute no matter what")
    }
    
    println("EXCEPTION THROW")
    //EXCEPTION THROW
    createuserlist(32)
    createuserlist(34)
    createuserlist(-23)
}

fun createuserlist(count:Int){
    if(count<0){
        throw IllegalArgumentException("count must be greater than 0")
    } else {
        println("User list created containing $count users")
    }
}
