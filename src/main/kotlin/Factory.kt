fun main(){


    var pizza1=Pizza.Factory.create("Peppy Paneer")
    println(pizza1)
    //Here i am calling via factory reference don't want to use factory ref
    //now defining using companion keyword
    var pizza2=Pizza.create("Tomato")
    println(pizza2)

    //one more thing we can do -we want every one to call this create method if they want pizza
    //for that we will mark the constructor as private

    //var pizza3=Pizza()//now every one need to call create method
	// i.e every has  to call its factory


}

//Example of factory pattern using companion
class Pizza private constructor( val type:String,val topping:String){
    //this is my factory object

  companion  object Factory{
        fun create(pizzaType:String):Pizza{
            return when(pizzaType){
                "Tomato"->Pizza("Tomato","Tomato ,Cheese")
                "Peppey Paneer"->Pizza("Peppey Paneer","peppey Paneer,Onion,Tomato -etc")
                else ->Pizza("Basic","Onion Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(Type='$type',topping '$topping')"
    }
}