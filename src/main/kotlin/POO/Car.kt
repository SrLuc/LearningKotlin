package POO

class Car {
    private var engine:Boolean = false;

    fun turnOn(){
        engine = !false
    }

    fun turnOff(){
        engine = !true
    }

    fun status():String{
        return if(engine) "Engine TurnOn" else "Engine TurnOff"
    }

}