//OBJECT DECLARATION

// fun main(){
//     println(A.num)
//     B.test()
// }

// object A{
//     val num=12
// }

// object B{
//     val n=234
//     fun test(){
//         println("This is object B")
//     }
// }

 
// //Singleton pattern

// fun main(){
//     sharewidget.incrementtwtlikes()
//     sharewidget.incrementtwtlikes()
//     sharewidget.incrementtwtlikes()
//     sharewidget.incrementtwtlikes()
//     sharewidget.incrementfblikes()
    
//     sharewidget.display()
// }
// object sharewidget{
//     var twtlikes=0
//     var fblikes=0
    
//     fun incrementtwtlikes()=twtlikes++
//     fun incrementfblikes()=fblikes++
//     fun display()=println("Fblikes- $fblikes ,xlikes- $twtlikes")
// } 




//Object expression
fun main(){
    var obj=object:clonnable {
        override fun run(obj:String){
            println("running $obj")
        }
        val num=12
    }
    println(obj.num)
    obj.run("object1")
}

interface clonnable{
   open fun run(obj:String)
}
