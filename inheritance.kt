fun main() {
    val objchild = child()
    objchild.mymethod()
    objchild.mymethod2()
}

open class Parent
{
    init{
        println("parent constructor is called")
    }

    val name :String = ""

    fun mymethod(){
        println("I am a parent")
    }
}


class child:Parent(){
init{
    println("child constructor is called")
}
    val name2 : String = ""

    fun mymethod2(){
        println("I am a child")
    }
}