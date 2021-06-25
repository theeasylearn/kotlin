fun main() {
    var friends:MutableList<String> = mutableListOf("Kartik","Nikunj","Samir","Mahesh")
    println(friends)
    friends.add("Asit")
    friends.add("Asit")
    println(friends)
    friends.remove("Asit")
    println(friends)
	if(friends.contains("Mihir"))
    	println("Mihir found")
    else 
    	println("Mihir not found")
   friends.set(0,"ganesh")  
   friends.set(friends.indexOf("Samir"),"sanjay")
   println(friends)
}
