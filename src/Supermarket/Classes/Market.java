package Supermarket.Classes;

import java.util.List;
import java.util.ArrayList;

import Supermarket.Interfaces.iActorBehaviour;

import Supermarket.Interfaces.iMarketBehaviour;
import Supermarket.Interfaces.iQueueBehaviour;
import Supermarket.Interfaces.iReturnOrder;
import static Supermarket.Classes.StockClient.countStockClient;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

    public int sumStockClients = 0;

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * @apiNote Метод сообщает, что в магазин зашел клиент.
     * Если клиент относится к группе акционные, то счетчик countStockClient увеличивается на 1.
     * @param actor Клиент
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        if (actor instanceof StockClient) {
            countStockClient += 1;
            System.out.println(actor.getActor().getName() + " клиент пришел в магазин," +
                    " количество участников акции: "+ countStockClient);
        }else{System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");}
        takeInQueue(actor);

    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        returnOrder();
        releaseFromQueue();
    }

    /**
     * @apiNote Метод проверяет, хочет ли клиент вернуть заказ и возвращает заказ в случае необходимости.
     */
    @Override
    public void returnOrder(){
        for (iActorBehaviour actor : queue) {
            if (actor.isReturnOrder()){
                System.out.println(actor.getActor().getName() + " клиент вернул заказ ");
            }
        }
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isReturnOrder()){
                if (actor.isMakeOrder()) {
                    actor.setTakeOrder(true);
                    System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
                }
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder() || actor.isReturnOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isReturnOrder()){
                if (!actor.isMakeOrder()) {
                    actor.setMakeOrder(true);
                    System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
                }
            }
        }
    }
}
