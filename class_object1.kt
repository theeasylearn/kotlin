class book
{
    private var name:String = "The Secret"
    private var price:Int = 500
    private var weight:Float = 125.99f
    private var isDigital:Boolean = true 
    
    public fun detail()
    {
        println("Book Name = $name")
        println("Book Price = $price")
        println("Book Weight = $weight")
        if(isDigital==true) println("this book is available in digital format")
        else print("only paperback copy available")
    }
    
}
fun main()
{
    //create object 
    //syntax
    //var object=ClassName()
    var b1 = book()
    b1.detail()
    
}
