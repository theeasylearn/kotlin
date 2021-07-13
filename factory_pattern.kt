interface storage 
{
    fun save()
}
class File:storage
{
    override fun save()
    {
        println("data saved into file...")
    }
}
class Database:storage
{
    override fun save()
    {
        println("data saved into table")
    }
}
class Network:storage
{
    override fun save()
    {
        println("data saved on server")
    }
}
class StorageFactory
{
    companion object //static method 
    {
        val FILE:Int = 1
        val DATABASE:Int = 2
        val NETWORK:Int = 3
        fun getStorage(type:Int):storage 
        {
			if(type==FILE) return File()            
            else if(type==DATABASE) return Database()
            else return Network() 
        }
    }
}
fun main()
{
    var f1 = StorageFactory.getStorage(StorageFactory.FILE)
    var d1 = StorageFactory.getStorage(StorageFactory.DATABASE)
    var n1 = StorageFactory.getStorage(StorageFactory.NETWORK)
    
    f1.save()
    d1.save()
    n1.save()
}
