fun main(){

    val day=Day.SUNDAY
    println(day)

    println(day.number)
    //now apply loop
    for(i :Day in Day.values()){
        println(i)
    }

    //method call
    day.printFormattedDay()  
	//answer is sunday because reference point the same object

}
//use to assign set of values  like day,gender etc
//set of constant value
enum class  Day(val number:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    //you can also define method in enum classes
    fun printFormattedDay(){
        
        //e.g  day.printformattedday()  point the day
        println("Day is $this")
    }

}