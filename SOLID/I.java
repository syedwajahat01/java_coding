package SOLID;

public class I {
    //Clients should not be forced to depend upon interfaces that they do not use
    //Interface Segregation Principle
}

//without ISP
interface RestaurantEmployee{
    void cookFood();
    void serveFood();
    void cleanRestaurant();    
}

class Chef implements RestaurantEmployee{
    public void cookFood(){
        //cook food
    }

    public void serveFood(){
        throw new UnsupportedOperationException();
    }

    public void cleanRestaurant(){
        throw new UnsupportedOperationException();
    }
}

//with ISP
interface Cook{
    void cookFood();
}

interface Server{
    void serveFood();
}

interface Cleaner{
    void cleanRestaurant();
}

class ChefISP implements Cook{
    public void cookFood(){
        //cook food
    }
}

class ServerISP implements Server{
    public void serveFood(){
        //serve food
    }
}

class CleanerISP implements Cleaner{
    public void cleanRestaurant(){
        //clean restaurant
    }
}
