package Solid.Fuel;

public class Engine {
    String engineType;
    public Engine(){
        this.engineType = PetrolEngine.engineType;
    }
    public void start(){
        System.out.println("Машина заведена");
    }
}
