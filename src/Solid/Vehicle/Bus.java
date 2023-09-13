package Solid.Vehicle;

public class Bus extends Vehicle{

    private int maxSpeed;
    private String type;
    private double speedCoefficient;
    public Bus(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.type = "Bus";
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
