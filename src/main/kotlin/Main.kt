fun printMessage(message:String){
    println("$message")
}

fun printMessageWithPrefix(message: String, prefix:String = "Language"){
    println("$message $prefix")
}

fun MulNumbers(x:Int, y:Int):Int{
    println(x * y);
    return x * y
}

fun SumNumbers(a:Int, b:Int) = a + b;

fun getDataFromDatabase(localhost:String, port:Int, user:String, dbName:String, dbPass:Int ){
    print("$localhost,$port,$user,$dbName,$dbPass")
}

fun printAll(vararg messages:String){
    for(message in messages) println(message)
}

fun printLanguages(vararg languages:String, prefix: String){
    for(lang in languages) println(lang + prefix)
}


fun main() {


}