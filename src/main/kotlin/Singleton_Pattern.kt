fun main(){

    Sharedwidget.incremetTwitterlike()
    Sharedwidget.incremetFblike()
    Sharedwidget.incremetFblike()
    Sharedwidget.incremetFblike()
    Sharedwidget.displaylike()
}

object  Sharedwidget{
    private  var twiterlike=0
    private  var Fblike=0

    fun incremetTwitterlike()= twiterlike++
    fun incremetFblike()=  Fblike++

    fun displaylike()= println("Twitter like :$twiterlike ,FB Like :$Fblike")

}