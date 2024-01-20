fun main(){


    //Generic  in kotlin

    //calling of generic

    val iContainer=Container<Int>(2)
    println(iContainer.getValue())

    val SContainer=Container<String>("hello")
    println(SContainer.getValue())

    //how to check class structure ctrl+click

    //use of vararg in kotlin

    addOn(2,2,2,2,2)
    addOn(7,5,4,6)
}

//vararg pass muttiple value of data type consider as a array (in our case it is Int u can pass other)
//means variable number of arguments

fun addOn(vararg values:Int){

    var sum=0
    for (i:Int in values){
        sum+=i
    }
    println(sum)
}


//generic class

class Container<T>(var data:T){

    fun setValue(value:T){
        data=value
    }
    fun getValue():T{

        return  data
    }

}
