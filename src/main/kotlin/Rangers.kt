fun main(){

    //count 0 1 2 3
    for (i in 0..3){
        print(i)
    }

    //count 0 1 2
    for (i in 0 until  3){
        print(i)
    }

    //count 0 2 4 6 8
    for (i in 0..8 step 2){
        print(i)
    }

    //count 3 2 1 0
    for (i in 3 downTo 0){
        print(i)
    }

    for (i in 'a'..'h'){
        print(i)
    }

    for (i in 'z' downTo 'h' step 2 ){
            print(i)
    }

    val num:Int = 5
    if(num in 1..10){
        print(num)
    }

    val num2:Int = 5
    if(num !in 6..10){
        print(num)
    }

}