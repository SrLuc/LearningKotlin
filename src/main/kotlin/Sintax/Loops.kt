package Sintax

fun forLoop(){
    val cakes = listOf("Chocolate","Carrot","Pineapple")
    for (cake in cakes){
        println("Oh, try it $cake cake ")
    }
}

fun whileLoop(){
    var bakedCake = 0

    while (bakedCake < 5){
        println(" Bake... an cake " + bakedCake ++)
    }
}

fun main(){

}