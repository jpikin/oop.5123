package Supermarket.Interfaces;

import java.util.List;

import Supermarket.Classes.Actor;

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
