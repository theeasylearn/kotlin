object dbConector{
    var database:String? = null
    var password:String? = null
    var username:String? = null
    fun print()
    {
        println("database = $database password = $password username=$username")
    }    
}
fun main()
{
   dbConector.print()
   dbConector.username = "root"
   dbConector.password = "ankit" 
   dbConector.database = "kotlin" 
   dbConector.print()
 
}
