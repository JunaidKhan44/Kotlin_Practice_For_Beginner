fun main(){

    var obj=OnePlus()
    obj.display()

    //parent call
    var general=Mobile()
    general.display()

}
open class  Mobile{
   open val name:String=""
   open val size:Int=5

    fun makeCall(){ println("Make call")}
    fun powerOff(){ println("Mobile power off")}

    // how to override method below
  open  fun display(){ println("Mobile display")}
}

class OnePlus :Mobile(){

    //name or size property overide

    override val name: String="One Plus"
    override val size: Int=6


    //signature same hona chahiye but body mein kuch bhi de sakthay hain
    override  fun display()= println("this method is overide")
}
