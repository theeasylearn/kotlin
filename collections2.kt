fun main() {
    var values:MutableList<Int> = mutableListOf()
    println(values)
    values.add(120)
    values.add(240)
    values.add(480)
    println(values)
    values.remove(120)
    println(values)
	if(values.contains(240))
    	println("240 found")
    else 
    	println("240 not found")
   values.set(0,2400)  
   values.set(values.indexOf(480),960)
   println(values)
}
