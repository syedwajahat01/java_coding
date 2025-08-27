package DesignPatterns.Strategy.WithStrategyPattern;

import DesignPatterns.Strategy.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
    
}
