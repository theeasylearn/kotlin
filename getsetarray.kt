fun main()
{
    var platforms = arrayOf("Kotlin","Flutter","Xamrain","Phonegap") 
   
    println("platforms array")
    for(position in 0..platforms.size-1)
    {
        println("value is " + platforms.get(position))
    }
    platforms.set(0,"Kotlin by JetBrain")
    platforms.set(1,"Flutter by Google")
    println("now first value " + platforms.get(0))
    println("now second value " + platforms.get(1))
   
    
    
    
}
