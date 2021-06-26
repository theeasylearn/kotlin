import java.util.Random

fun main() {

    val number:Int = Random().nextInt(10) - 5
    when 
    {
        number < 0 -> println("negative value")
        number == 0 -> println("zero")
        number > 0 -> println("positive value")
    }
}
