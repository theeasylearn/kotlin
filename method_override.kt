open class person()
{
    init
    {
        println("person class initializer ")
    }
    //open keywords allows us to Override method in child class if required
    open fun work()
    {
        println("I am breathing.....")
    }
}
class student : person()
{
    override fun work()
    {
        super.work() //calling parent class method work 
        println("I am learning Kotlin.....")
    }
}
class trainer : person()
{
    override fun work()
    {
        super.work()
        println("I am providing training for kotlin ....")
    }
}
fun main()
{
   var s1= student()
   s1.work()
   
   var t1 = trainer()
   t1.work()
}
