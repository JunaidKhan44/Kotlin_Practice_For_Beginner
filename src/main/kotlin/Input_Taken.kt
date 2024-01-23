import java.util.*

fun main(){

    //input of string
    print("Pleas Input the data :")
    val enterstring= readLine()
    println("Your entered String : $enterstring")

    //input of Integer
    print("Pleas Input the Integer :")
    val number=Integer.valueOf(readLine())
    println("Your entered String : $number")




    //input using Scanner class
    val read=Scanner(System.`in`)
    print("Enter an Integer :")
    var nu1=read.nextInt();
    println("your entered num : $nu1")


    //for float number
    val read=Scanner(System.`in`)
    print("Enter an Float :")
    var nu1=read.nextFloat();
    println("your entered num : $nu1")

}