package Supermarket.Interfaces;

import Supermarket.Classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public boolean isReturnOrder();
//    public void isTakeBackMoney(boolean takeMoney);
    public void setTakeOrder(boolean take);
    public void setMakeOrder(boolean make);

    Actor getActor();



}
