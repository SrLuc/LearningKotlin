// Switch case Javascript ?
fun cases(obj:Any){
    when(obj){
        1 -> println("Number One")
        "" -> println("String")
        is String -> println("type String")
        !is String -> println("Not String")
        else -> println("Unknown")
    }
}

fun requiredUser(traits : Any){
    when(traits){
        2000 -> println("High Order")
        else ->  println("Unknown")
    }
}

fun userData( datas: Any){

    fun showDatas(){
        println(datas)
    }

    when(datas){
        "Developer" -> showDatas()
        else -> println("User not Developer")
    }

}

fun main(){

}
