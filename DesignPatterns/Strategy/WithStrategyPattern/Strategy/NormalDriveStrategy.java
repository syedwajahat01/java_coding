package DesignPatterns.Strategy.WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        //drive vehicle
        System.out.println("Normal driving capability");
    }
    
}
