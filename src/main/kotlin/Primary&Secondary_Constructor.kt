fun main(){

    var car=Auto("car1","petrol")

    var car2=Auto("car2",4,7,"Diesel")
    /////Secondary constructor
    println("ist car")
    println(car.name)
    println(car.enginetype)
    println(car.tyre)
    ///Primary Constructor
    println("2nd car")
    println(car2.name)
    println(car2.enginetype)
    println(car2.tyre)
}

class Auto(val name: String, val tyre: Int, val seating: Int,var enginetype:String){

    constructor(nameParam: String,engineParam: String)
            : this (nameParam,4,5,engineParam)
}