data class Book(var name:String,var price:Int,var weight:Float)
fun main()
{
    var b1 = Book("The Secret",300,150.0f)
    var b2 = Book("Thing fast and slow",500,250.0f)
    println("Book Name "  + b1.name + " Price " + b1.price  + " Weight " + b1.weight)
    println("Book Name "  + b2.name + " Price " + b2.price  + " Weight " + b2.weight)
    
    var BookList:MutableList<Book> = mutableListOf()
    BookList.add(b1)
    BookList.add(b2)
    var position=0
    while(position<2)
    {
        println(" Book Name" + BookList.get(position).name + " Price " + BookList.get(position).price)
        position++
    }
    
    
    
}
