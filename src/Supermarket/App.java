package Supermarket;

import Supermarket.Classes.*;
import Supermarket.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Boris", false);
        iActorBehaviour client2 = new SpecialClient("mr. Prezident", 1, false);
        iActorBehaviour client3 = new TaxInspector();
        iActorBehaviour client4 = new StockClient("Maxim", 1);
        iActorBehaviour client5 = new StockClient("Marina", 2);
        iActorBehaviour client6 = new OrdinaryClient("Sergey", true);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);

        magnit.update();
    }
}
