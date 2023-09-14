package Solid.Fuel;

public class Engine {
    String engineType;
    public Engine(String engineType){
        this.engineType = engineType;
    }
    public void start(){
        System.out.println("Машина заведена");
    }
}
