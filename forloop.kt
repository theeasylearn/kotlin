fun main() {
    var language = arrayOf("Kotlin","Flutter","PHP","Node JS","Python")
    for (item in language)
    {
        println(item)
    }
    var cars:MutableList<String> = mutableListOf<String>()
    cars.add("Maruti")
    cars.add("Audi")
    cars.add("BMW")
    cars.add("Tesla")
    for (item:String in cars)
    {
        println(item)
    }
    
}
