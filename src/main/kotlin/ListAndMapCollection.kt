fun main(){

    // 1---list  immutable list

    val nums= listOf<Int>(1,2,3)  
    // <- such list is called immutable list
     // cannot be change etc

    println(nums.indexOf(3))
    println(nums.contains(4))

    //   -- Mutable list
    val nums= mutableListOf<Int>(1,2,3)


    nums[1]=2
    nums.add(5)
    nums.remove(3)
    println(nums)

    val list2= listOf<Int>(33,44)
    nums.addAll(list2)
    println(nums)

    //Map also called Dictionary in some language
    //Similarly are of 2 type mutable and immutable

    val student= mutableMapOf<Int,String>()
    student.put(1,"Ryan")
    student.put(2,"John")
    student.put(3,"Katie")

    //different function of it
    //key must be unique
    println(student.get(1))
    //key must be unique
    println(student.get(11))

    //loop
    for ((key,value)  in student){
        println("$key  = $value")
    }

    //easy version
    //[key] =value
    student[8]="helo"
    println(student[8])

    //now immutable map not change able
    //intialize with to operator because their is no put method in it
    val map= mapOf<Int,String>(1 to "Hello", 2 to "world")
    println(map)
}
