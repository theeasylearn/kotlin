var p = {message:String -> println(message)}
fun dosomething( message:String,p:(String)->Unit)
{
    var msg:String = message.uppercase()
    p(msg)
}
fun main() 
{
   
    p("Hello we are @ bhavnagar")
    dosomething("ankit",p)
}
