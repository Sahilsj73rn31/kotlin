fun main() {
    val oneplus = oneplus("smartphone")
    oneplus.display()
    val genralmobile = Mobile(type="genral")
    genralmobile.display()
    println(oneplus.toString())
}

open class Mobile(val type:String){
    open val name:String=""
    open val size:Int = 5
    fun makecall()=println("calling from Moblie")
    fun oweroff()=println("shutting down")
    open fun display()=println("simple mobile display")
}

class oneplus(typeparam: String):Mobile(typeparam)
{
    override val name:String="one plus"
    override val size:Int = 6
    override fun display(){
        super.display()
        println("oneplus display")
    }

    override fun toString(): String {
        return "oneplus(name='$name', size=$size)"
    }


}
