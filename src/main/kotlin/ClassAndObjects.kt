fun main(){

    //how to make object
    val mustang=Car("mustang","petrol",300)
    val Beetle=Car("Beetle","Deisel",400)

    println("Car name :"+mustang.name)
    println("Car type :"+mustang.type)

    mustang.driveCar()
    Beetle.driveCar()


}
class Car(val name:String,val type:String,var Kiloran: Int) //properties
{
    fun  driveCar(){   //these are method
        println("Car is driving")
        //or
        println("$name Car is driving")
    }
    fun applyBrake(){
        println("Brake are apply")
    }
}