
fun usingMutableList(){
    var myList = mutableListOf("Apple","Pineaple", "Grape", "Orange", "Lemon")
    myList.addFirst("Melon")
    myList.removeLast()
    print(myList)
}

fun immutableList(){
    var myList = listOf("Chair", "Door", "Ledders", "Window")
    print(myList)
}

fun main(){
    usingMutableList()
    immutableList()
}