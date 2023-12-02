package Sintax
fun creatingAnMap(){
    val map = mapOf("id" to 1,"Name" to "Ruan", "User" to "Default")

    //Vizualize datas on Map
    println(map["id"])
    println(map["Name"])
    println(map["User"])

    //Verify if exist especific value on the map
    println(map.containsKey("id"))
    println(map.containsKey("Name"))
    println(map.containsKey("Email"))

    //Get associated valeu on a key map
    println(map.get("id"))
    println(map.get("User"))

    //Size of a map
    println(map.size)

    //copy a map
    println(map.toMap())

    //return an collection of all key of map
    println(map.keys)

    //return an collection of all values of map
    println(map.values)

}

fun main(){
    creatingAnMap()
}