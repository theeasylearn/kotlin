fun main() {
   	println("next 5 years")
    for (year in 2022..2027)
    {
        println(year)
    }
    println("every alternet year in next 10 years")
    for (alternetyear in 2022..2031 step 2)
    {
        println(alternetyear)
    }
    println("previus 5 years in descending order")
    for (previousyear in 2022 downTo 2018)
    {
        println(previousyear)
    }
    println("every alternet year in prevous 10 years")
     for (alternetyear in 2022 downTo 2013 step 2)
    {
        println(alternetyear)
    }
}
