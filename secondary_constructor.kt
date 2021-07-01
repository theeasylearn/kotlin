
class student
{
    private var name:String = ""
    private var age:Int=0
    /* secondary constructor */
    constructor(_name:String)
    {
        println("one argument secondary constructor...")
        name = _name
    }
    constructor(_name:String,_age:Int)
    {
        println("two argument secondary constructor ...")
        name = _name
        age = _age
    }
    fun print()
    {
        println("name = $name age = $age")
    }
    
}
fun main()
{
	var s1:student = student("Fardin")
    var s2:student = student("chetan",30)
    var s3:student = student("tirthal",18)
    s1.print()
    s2.print()
    s3.print()
}

