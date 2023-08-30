package Supermarket.Interfaces;

import Supermarket.Classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public boolean isReturnOrder();
    public void setTakeOrder(boolean take);
    public void setMakeOrder(boolean make);
    public void setReturnOrder(boolean returN);
    Actor getActor();

    void setGetBackMoney(boolean b);
}
