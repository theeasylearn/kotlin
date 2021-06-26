import kotlin.random.Random
fun main()
{
    var number:Int = Random.nextInt(5)
    println(number)
    when(number)
    {
        0 -> println("It is zero")
        1 -> println("It is one")
        2 -> println("It is two")
        3 -> println("It is three")
        4 -> println("It is four")
        else -> println("It is five")
    }
}
