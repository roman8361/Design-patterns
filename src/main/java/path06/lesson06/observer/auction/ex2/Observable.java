package path06.lesson06.observer.auction.ex2;

/**
 * Observable.
 *
 * @author Ilya_Sukhachev
 */
public interface Observable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();

    void registerObserverForEvent(Observer observer, Event event);

    void notifyByEvent(Event event);
}
