fun main() {
    val result = sum( a = 3,7)
    println(result)
    val result1 = sum( a= 32,b=454)
    println(result1)

    evenorodd(num =5)
    evenorodd(num =6)
    printmessage(8)
}

fun sum(a: Int, b: Int): Int {
    val sum = a + b
    return sum
}
fun printmessage(count:Int = 2){
    for(i in 1..count){
        println("hello $i")
    }
}



fun evenorodd(num : Int){
    val result2 = if(num%2==1)"odd" else "even"
    println(result2)
}