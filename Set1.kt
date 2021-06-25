fun main() {
    //store only unique value and skip duplicate value
    var values:MutableSet<String> = mutableSetOf()
    println(values)
    values.add("banana")
    values.add("mango")
    values.add("mango")
    values.add("apple")
    println(values)
    
}
