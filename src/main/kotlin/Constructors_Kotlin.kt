fun main(){

    //constructor

 //constructor without parameter
    var person1=P()  
    println(person1.age)
    println(person1.name)



    var p2=P2("Ali",23)
    println(p2.name)


   var per=P3("junaid",22)
   println(per.canvote)
   println(per.name)

    //initalize set of statement
    var per=P3("junaid",22)



}

class P() {

    val name=""
    var age =0
}

class P2(nameParam:String,ageParam:Int) {   //constructor with parameter

    val name=nameParam
    var age =ageParam
}

class P3(nameParam:String,ageParam:Int) {   //constructor with parameter

//    val name=nameParam  // change
    init {
        println("$nameParam is created")
    }
        val name="$nameParam  -clan "
    init{
        println("$nameParam is created")
    }
    var age =ageParam
        var canvote :Boolean=ageParam>18
}