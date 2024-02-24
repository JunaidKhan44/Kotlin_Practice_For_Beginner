fun main(){

    var circle=Circle3(4.0)
    println(circle.area())
    circle.display()
}

abstract  class A{

    fun mehtod1(){
        println("i am method1")
    }
}
abstract class Shape3{

    var name:String=""
    abstract fun area():Double
    abstract fun display()
}

class Circle3(val radius:Double):Shape3(){

    override fun area(): Double {
        return Math.PI*radius*radius
    }

    override fun display() {
        println("circle is getting displayed")
    }
}