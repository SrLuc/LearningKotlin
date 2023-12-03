
data class Computer(var memorySSD:String, var memoryRAM: Int, var core:String, private var acess:Boolean) {

   open fun giveAcess(){
        acess = true
        println("Now you have access to $core Company Computer")
    }
}


fun main(){
    val personalComputer = Computer("960G", 16, "AMD", true)
    val companyComputer = Computer("500GB", 8, "Intel" ,false)
    val softexComputer = companyComputer.copy()
    val senacComputer = companyComputer.copy()

    //if(softexComputer == companyComputer) println("Hashcode ${softexComputer.core} ${softexComputer.hashCode()}")
    //if(senacComputer == softexComputer) println("Hashcode ${softexComputer.core} ${softexComputer.hashCode()}")

    softexComputer.giveAcess()
    senacComputer.giveAcess()
}