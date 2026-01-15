import kotlin.math.sin

fun main() {
    var arr = arrayOf("one", "two", "three", "four", "five")
    var arr1 = arrayOf("1","2","3","4","5","6","7","8","9")
    var arr2 = arrayOf<Int>(3,43,34,53,7)

    for((i,e) in arr.withIndex()){
        println("$i - $e")
    }
    println(arr[0])
    println(arr.get(1))
    arr.set(0,"hello")
    println(arr[0])
    println(arr.size)
    println(arr[3])

}