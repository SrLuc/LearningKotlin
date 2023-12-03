package POO

//heritage
open class Dog {
    open fun sayHello(){
        println("Huf Huf")
    }

}
class Yorkshire() : Dog() {
    override fun sayHello() {
        println("Wif Wif")
    }
}

//heritage with constructor
open class Cat(val name:String, val origin:String){
    open fun sayHello(){
        println("the $name is from $origin")
    }
}
class SphinxCat():Cat("Sphinx","Egypt"){
    override fun sayHello(){
        println("$name is from $origin")
    }
}

fun main(){
    val lupy = Yorkshire()
    val snop = Dog()
    //lupy.sayHello()
    //snop.sayHello()

    val ban:Cat = Cat("ban","Persia")
    val anita:Cat = Cat("anita","Siberia")
    val hamunptrar = SphinxCat()
    //ban.sayHello()
    //anita.sayHello()
    //hamunptrar.sayHello()

    

}