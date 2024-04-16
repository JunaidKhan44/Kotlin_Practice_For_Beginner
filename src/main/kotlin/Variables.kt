fun main() {
//    var score = 5   //for check datatype ctri+shift+p
//    score = 10
//    //   score=12.0   //error once you define never change
//
//    val message = "Hello world"  //means  just like constant
//
//    println(message)
//
//    println(score)

    //explicit define variable with datatype
//    var score : Int=10
//    var temp :Double=109.4
//    var israin :Boolean=true
//    var alphabet :Char='A'
//    var message : String="hello"
//

    //Arithematic operator in kolin
//    var i = 13
//    var j = 2
//    println(i+j)
//    println(i-j)
//    println(i*j)
//    println(i/j)
//    println(i.toFloat()/j)  //to give answer in float  conversions
//    println(i%j)  //mod give remainder

    //Relational Operator
//    println(i>j)
//    println(i<j)
//    println(i>=j)
//    println(i<=j)
//    println(i==j)
//    println(i!=j)

    //Now Incremet operator

//    var ii: Int = 10
//    ii=ii+1;  //warning for ease change into increment operator
//    println(ii)

//    println(++ii)
//    println(ii++)
//    ii++
//    println(ii)

//Now decrement operator
//    println(--ii)
//    println(ii--)
//    ii--
//    println(ii)

//    println(ii++ + ++ii)

    //end Nov,9-2020

    //Nov ,12,2020
    //Logical and Short circuiting operator


    //AND OPERATOR
    //case -1 return false   dono false to return false
//    val above70 = false
//    val knowsProgramming = false
//
//    val callForInterview = above70 && knowsProgramming
//    println(callForInterview)

    //case -2 
//    val above70 = true
//    val knowsProgramming = false
//
//    val callForInterview = above70 && knowsProgramming
//    println(callForInterview)

    //case -3 return dono true toh return true
//    val above70 = true
//    val knowsProgramming = true
//
//    val callForInterview = above70 && knowsProgramming
//    println(callForInterview)

    //OR OPERATOR

//    val havecar=false
//    val havemoney=true
//    val customer= havecar  || havemoney
//    println(customer)
//
    //all three scenerio discuss

    //short circuiting technique

//    var i=10
//    var j=11
//
//    var result=i ==10 ||j++==11
//    println(i)
//    println(j)
//    println("result\t"+result)

    //NOT OPERATOR
    //-->false -->true   vice versa

//    val value=false
//    val result=!value
//    println(result)
//    val resl=!!value
//    print(resl)

    // IF ELSE START
//    val isRaining = false;
//
//    if(isRaining==true){
//        println("Take Umbrella")
//    }else{
//        println("Enjoy a suney day")
//    }
//        ///
//    if(isRaining){
//        println("Take Umbrella")
//    }else{
//        println("Enjoy a suney day")
//    }


    //MULTIPLE IF ELSE
//    var i=30
//    var j=20
//
//    if(i>j){
//        println("i is greater")
//    }
//    else if(i<j){
//        println("j is greater")
//    }
//    else{
//        println("both are equal")
//    }
//
//    //KOTLIN SPECIAL VARIATION
//    var i=10
//    var j=20
//    var result =if(i>j){"i is greater"}
//    else if(i<j){"j is greatr"}
//    else{"both are equal"}
//    println(result)
//
//    //ANOTHER VARIATION
//    val value=20
//    val check=if( value % 2 == 0) "even" else "odd"
//    println("number is :$check")


//    //RANGE AND WHEN STATEMENT
//
//    //range   //in
//    val number=5
//    val result= number in 1..5  //1,2,3,4,5  //5 is include as upper bound
//    println(result)
//
//    //range  until
//    val number2=5
//    val result2= number2 in  1 until 5  //1,2,3,4  //5 not include as upper bound
//    println(result2)

//    //when
//    val animal="other"
//    when(animal){
//
//        "Cat" -> println("is Cat")
//        "Dog" -> println("is Dog")
//        "Hen" -> println("is Hen")
//         else -> println("animal not found")
//    }

//
//    //when  as an expression
//    val animal="Hen"
//
//    val result=when(animal){
//
//        "Cat" -> "is Cat"
//        "Dog" -> "is Dog"
//        "Hen" -> "is Hen"
//        else -> "animal not found"
//    }
//    println(result)

    //when  as an expression  with range
//    val number = 13
//    val result = when (number) {
//
//        11 -> "eleven"
//        12 -> "twelve"
//        in 13..19 -> "lies in range"
//        else -> "not found"
//    }
//    println(result)

    //LOOP START IN KOTLIN
    
}