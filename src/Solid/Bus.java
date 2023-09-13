package Solid;

public class Bus extends Vehicle{

    int maxSpeed;
    String type = "Bus";
    public Bus(int maxSpeed) {
        super(maxSpeed);
        this.type = type;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }
}
