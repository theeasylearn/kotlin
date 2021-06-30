class animal(private var name:String,private var age:Int,private var weight:Float,private var iscarnivorous:Boolean)
{
    //class method must be given here
    fun detail()
    {
        println("name =" + name)
    	println("age =" + age)
    	println("weight =" + weight)
    	if(iscarnivorous==true) println("it meat-eating") else println("it is not eating meat")
    }
}
fun main()
{
 	var tiger=animal("Tiger",20,150.25f,true)   
    tiger.detail()
    //println("name = " + tiger.name) won't work because properties are private 
}
