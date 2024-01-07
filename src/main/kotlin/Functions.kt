fun main(){

 //  var result= add(2,2)
 //   println(result)

// //   evenorodd(9)
//    var result=minus(2,1)
//    println(result)

    printstring(3)  //argument
    printstring()
}
//default argument
fun printstring(count:Int=2){   //parameter
  //count cannot be re assign because it is of val type
    for(i in 1..count)
    {
        println("hello $i")
    }
}

//  functions
fun add(num1 :Int, num2:Int):Int
{
    var sum=num1+num2;
    return  sum
}
fun evenorodd(number :Int){

    var result=if (number%2==0) "Even" else "old"
    println(result)

}

//inline function in kotlin
fun  minus (num1 :Int , num2:Int): Int =num1-num2