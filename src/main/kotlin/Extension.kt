fun main(){

    //extend class which is in some particular library if open then extend otherwise not 

    //in kotlin  new concept of extension function
    println("Hello junaid coding".formattedString())

    //Note : cant access class private variable beacuse it is define outside class
}

fun String.formattedString():String{
    //this ref to current calling object
    return "--------------\n$this\n--------------"
}