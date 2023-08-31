package Supermarket.Classes;

import Supermarket.Interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder;
    private boolean isTakeBackMoney;


    public TaxInspector() {
        this.name = "Tax audit";
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isReturnOrder() {return isReturnOrder; }

    @Override
    public boolean isTakeBackMoney() {return isTakeBackMoney; }

    @Override
    public void setTakeOrder(boolean take) {
        isTakeOrder=take;
    }

    @Override
    public void setMakeOrder(boolean make) {
        isMakeOrder = make;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name, isReturnOrder);
    }


}
