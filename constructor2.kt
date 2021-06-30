class animal(var name:String,var age:Int,var weight:Float,var iscarnivorous:Boolean)
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
}
