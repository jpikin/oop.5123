package Solid.Vehicle;
import Solid.Vehicle.Vehicle;

public class CalculateAllowedSpeed {
    public double calculateAllowedSpeed(Vehicle vehicle){
        return vehicle.getMaxSpeed() * vehicle.GetSpeedCoefficient();
    }
}
