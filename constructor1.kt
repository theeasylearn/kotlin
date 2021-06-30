class animal(var name:String,var age:Int,var weight:Float,var iscarnivorous:Boolean)
{
    
}
fun main()
{
 	var tiger=animal("Tiger",20,150.25f,true)   
    println("name =" + tiger.name)
    println("age =" + tiger.age)
    println("weight =" + tiger.weight)
    if(tiger.iscarnivorous==true) println("it meat-eating") else println("it is not eating meat")
}
