fun main(){

    calculateTimeAndRun { Loop(100000) }
}

inline  fun calculateTimeAndRun(fn:()->Unit){
    val start=System.currentTimeMillis();
    fn()
    val end =System.currentTimeMillis()
    println("Time taken ${end-start} ms")
}

fun Loop(n:Long){
    for(i:Long in 1..n){}
}