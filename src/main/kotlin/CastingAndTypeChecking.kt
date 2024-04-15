fun main(){

    val circle5=Circle5(4.9)
    val player2=Player2("Smile")

    if(circle5 is Circle5){   
        println("it is circle")
    }

    var arr= arrayOf(circle5,player2)
    for (obj in arr){
        if(obj is Circle5){
            println(obj.area())
        }else{

            (obj as Player2).sayMyName()
        }

    }

}

interface  Draggable5 {
    fun drag()
}
abstract  class Shape5:Draggable5 {

    abstract  fun area():Double

}

class Circle5(val radius:Double):Shape5(){
    override fun area(): Double =Math.PI*radius*radius
    override fun drag() = println("Circle is dragging")

}

class Player2(val name:String):Draggable5{
    override fun drag()=println("$name is dragging")
    fun sayMyName()= println("Hi my name is - $name")
}