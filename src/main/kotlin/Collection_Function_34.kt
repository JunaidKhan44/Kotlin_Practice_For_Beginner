fun main(){

val list= listOf<Int>(1,2,3,4,5,6)
 println(list)
println(isOdd(3))

    //scenario -1 use of filter with function
    //using function referencing operator
 
  val list2=list.filter(::isOdd)
  println(list2)

    //we can also pass function directly

    val list2=list.filter(fun(a:Int):Boolean{return  a%2!=0})
    println(list2)

    //we can also pass lambda
    val list2=list.filter({a:Int->a%2!=0})
    println(list2)

        val list2=list.filter { a:Int->a%2!=0}
        println(list2)


    //second method  in case of one parameter
    val list2=list.filter({it%2!=0})
    println(list2)



    //filter using data class yeh backed pr loop karta hai
    val userlist= listOf<User>(
        User(1,"a"),
        User(2,"b"),
        User(3,"c")

    )

  println(userlist.filter { it.id==2 })


    //now use of map
    val list= listOf<Int>(1,2,3,4,5,6)

    //use for converting one form into another form
 val lst= list.map { it*it }
  println(lst)

    //convert to object of user class into paid user

        val userlist= listOf<User>(
        User(1,"a"),
        User(2,"b"),
        User(3,"c")
    )

    val paidUser=userlist.map {
        PaidUser(it.id,it.name,"Paid")
    }

    println(paidUser)


    //foreach in collection
  
    for(i in list){
        println(i)
    }

    
    list.forEach { println(it) }
}

data class User(val id:Int,val name:String)
data class PaidUser(val id:Int,val name:String,val type:String)

fun isOdd( a:Int):Boolean{

    return a%2!=0
}
