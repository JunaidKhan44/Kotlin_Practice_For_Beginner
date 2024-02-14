fun main(){

//    var testobj= object {
//        var x:Int=10
//        fun method(){
//            println("I am anonymous")
//        }
//    }

	//println(testobj.method())
    //used of it
    //how to implement interface using anonymous object
    //no need to make class to implement interface in such scenario

//    var obj=object : Clon{
//        override fun clone() {
//         println("clone is call")
//        }
//
//    }
//    obj.clone()


    var obj2= object : Myperson("junaid") {

        override fun fullname() {
            super.fullname()
            println("anonymous $name")
        }
    }

  obj2.fullname()

}

interface  Clon{
    fun clone()
}

open class Myperson(val  name:String){
    open fun fullname()= println("full name is :$name")
}  