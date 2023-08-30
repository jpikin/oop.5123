package VendingMachine.Domen;

public class HotDrink extends Product{
    private int temperature;

    public HotDrink(String name, int price, int temperature){
        super(name, price);
        this.temperature = temperature;
    }

    public int getDrinkTemperature(){
        return temperature;
    }

    public void setDrinkTemperature(){
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        return super.toString()+" temperature="+this.temperature;
    }
}
