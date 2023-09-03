package Supermarket.Classes;

import Supermarket.Interfaces.iActorBehaviour;
import Supermarket.Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;

    public Actor(String name, boolean isReturnOrder) {
        this.name = name;
        this.isReturnOrder = isReturnOrder;
    }

    abstract public void setName(String name);
    abstract public String getName();

}
