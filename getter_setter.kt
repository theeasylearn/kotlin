class movie
{
    var name:String = ""
    get() = field
    set(value)
    {
        field = value
    }
    var length:Int = 0
    get() = field
    set(value)
    {
        var temp = value
        if(temp<0) temp = -temp
        field = temp
    }
}
fun main()
{
    var m1:movie = movie()
    m1.name = "Terminator"
    m1.length = -120
    println("Name = ${m1.name} length = ${m1.length}")
    
    
    var m2:movie = movie()
    m2.name = "Predator"
    m2.length = -130
    println("Name = ${m2.name} length = ${m2.length}")
    
    
    var m3:movie = movie()
    m3.name = "Ghost Rider"
    m3.length = -140
    println("Name = ${m3.name} length = ${m3.length}")
    
    
}
