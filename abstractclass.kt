abstract class shape{
    abstract fun getArea():Float 
    fun getPi():Float
    {
        return 3.14f
    }
}
class circle(var radius:Int) : shape()
{
    override fun getArea() : Float
    {
        return super.getPi() * radius * radius 
    }
}
class cyliender(var radius:Int,var height:Int) : shape() 
{
    override fun getArea() : Float 
    {
		//2πrh+2πr2        
		var area:Float = 2 * super.getPi() * (radius + height) * radius
        return area
    }
}
fun main()
{
	var c1 = circle(100)
    println("area of circle " + c1.getArea())
    
    var c2 = cyliender(25,10)
    println("area of cyliender " + c2.getArea())
    
}
