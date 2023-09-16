package Patterns.FabricMethod.Fabric;

import Patterns.FabricMethod.Interfaces.iGameItem;
import Patterns.FabricMethod.Product.GoldReward;

public class GoldGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }

}
