package Solid.Vehicle;


public class GetSpeedCalculation extends SpeedCalculation{

    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * koefVehicle(vehicle.getType());
    }
    public double koefVehicle(String type){
        if(type.equalsIgnoreCase("Bus")){
            return 0.6;
        }
        if(type.equalsIgnoreCase("Car")){
            return 0.8;
        }
        return 0.0;
    }
}
