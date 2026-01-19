fun main() {
    val circle:Shape=Circle(4.0)
    val square:Shape=Square(5.0)
    println(circle.area())
    println(square.area())
    val shapes=arrayOf(Circle( 3.0), triangle(3.0,5.0), Square(5.0))
    calculatearea(shapes)

}

fun calculatearea(shapes:Array<Shape>){
    for(shape:Shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area() :Double{
        return 0.0
    }
}

class Circle(val radius:Double):Shape(){
    override fun area():Double{
        return Math.PI*radius*radius
    }
}
class Square(val side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
}

class triangle(val base:Double, val height: Double):Shape(){
    override fun area():Double{
        return 0.5*base*height
    }
}

