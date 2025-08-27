package DesignPatterns.Strategy.WithStrategyPattern;

import DesignPatterns.Strategy.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
