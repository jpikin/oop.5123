package Solid.Vehicle;

public class SpeedCalculation {
    private double koef;
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * koef;

    }
}
