open class person(var age:Int,var name:String)
{
    init
    {
        println("name = $name age=$age")
    }
    fun detail()
    {
        println("your detail \n name=$name age=$age")
    }
}
class student(age:Int,name:String) : person(age,name)
{
    fun work()
    {
        println("I am learning Kotlin.....")
    }
}
class trainer(age:Int,name:String,var gender:Boolean) : person(age,name)
{
    fun work()
    {
        println("Hi I am $name and my age is $age ")
        if(gender==true) println("I am male")
        else println("I am female")
        println("I am providing training for kotlin ....")
    }
}
fun main()
{
    var p1 = person(35,"Ankit Patel")
    p1.detail()
    
    var s1 = student(18,"tirthal gajjar")
    s1.work()
    s1.detail()
    
    var t1 = trainer(35,"divya",false)
    
    t1.work()
}


