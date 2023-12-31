package Supermarket.Classes;

import Supermarket.Interfaces.iActorBehaviour;
import Supermarket.Interfaces.iReturnOrder;

public class StockClient implements iActorBehaviour {

    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder;
    private boolean isTakeBackMoney;
    public static int countStockClient;
    public static int maxNumStockClient = 4;
    private int idStockClient;
    private String name;
    private boolean returnOrder;

    public StockClient(String name, int idStockClient) {
        this.name = name;
        this.idStockClient = idStockClient;
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
    public boolean isReturnOrder() {
        return isReturnOrder;
    }

//    @Override
//    public boolean isTakeBackMoney() {
//        return isTakeBackMoney;
//    }


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
        return new OrdinaryClient(name, returnOrder);
    }


}
