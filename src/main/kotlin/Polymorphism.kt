
 //...........Polymorphism
fun main(){

//     //explicit type
//     val  circle:Circle=Circle(4.0)
//     val  square:Square=Square(4.0)

     //now using polymorphism i.e  can hold reference of child
     //and can call method of the child classes
     
     
     val  circle:Shape=Circle(4.0)
     val  square:Shape=Square(4.0)

   
//
//     println(circle.area())
//     println(square.area())

     //array
     val shape= arrayOf(Circle(4.0),Circle(5.22),Square(3.2),
         Triangle(3.0,4.0))
     calculateAreas(shape)
}

 fun calculateAreas(shapes: Array<Shape>) {
     for (shape:Shape in shapes){
         println(shape.area())
     }
 }


 open class Shape{
     
     open fun area():Double{
         return 0.0
     }
 }

 class Circle(val radius:Double): Shape(){

     override fun area(): Double {
         return Math.PI*radius*radius
     }
 }

 class Square(val side:Double): Shape(){

     override fun area(): Double {
         return side*side
     }
 }
 class Triangle(val base:Double,val height:Double): Shape(){

     override fun area(): Double {
         return  0.5* base * height
     }
 }
