class Fruit //outer class
{
    fun detail()
    {
        println("I am mostly water...");
    }
    inner class Mango
    {
        fun show()
        {
            println("I am yellow sweet and bulky and mostly available in summer...");
        }
        fun outerDetail() = detail(); //reference function which hold reference to outer class method 
    }
}
fun main() 
{
    var mango = Fruit().Mango() //creating object of inner class 
    mango.show()
    mango.outerDetail() //now we call reference function which call outer class functions
}
