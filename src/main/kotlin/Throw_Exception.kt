import java.lang.IllegalArgumentException

fun main(){

    listcreadted(5)
    listcreadted(-2)
}

fun listcreadted(count:Int){
    if(count<0){

        throw IllegalArgumentException("Please provide correct size")
    }
    else{
        println("list is created of size :$count")
    }
}