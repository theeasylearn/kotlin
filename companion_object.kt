class student(var name:String,var age:Int)
{
    companion object
    {
        fun working() 
        {
            println("I am writing code")
        }
        fun hobby() = println("writing code.....")
    }
    fun callworking()
    {
        return working()
    }
    fun callhobby()
    {
        return hobby()
    }
}
fun main()
{
    student.working() //call companion object method using class 
    student.hobby() //call companion object method using class 
    
    var s1 = student("Ankit",37) 
    var s2 = student("Jiya",8)
    
    s1.callworking() //calling normal method which will call companion object method 
    s2.callhobby() //calling normal method which will call companion object method    
}
