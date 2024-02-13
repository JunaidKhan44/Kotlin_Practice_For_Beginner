fun main(){

    println(AS.num)  //for a
    BS.test()        //for b
}

//it is a object we can not make class first to make these object
//object declaration
object  AS{
    val num:Int=10

}
object  BS{
    val p:Int=10
    fun test(){
        println("I am Bs")
    }
}