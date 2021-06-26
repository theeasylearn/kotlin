import kotlin.random.Random
fun main()
{
    var number:Int = Random.nextInt(3)
    var fruit:String = ""
    if (number==1)	fruit = "apple"
    if (number==2)	fruit = "banana"
    if (number==3)	fruit = "orange"
    println(fruit)
    when(fruit)
    {
        "apple" -> println("It is red")
        "banana" -> println("It is yellow")
        "mango" -> println("It is orange")
    }
    
}
