//default constructor
class interest(private var amount:Int=1000,private var rate:Float=10.0f,
               private var year:Int=1)
{
    //class method must be given here
    fun getInterest() : Float
    {
        println("Amount =" + amount)
    	println("Rate =" + rate)
    	println("Year =" + year)
        var result:Float = (amount * rate * year) /100
        return result
    }
}
fun main()
{
 	var i1 = interest()
    println("interest for i1 = " + i1.getInterest())
    
    var i2 = interest(10000)
    println("interest for i2 = " + i2.getInterest())
    
    
    var i3 = interest(12500000,12.5f)
    println("interest for i3 = " + i3.getInterest())
    
    var i4 = interest(12500000,12.5f,2)
    println("interest for i4 = " + i4.getInterest())
    
}
