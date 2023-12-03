package POO

data class Computer(var memorySSD:String, var memoryRAM: Int,var core:String) {

}

fun main(){
    val personalComputer = Computer("960G", 16, "AMD")
    val mpcComputer = Computer("500GB", 8, "Intel")
    val softexComputer = mpcComputer.copy()
    val senacComputer = personalComputer.copy()

    if(softexComputer == mpcComputer) println("Hashcode ${softexComputer.core} ${softexComputer.hashCode()}")
    if(senacComputer == personalComputer) println("Hashcode: ${senacComputer.core} ${senacComputer.hashCode()}")
}