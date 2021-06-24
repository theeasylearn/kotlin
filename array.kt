fun main()
{
    //create an array 
    var cars = arrayOf("Maruti","Tata","Audi","BMW","Tesla")
    //can not use array with $ in string
    println("first car " + cars[0])
    println("second car " + cars[1])
    println("third car " + cars[2])
    //var or val has no impact on type of array. array is always mutable
    val numbers:IntArray = intArrayOf(10,20,40,80,160,320)
    val float_numbers:FloatArray = floatArrayOf(10.20f,20.40f,40.80f,80.160f,160.320f)
    numbers[0] = 1000
    println("first integer number " + numbers[0])
    println("first float number " + float_numbers[0])
    
}
