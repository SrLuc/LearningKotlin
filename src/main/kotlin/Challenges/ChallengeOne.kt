

// Escreva uma função que receba uma lista de números e retorne uma nova lista com os números pares.
fun numberList(vararg numbers:Int) {
   for (num in numbers){
       if(num % 2 == 0){
           println(num)
       }
   }
}

//Escreva uma função que receba um número inteiro e retorne o seu quadrado.
fun numberSquare( number:Int ):String {
    var result = number * number
    return "the exponencial value of number $number is $result"
}

//Escreva um loop que imprima os números de 1 a 10.
fun loopOneTeen(){
    for(i in 1..10){
        print(i)
    }
}

//Escreva um loop que imprima os números pares de 1 a 10.
fun loopNumberParOfTeen(){
    for(num in 0..10 step 2){
        println(num)
    }
}

//Escreva um código que receba um número inteiro e retorne "par" se o número for par, ou "ímpar" se o número for ímpar.
fun numParOrImpar(number: Int){
    if(number % 2 == 0){
        println("$number is Par")
    }else{
        println("$number is Impar")
    }
}

//Escreva um código que receba uma lista de números inteiros e retorne a soma dos números da lista.
fun sumAllNumbers(vararg numbers:Int): Int {
    var sum = 0
    for(num in numbers){
        sum += num
    }
    return sum
}

//Escreva um código que receba uma lista de números inteiros e retorne a média dos números da lista
fun numAverage(vararg numbers:Int):String{
    var sum = 0
    for (num in numbers){
        sum += num
    }
    var result = sum / numbers.size
    return "the average is $result"
}

//Escreva um código que receba uma lista de números inteiros e retorne a lista dos números pares da lista.
fun listOfParNumbers(vararg numbers:Int): IntArray {
    for(num in numbers){
        var parNumber = num%2==0
        if(parNumber){
            print("$num ")
        }
    }
    return numbers
}

fun main(){

}