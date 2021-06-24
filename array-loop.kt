fun main()
{
    var values1 = Array(5,{100}) 
    //it will create values1 array whose size will be five and all values will be 100
    
    var values2 = Array(10,{ i -> i + 1}) 
    //it will crate array value2 whose size will be ten and first element will have 1, 2nd will have 2 and so on 
    
    println("values 1 array")
    for(position in 0..values1.size-1)
    {
        println("value is " + values1[position])
    }
    
    println("values 2 array")
    for(position in 0..values2.size-1)
    {
        println("value is " + values2[position])
    }
    
    
    
}
