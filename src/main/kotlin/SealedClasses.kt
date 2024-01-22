fun main(){

    //scenario-1
	val tile=Red("Mushroom",25)
	val tile2=Red("Mushroom",25)

	println("${tile.type}, ${tile.point}")

    //scenario--2
    val tile:Tile=Red("Mushroom",25)
    val point=when(tile){
        is Red ->  tile.point *2
        is Blue -> tile.point*5
    }
    println(point)

    //so sealed class are type restrict
}

//it is abstract class we cannot make instance or object of it
sealed class  Tile()

//make sure if you define sealed class it sub type is also define in the same class in other class definition
//cannot work
class Red(val type:String,val point:Int):Tile()
class Blue(val point:Int):Tile()