package SOLID;

public class D {
    //High-level modules should not depend on low-level modules
    //Both should depend on abstractions
    //Abstractions should not depend on details
}

//without DIP
class Macbook{
    private final String model;
    public Macbook(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void connectToCharger(){
        //connect to mac charger
    }
    
    public void charge(){
        //charge macbook
    }
}


//with DIP
interface Charger{
    void connect();
}

class MacCharger implements Charger{
    public void connect(){
        //connect to mac charger
    }
}

class WindowsCharger implements Charger{
    public void connect(){
        //connect to windows charger
    }
}

class Laptop{
    private final String model;
    private final Charger charger;

    public Laptop(String model, Charger charger){
        this.model = model;
        this.charger = charger;
    }

    public String getModel(){
        return model;
    }

    public void chargeLaptop(){
        charger.connect();
        //charge laptop
    }
}