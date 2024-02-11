fun main(){


    val circle2=Circle2(3.0)
    println(circle2.toString())
}



open class Shape2{


    open fun area(): Double{return 0.0}
//    override fun toString(): String {
//        return "i am shape2"
//    }                              first h erichery
    }


class Circle2(val radius:Double): Shape2(){

    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
