package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehavior, MarketBehaviour {
    private  List <Actor> orders = new ArrayList<>();
    private  Queue <Actor> que = new ArrayDeque<>();


    @Override
    public void acceptToMarket(Actor actor) {
        orders.add(actor);
        System.out.println(actor.getName() + " Вошел в супермаркет");

    }

    @Override
    public void takeInQueue(Actor actor) {

        que.add(actor);
        System.out.println(actor.getName() + " Занял место в очереди");

    }

    @Override
    public void takeOrders() {
        que.peek().isTakeOrder();
        System.out.println(que.peek().getName() + " Сделал заказ");

    }

    @Override
    public void giveOrders() {
        que.peek().isMakeOrder();
        System.out.println(que.peek().getName() + " Получил заказ");

    }
    @Override
    public void realiseQueue() {

        System.out.println(que.peek().getName() + " Покинул очередь");
        que.poll();

    }

    @Override
    public void realizeFromMarket(Actor actor) {
        orders.remove(actor);
        System.out.println(actor.getName() + " Покинул супермаркет");
    }

    @Override
    public void update(Actor actor) {
        acceptToMarket(actor);
        takeInQueue(actor);
        takeOrders();
        giveOrders();
        realiseQueue();
        realizeFromMarket(actor);


    }
}


