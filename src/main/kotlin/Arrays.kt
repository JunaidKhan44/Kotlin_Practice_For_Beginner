fun main() {

    //implicit declaration
    var arr = arrayOf("junaid", "ali", "yawar")
    var arr1 = arrayOf(1, 2, 3, 4)
    //explicit declaration
    var arr2 = arrayOf<Int>(3, 2, 4)

    //for print array
    for (i in arr){
        println("value is :$i")
    }

    //print value with index
    for ((i, e) in arr.withIndex()) {
        println("$i -$e")
    }

    //excess particular index value of array
      println(arr[1])

    //other method
    println(arr.get(2))

    //for set values
    arr.set(0,"Aman khan")
    println(arr.get(0))

    //for array size
    println(arr.size)
}
