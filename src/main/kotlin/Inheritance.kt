fun main(){
  //inheritance

}
// inheritance
open class Phone{
    val name:String=""
    val type:String=""
    val volume:Int=10


    fun makeCall(){}
    fun powerOff(){}
    fun display(){}
    fun getDeviceInfo(){}

}
class BasicPhone : Phone(){
    val name:String="Nokia"
    val type:String="Basic 1100"
    val volume:Int=10

    fun makeCall(){}
    fun powerOff(){}
    fun display(){}
    fun getDeviceInfo(){}

    fun getScreenInfo(){}
}
class SmartPhone : Phone(){
    val name:String="Samsung Galaxy"
    val type:String="S 9"
    val volume:Int=10
                             
    //because it is  common

    fun makeCall(){}
    fun powerOff(){}
    fun display(){}
    fun getDeviceInfo(){}

    fun getScreenInfo(){}

    fun playMovie(){}
    fun getPicture(){}
    fun getLocation(){}
}