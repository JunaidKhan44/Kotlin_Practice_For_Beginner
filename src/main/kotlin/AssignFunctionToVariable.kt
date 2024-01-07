import kotlin.math.pow

fun main(){


    println(sum(2.0,3.0))
    println(Power(2.0,3.0))



    //as kotlin is objected oriented as well as functional language
    //function in kotlin first class citizen treated as object pass as argument ,return function
    //function return function
    val fn: (a: Double, b: Double) -> Double =::sum
    val fn1: (a: Double, b: Double) -> Double =::Power
    val fn2: Any =::hello

    //how to call
    println(fn(3.0,4.0))


}
fun sum(a:Double,b:Double):Double{return a+b}
fun Power(a:Double,b:Double):Double{return a.pow(b)}
fun hello(a:Int):Unit{}