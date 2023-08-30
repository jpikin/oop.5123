package Supermarket;

import Supermarket.Classes.Actor;
import Supermarket.Classes.Market;
import Supermarket.Classes.OrdinaryClient;
import Supermarket.Classes.SpecialClient;
import Supermarket.Classes.TaxInspector;
import Supermarket.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.update();
    }
}
