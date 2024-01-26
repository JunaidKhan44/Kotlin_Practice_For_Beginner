fun main(){

    var gender:String="Male"  //Female,other it is non nullable datatype
    //but  in some scenario we can't know what to assign
    var gender2: String? =null   //it is nullable datatype
                                //when we add ? in any datatype it is called nullable //datatype
    //means values kay sath sath null bhi accept kar le ga
    var isAdult:Boolean?=null  //or true


   //call some  function so kotlin is save language to restrict that not call function with null reference
    //error aye ke check kar lo ke yeh null na ho toh he call karey yeh function
   // gender2.toUpperCase()

    //solution --1
    if (gender2 != null) {
      println(gender2.toUpperCase())
    }

    //solution --2   //save call operator  //prevent call only if not null
    gender2?.toUpperCase()
    println(gender2?.toUpperCase())

    //how to execute multiple statement with null check operator
    //with let
    gender2?.let {
        println("Line--1")
        println("$gender2")  //as condition check no error will be given
        println("$it")   //let provide more convenience for point variable call by it
    }

    //let call with both nullable or non nullable type
    //let is also called lamda  different type of lamda are available
    gender.let {}


    //elvis operator to stored default or provide value also called null colensing operator
    val selectedvalue=gender2 ?: "NA"  //NA mean not available

    // if non-null then  function call else throw exception
    //operater name not null asserted operator
    val value= gender2!!.toUpperCase()

}