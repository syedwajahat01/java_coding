package DesignPatterns.DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return super.getDescription()  + ", milk ";
    }

    public double getCost(){
        return super.getCost() + 1.5;
    }
}
