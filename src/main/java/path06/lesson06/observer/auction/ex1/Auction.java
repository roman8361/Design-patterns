package path06.lesson06.observer.auction.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Auction.
 *
 * @author Ilya_Sukhachev
 */
public class Auction implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private String name;

    public Auction(String name) {
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(observer -> observer.showMessage(name + " We have new course!"));
    }
}
