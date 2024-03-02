fun main(){

    val p1=PersonMy(1,"John")
    val p2=PersonMy(1,"John")

    println(p1)  //tostring of any class because it is parent of all classes

    println(p2)  //tostring of any class because it is parent of all classes
    println(p1.hashCode())   //tell the hashcode
    println(p1==p2)         //to check press ctrl+click  //in java backed p1.equal(p2)
    //kotlin yeh by default override 
    

   //some utility function in data class by default

//    val p3=p1.copy()
//    println(p3)

                    //scenrio -2
    val p3=p1.copy(id=3)
    println(p3)

                //  destructuring in kotlin
    val(id,name)=p1    //behind the scence they call the component functions
    println(id)
    println(name)
                //component n function
    println(p1.component1())
    println(p1.component2())
}
//now no need to write boiler plate
data class PersonMy(val id:Int,val name:String){

}
