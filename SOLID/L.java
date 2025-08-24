package SOLID;

public class L {
    //Subtypes must be substitutable for their base types
    //Liskov Substitution Principle
    //subclass should extend the capability of parent class, not narrow it
}

//without LSP
 interface bike {
    void turnOnEngine();
    void accelerate();    
}

class MotorBike implements bike{
    public void turnOnEngine(){
        //turn on engine
    }

    public void accelerate(){
        //accelerate
    }
}

class Bicycle implements bike{
    public void turnOnEngine(){
        throw new UnsupportedOperationException();
    }

    public void accelerate(){
        //accelerate
    }
}

//with LSP
 interface bikeLSP {
    void accelerate();
}

interface EngineBike extends bikeLSP{
    void turnOnEngine();
}

class MotorBikeLSP implements EngineBike{
    public void turnOnEngine(){
        //turn on engine
    }

    public void accelerate(){
        //accelerate
    }
}

class BicycleLSP implements bikeLSP{
    public void accelerate(){
        //accelerate
    }
}

