import kotlin.math.pow

fun main(){

    //function overloading
    var a=addition(.2,2)
    println(a)

     var b = addition(2.7,2.7)
     println(b)

    //named argument
    println(addition(a=8,b=2))
    //squence chanhe possible in parameter named
    println(addition(b=8,a=2))

    //function ko variable mein bhi store kar saktay haib

    var function: (a: Double, b: Double) -> Double =::addition        
	//in this case work when function name is same
    println("value is :"+function(2.1,2.1))

    //now re assigning
    function=::power
    println("power is :"+function(2.0,3.0))




}

fun addition (a: Int,b:Int):Int{
    return a+b
}
fun addition (a: Double,b:Double):Double{

    return a+b
}

//power function
fun power (a: Double,b:Double):Double{

    return a.pow(b)
}