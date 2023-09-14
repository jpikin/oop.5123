package Solid.Fuel;

public class Engine implements PetrolEngine{
    String engineType;
    public Engine(){
        this.engineType = setEngine();
    }
    public void start(){
        System.out.println("Машина заведена");
    }

    @Override
    public String setEngine() {
        return PetrolEngine.engineType;
    }
}
