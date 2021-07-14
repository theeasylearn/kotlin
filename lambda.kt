fun main() 
{
    val task = { println("I am learning Kotlin @ the easylearn academy!")}
    var square = {number:Int -> number * number}
    var area = {height:Int, width:Int -> height * width}
    var pi = {Math.PI}
    task()     // invoking function
    println(square(10))
    println(pi())
    println(area(10,20))
}
