package DesignPatterns.DecoratorDesignPattern;

// Step 3: Base Decorator
abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    public double getCost(){
        return decoratedCoffee.getCost();
    }
}
