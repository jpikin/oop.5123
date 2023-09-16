package Patterns.FabricMethod.Fabric;

import Patterns.FabricMethod.Interfaces.iGameItem;

public abstract class ItemGenerator {

    public void openReward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
