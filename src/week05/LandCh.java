package week05;

import java.util.ArrayList;
import java.util.List;

public class LandCh implements Subject{
    private int price;
    private List<Subscriber> subscribers;

    public LandCh() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void notifySubscriber() {
        subscribers.forEach(s -> s.update());
    }

    public void setPrice(int price) {
        this.price = price;
        notifySubscriber();
    }
}
