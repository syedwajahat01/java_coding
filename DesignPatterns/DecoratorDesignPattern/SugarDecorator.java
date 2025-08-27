package DesignPatterns.DecoratorDesignPattern;

// Step 4: Concrete Decorators
public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return super.getDescription() + " sugar";
    }

    public double getCost(){
        return super.getCost() + 0.5;
    }
}
