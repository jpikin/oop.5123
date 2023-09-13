package Solid.Vehicle;


public class Car extends Vehicle{
    private int maxSpeed;
    private String type;
    private double speedCoefficient;
    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.type = "Car";
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }

    @Override
    public double GetSpeedCoefficient() {
        return this.speedCoefficient;
    }
}

