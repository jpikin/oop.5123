package Solid.Fuel;

public class PetrolEngine extends Engine{
    String engineType = "PetrolEngine";

    public PetrolEngine(String engineType) {
        super(engineType);
        this.engineType = "PetrolEngine";
    }
    public void start(){
        System.out.println("Машина заведена");
    }


}
