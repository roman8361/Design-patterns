package path06.lesson06.observer.auction.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Auction.
 *
 * @author Ilya_Sukhachev
 */
public class Auction implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private Map<Event, List<Observer>> eventMap = new HashMap<>();
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

    @Override
    public void registerObserverForEvent(Observer observer, Event event) {
        if (eventMap.get(event) != null) {
            eventMap.get(event).add(observer);
        } else {
            List<Observer> observers = new ArrayList<>();
            observers.add(observer);
            eventMap.put(event, observers);
        }
    }

    // Observer c фильтрацией
    @Override
    public void notifyByEvent(Event event) {
        for (Observer observer : eventMap.get(event)) {
            observer.showMessage(event.toString());
        }
    }


}
