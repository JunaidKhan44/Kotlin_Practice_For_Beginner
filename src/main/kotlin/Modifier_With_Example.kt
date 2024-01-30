fun main() {


    var obja=A1()   //p and r available for a
    var objb=B1()   //p ,r and test fun is available

    objb.test()


}

open class A1 {
    public var p = 10
    private var q = 10
    internal var r = 10
    protected var s = 10

}

class B1 : A1() {

    fun test() {
        println(p)   //available everywhere
        //    println(q)   //not available
        println(r)     //available with in same module
        println(s)    //available in sub class only
    }
}