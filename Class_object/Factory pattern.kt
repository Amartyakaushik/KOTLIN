//KOTLIN FACTORY PATTERN

fun main(){
    var pizza1=pizza.factory.create("Peppy Paneer")
    println(pizza1)
    
    //calling the methods of factory without it's refrence
    // after defining that as companion
    var pizza2=pizza.create("Tomato")
    println(pizza2)
    
    //now if we want everyone to call the create method 
    //then we will define the constructor of "pizza" class as privat
    var pizza3=pizza.factory.create("Basics")  // hence now everyone need to call the create method
    println(pizza3)
//     i.e everyone has to call the factory
}

class pizza private constructor(val type:String,val topping:String){
    companion object factory{   // this the factory pattern
        fun create(pizzatype:String):pizza{
            return when(pizzatype){
                "Tomato" -> pizza("Tomato","Tomato,cheese")
                "Peppy Paneer" -> pizza("Paneer Farm","peppy paneer")
                else -> pizza("Basic","Onion,cheese")
            }
        }
    }
    override fun toString():String{
        return "Pizza(type='$type',toppings-'$topping')"
    }
}
