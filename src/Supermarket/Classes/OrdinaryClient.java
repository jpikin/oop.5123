package Supermarket.Classes;

public class OrdinaryClient extends Actor {

    // private boolean isTakeOrder;
    // private boolean isMakeOrder;

    public OrdinaryClient(String name, boolean returnOrder) {
        super(name, returnOrder);
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isReturnOrder() { return super.isReturnOrder; }

    public boolean isTakeBackMoney() { return super.isTakeBackMoney; }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public void returnOrder(boolean returnOrder) { super.isReturnOrder = returnOrder; }

    public Actor getActor()
    {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
