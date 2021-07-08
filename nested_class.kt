class Fruit //outer class
{
    fun detail()
    {
        println("I am mostly water...");
    }
    class Mango
    {
        fun show()
        {
            println("I am yellow sweet and bulky and mostly available in summer...");
        }
    }
    var mango = Mango() //object of inner class
}
fun main() 
{
    var fruit = Fruit()
    fruit.detail() //calling method of outer class
    fruit.mango.show() //calling inner class method using outer class and inner object 
    
    var anotherMango = Fruit.Mango() //creating object of inner class 
    anotherMango.show()
    //anotherMango.Fruit().detail() won't work
}
