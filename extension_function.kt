class Circle(var radius:Float)
{
    fun getArea() : Double
    {
        return Math.PI * radius * radius
    }
}
fun main()
{
    fun Circle.getPerimeter() :Double
    {
		return 2 * Math.PI * radius        
    }
    
    var c1 = Circle(100.0f);
    println("area of circle is " + c1.getArea())
    println("permimeter of circle is " + c1.getPerimeter())
}
