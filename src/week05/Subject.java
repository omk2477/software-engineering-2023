package week05;

public interface Subject {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber();

    int getPrice();
}
