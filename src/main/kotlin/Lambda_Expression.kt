fun main(){
    //declaration of function type

    var fn:(a:Int,b:Int)->Int=::sumo
        //lambda is anonomyous function
        //define a lambda expression
    val lambda1={x:Int,y:Int->x+y}

    val lambda2={
        println("Hello world")
        val a=2+3
        //last line return type
        "Hello chezzy code"
    }

    //because it is just like function so execute like function
    println(lambda1(2,3))
    lambda2()

    //variation  tye
    val singlevalue={x:Int->x*x}

    //own define datatype
              
    val own :(Int)->Int={x->x*x}

    val sayHi={msg:String-> println("Hello $msg")}

    val sayHi2:(String)->Unit= {msg-> println("Hello $msg")}

    //some single param lambda
    val singeparam:(Int)->Int={x->x+x}

    //how to simplify it more only for single param
    val Simplfiy:(Int)->Int={it*it}

    //some more info
    calculater2(2,4,{a,b->a+b})

    
    calculater2(2,4) { a, b->a+b}

}

fun sumo(a:Int,b:Int):Int=a+b
                    //parameter of function type
fun calculater2(a:Int,b:Int,op:(Int,Int)->Int):Int{
    return  op(a,b)
}