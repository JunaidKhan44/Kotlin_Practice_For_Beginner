fun main(){

    //Scenario --1

    calculator(2.0,3.8,::sum1)
    //type sensitive 
    
}

fun sum1(a:Double,b:Double):Double{
    return a+b }

fun calculator(a:Double,b:Double,gn:(Double,Double)->Double){
    val result=gn(a,b)
    println(result)
}