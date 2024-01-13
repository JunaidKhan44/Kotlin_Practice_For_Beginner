fun main(){

    MyClass.MyObject.f()
    MyClass.AnotherObject.g()

    //scenario --2
    //now we can access directly without using object instance just write classname.dot
    //we can define only one companion in one class //per class only one allowed
    //in kotlin there is no static keyword so companion is used as a static
    MyClass.f()
}
class MyClass{

    //similar to previous i.e  make single instance but in such case associated with class
    //as class is loaded singleton object is made
    //so it is not static behind the scence call by making object
   companion object  MyObject{
       //annotation
        @JvmStatic
        fun f()=println("i am f in myobject")
    }
    //we can make multiple object in a same class
    object  AnotherObject{

        fun g()=println("i am g in myobject")
    }
    //else class remains the same we can do whatever we want
}