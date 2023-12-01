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

fun weekDay(day:Any){
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Not assingment")
    }
}

fun typeOf(data:Any){
    when(data){
        is String -> println("String Data")
        is Int -> println("Type Number Data")
        is Boolean -> println("Type Boolean Data")
        else -> println("Not Recognized Data")
    }
}

fun main(){

}
