package WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        //drive vehicle
        System.out.println("Sport driving capability");
    }
    
}
