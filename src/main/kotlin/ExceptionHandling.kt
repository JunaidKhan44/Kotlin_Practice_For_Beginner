fun main(){

    try
    {
        //block of code written where possibility of error
        var arr=arrayOf(1,2,3)
        println(arr[5])

    }
    //we can use multiple catch in single try {} block
    //multiple types exceptions occurs So handling can be  multiple
    catch (ex:NullPointerException){}
    //it Exception is parent class so we can write it in end of all catch block means last block
    //hierachy  ist specfic then base class
    catch (e:Exception){
        //this will handle exception

        println("array index out of bound")
    }
    finally {
        //we can use finally without catch
        //this code execute either error occur or not

        println("i will execute no matter what")
    }

}