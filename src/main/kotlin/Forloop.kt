fun main(){

//    for loop
    for (i in 1..5){
        println("hello")
    }
    //variation with increment
    for (i in 1..5 step  2){
        println(i)
    }
        //variation with until
    for (i in  1 until  5){
        println(i)
    }
        //variation with downTo
    for (i in  10  downTo 1 step 2)
         println(i)

    var number=2;
    for(i in 1..10)
    {
       println(number.toString()+"x"+i+"="+(number*i))
       //string template
       println("$number x $i = ${number * i}")
    }

}