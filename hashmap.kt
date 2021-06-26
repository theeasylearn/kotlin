fun main() {
    var KeyValuePair:HashMap<String,String> = HashMap<String,String>()
    println(KeyValuePair)
    KeyValuePair.put("fullname","ankit patel")
    KeyValuePair.put("mobile","9662512857")
    KeyValuePair.put("city","Bhavnagar")
    KeyValuePair.put("pincode","364001")
    KeyValuePair.put("pincode","380001") //update value if key already exists
    println(KeyValuePair)
    print("Full name " + KeyValuePair.get("fullname"))
    print("mobile " + KeyValuePair.get("mobile"))
    print("mobile " + KeyValuePair.get("ZIPcode")) //return null as there is no such key ZIPcode
    KeyValuePair.remove("pincode")
    println(KeyValuePair)
	for (CurrentKey in KeyValuePair.keys)
    {
        println(KeyValuePair[CurrentKey])
        println(KeyValuePair.get(CurrentKey))
    }
    if(KeyValuePair.get("age")==null)
    {
        println("no such key exists age")
    }
}
