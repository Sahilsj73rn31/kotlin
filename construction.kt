fun main() {
//    var car = AM(name="car",tyres=4,ms=6)
//    var person = person("sahil", 43)
//    println(person.age)
//    println(person.name)
//    var person2=person("ansh",56)
//    println(person2.age)
//    println(person2.name)
//}
//
//class AM(val name: String,val tyres: Int,val ms: Int)
//{
//    fun drive(){}
//    fun applybrakes(){}
//}
//class Empty{}
//
//class person(nameparam:String,ageparam: Int)
//{
//    val name : String=nameparam
//    val age:Int=ageparam

    var car = AM(name="car",tyres=4,ms=6,"petrol")
    var car2=AM(name="car2",tyres=2,ms=6,"petrol")
}
class AM(val name: String,val tyres: Int,val ms: Int,engine: String)
{
    init{
        println("$name is created")
    }

    init{
        println("second intializer block")
    }
constructor(nameparam: String,engineparam:String) :
        this(nameparam,3,2,4)
    fun drive(){}
    fun applybrakes(){}
}
