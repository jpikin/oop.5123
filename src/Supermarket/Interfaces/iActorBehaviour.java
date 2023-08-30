package Supermarket.Interfaces;

import Supermarket.Classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public boolean isReturnOrder();
    public boolean isTakeBackMoney();
    public void setTakeOrder(boolean take);
    public void setMakeOrder(boolean make);

    Actor getActor();



}
