fun main(){


    var emp=Employee("Ali",14)
    emp.age=19
    emp.name="ali khan"

    //now with the help of apply
    emp.apply {
        age=20
        name="junaid"

    }
    println(emp)

    //check return type of Employee

    var obj=emp.apply {
        age=20
        name="junaid"

    }

    //let function

    //normally hum is tarahan print kartay hain object ko
    println(emp.age)
    println(emp.name)

    //with the help of let
    emp.let {
        print(it.age)
        print(it.name)
    }
   // Note : it point to current ,return value is value of last expression

    var  hl=emp.let {
        print(it.age)
        print(it.name)
    }

    //use of with
    //return value is same as last expression

    with(emp){
        age=30
        name="xyz"
    }

// only difference b/w let is lambda based  with it ref (in case of single param)and with is normal function with this ref

    //call using run method
    //it is a combination of both let and with
    //return value is same as last expression

    emp.run {
        age=45
        name="khan"

    }


}

data class Employee(var name:String="",var age:Int=18)