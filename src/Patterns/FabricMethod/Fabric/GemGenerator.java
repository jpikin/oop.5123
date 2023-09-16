package Patterns.FabricMethod.Fabric;

import Patterns.FabricMethod.Interfaces.iGameItem;
import Patterns.FabricMethod.Product.GemReward;

public class GemGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GemReward();
    }

}
