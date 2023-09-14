package Solid.Vehicle;


public class Car extends Vehicle{
    int maxSpeed;
    String type = "Car";
    public Car(int maxSpeed) {
        super(maxSpeed);
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }

    @Override
    public double calculateAllowedSpeed(){
        return getMaxSpeed() * 0.8;
    }
}

