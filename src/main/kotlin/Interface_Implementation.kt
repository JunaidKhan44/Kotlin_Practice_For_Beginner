import java.util.*

fun main(){

    dragobjects(arrayOf(Circle4(4.0),Square4(4.3),Triangle4(3.7,4.4)
        ,Player("Simley")))
}

fun dragobjects(objects:  Array<Draggable>) {

    for(obj : Draggable in objects){
        obj.drag()
    }
}

interface  Draggable{
//same behave as abstract class you can define method with body and without body (concrete)
    //also define abstract method
    //no body function by default abstract ho ga
    //we can also define property in interface
    //val dragspeed:Int //it is of abstract type
    //similar like abstract only difference abstract work on type and interface work on behaviour
    //in abstract parent-child hierachcy but in interface group class on base of behaviour
    fun drag()
}
interface  Cloneable{
    fun clone()
}
//implementation of dragable
//you can implement multiple interface  at a time using comma '
abstract  class Shape4:Draggable,Cloneable {

    abstract  fun area():Double

}

class Circle4(val radius:Double):Shape4(){
    override fun area(): Double =Math.PI*radius*radius
    override fun drag() = println("Circle is dragging")
    override fun clone() {
        TODO("Not yet implemented")
    }
}
class Square4(val side:Double):Shape4(){
    override fun area(): Double =side*side
    override fun drag() = println("Square is dragging")
    override fun clone() {
        TODO("Not yet implemented")
    }
}

class Triangle4(val base:Double,val height:Double):Shape4(){
    override fun area(): Double=0.5*base*height
    override fun drag() = println("Triangle is dragging")
    override fun clone() {
        TODO("Not yet implemented")
    }
}

class Player(val name:String):Draggable{
    override fun drag()=println("$name is dragging")
}